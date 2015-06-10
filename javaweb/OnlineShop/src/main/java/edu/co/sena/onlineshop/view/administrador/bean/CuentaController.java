package edu.co.sena.onlineshop.view.administrador.bean;

import edu.co.sena.onlineshop.model.entities.Cuenta;
import edu.co.sena.onlineshop.view.general.util.JsfUtil;
import edu.co.sena.onlineshop.view.general.util.JsfUtil.PersistAction;
import edu.co.sena.onlineshop.contoller.administrador.beans.CuentaFacade;
import edu.co.sena.onlineshop.contoller.administrador.beans.DepartamentoFacade;
import edu.co.sena.onlineshop.model.entities.Departamento;
import edu.co.sena.onlineshop.model.entities.Municipio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.view.ViewScoped;

@Named("cuentaController")
@ViewScoped
public class CuentaController implements Serializable {

    @EJB
    private edu.co.sena.onlineshop.contoller.administrador.beans.CuentaFacade ejbFacade;
    @EJB
    private edu.co.sena.onlineshop.contoller.administrador.beans.DepartamentoFacade ejbFacadeDepartamento;
    private List<Cuenta> items = null;
    private List<Departamento> itemsDepartamento = null;
    private List<Municipio> itemsMunicipio = null;
    
    private Cuenta selected;
    private String departamentoSeleccionado;

    public CuentaController() {
    }

    public Cuenta getSelected() {
        return selected;
    }

    public void setSelected(Cuenta selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
        //selected.getCuentaPK().setTipoDocumentoTipoDocumento(selected.getTipoDocumento().getTipoDocumento());
    }

    protected void initializeEmbeddableKey() {
        selected.setCuentaPK(new edu.co.sena.onlineshop.model.entities.CuentaPK());
    }

    private CuentaFacade getFacade() {
        return ejbFacade;
    }
    
    private DepartamentoFacade getFacadeDepartamento() {
        return ejbFacadeDepartamento;
    }

    public Cuenta prepareCreate() {
        selected = new Cuenta();
        initializeEmbeddableKey();
        obtenedorDepartamentos();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("CuentaCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("CuentaUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("CuentaDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }
    
    public void obtenedorDepartamentos() {
        if(itemsDepartamento == null){
             itemsDepartamento = (List<Departamento>)getFacadeDepartamento().findAll();
        }   
    }
    
    public void obtenedorMunicipios() {
        
          Departamento dt = getFacadeDepartamento().findByNombre(departamentoSeleccionado);
          itemsMunicipio = (List<Municipio>)dt.getMunicipioCollection();
        
            
    }

    public List<Cuenta> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected);
                } else {
                    getFacade().remove(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public Cuenta getCuenta(edu.co.sena.onlineshop.model.entities.CuentaPK id) {
        return getFacade().find(id);
    }

    public List<Cuenta> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Cuenta> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    public List<Departamento> getItemsDepartamento() {
        return itemsDepartamento;
    }

    public void setItemsDepartamento(List<Departamento> itemsDepartamento) {
        this.itemsDepartamento = itemsDepartamento;
    }

    public List<Municipio> getItemsMunicipio() {
        return itemsMunicipio;
    }

    public void setItemsMunicipio(List<Municipio> itemsMunicipio) {
        this.itemsMunicipio = itemsMunicipio;
    }

    public String getDepartamentoSeleccionado() {
        return departamentoSeleccionado;
    }

    public void setDepartamentoSeleccionado(String departamentoSeleccionado) {
        this.departamentoSeleccionado = departamentoSeleccionado;
    }

    

    @FacesConverter(forClass = Cuenta.class)
    public static class CuentaControllerConverter implements Converter {

        private static final String SEPARATOR = "#";
        private static final String SEPARATOR_ESCAPED = "\\#";

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            CuentaController controller = (CuentaController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "cuentaController");
            return controller.getCuenta(getKey(value));
        }

        edu.co.sena.onlineshop.model.entities.CuentaPK getKey(String value) {
            edu.co.sena.onlineshop.model.entities.CuentaPK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new edu.co.sena.onlineshop.model.entities.CuentaPK();
            key.setTipoDocumentoTipoDocumento(values[0]);
            key.setNumeroDocumento(values[1]);
            return key;
        }

        String getStringKey(edu.co.sena.onlineshop.model.entities.CuentaPK value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value.getTipoDocumentoTipoDocumento());
            sb.append(SEPARATOR);
            sb.append(value.getNumeroDocumento());
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Cuenta) {
                Cuenta o = (Cuenta) object;
                return getStringKey(o.getCuentaPK());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Cuenta.class.getName()});
                return null;
            }
        }

    }

}
