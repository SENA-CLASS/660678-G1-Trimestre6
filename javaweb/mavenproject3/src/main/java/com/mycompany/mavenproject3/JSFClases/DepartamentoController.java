package com.mycompany.mavenproject3.JSFClases;

import com.mycompany.mavenproject3.Departamento;
import com.mycompany.mavenproject3.JSFClases.util.JsfUtil;
import com.mycompany.mavenproject3.JSFClases.util.JsfUtil.PersistAction;
import com.mycompany.mavenproject3.sessionBeans.DepartamentoFacade;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.inject.Named;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.view.ViewScoped;

@Named("departamentoController")
@ViewScoped
public class DepartamentoController implements Serializable {

    @EJB
    private com.mycompany.mavenproject3.sessionBeans.DepartamentoFacade ejbFacade;
    private List<Departamento> items = null;
    private List<Departamento> itemsBsucados = null;
    private Departamento selected;
    private Departamento selectedBuscados;

    private Integer idDepBuscar;
    private String nombreDepBuscar;

    public DepartamentoController() {
    }

    public Departamento getSelected() {
        return selected;
    }

    public void setSelected(Departamento selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private DepartamentoFacade getFacade() {
        return ejbFacade;
    }

    public Departamento prepareCreate() {
        selected = new Departamento();

        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("DepartamentoCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("DepartamentoUpdated"));
    }

    public void updateBuscado() {
        persist(PersistAction.UPDATEBUSCADO, ResourceBundle.getBundle("/Bundle").getString("DepartamentoUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("DepartamentoDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void destroyBuscado() {
        persist(PersistAction.DELETEBUSCADO, ResourceBundle.getBundle("/Bundle").getString("DepartamentoDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selectedBuscados = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<Departamento> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    public List<Departamento> findByID() {
        nombreDepBuscar = null;
        itemsBsucados = getFacade().findById(idDepBuscar);
        items = null;
        return itemsBsucados;

    }

    public List<Departamento> findByNombre() {
        try {
            idDepBuscar = null;
            itemsBsucados = getFacade().findByParteNombre(nombreDepBuscar);
            items = null;
            
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

        return itemsBsucados;
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
        if (selectedBuscados != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETEBUSCADO) {
                    getFacade().edit(selectedBuscados);
                    
                } else {
                    getFacade().remove(selectedBuscados);
                    itemsBsucados=null;
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

    public Departamento getDepartamento(java.lang.Integer id) {
        return getFacade().find(id);
    }

    public List<Departamento> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Departamento> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    public com.mycompany.mavenproject3.sessionBeans.DepartamentoFacade getEjbFacade() {
        return ejbFacade;
    }

    public void setEjbFacade(com.mycompany.mavenproject3.sessionBeans.DepartamentoFacade ejbFacade) {
        this.ejbFacade = ejbFacade;
    }

    public List<Departamento> getItemsBsucados() {
        return itemsBsucados;
    }

    public void setItemsBsucados(List<Departamento> itemsBsucados) {
        this.itemsBsucados = itemsBsucados;
    }

    public Departamento getSelectedBuscados() {
        return selectedBuscados;
    }

    public void setSelectedBuscados(Departamento selectedBuscados) {
        this.selectedBuscados = selectedBuscados;
    }

    public Integer getIdDepBuscar() {
        return idDepBuscar;
    }

    public void setIdDepBuscar(Integer idDepBuscar) {
        this.idDepBuscar = idDepBuscar;
    }

    public String getNombreDepBuscar() {
        return nombreDepBuscar;
    }

    public void setNombreDepBuscar(String nombreDepBuscar) {
        this.nombreDepBuscar = nombreDepBuscar;
    }

    @FacesConverter(forClass = Departamento.class)
    public static class DepartamentoControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            DepartamentoController controller = (DepartamentoController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "departamentoController");
            return controller.getDepartamento(getKey(value));
        }

        java.lang.Integer getKey(String value) {
            java.lang.Integer key;
            key = Integer.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Integer value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Departamento) {
                Departamento o = (Departamento) object;
                return getStringKey(o.getIdDEPARTAMENTO());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Departamento.class.getName()});
                return null;
            }
        }

    }

}
