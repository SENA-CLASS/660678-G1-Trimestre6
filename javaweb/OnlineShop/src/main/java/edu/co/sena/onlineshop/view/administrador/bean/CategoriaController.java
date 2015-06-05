package edu.co.sena.onlineshop.view.administrador.bean;

import edu.co.sena.onlineshop.model.entities.Categoria;
import edu.co.sena.onlineshop.view.general.util.JsfUtil;
import edu.co.sena.onlineshop.view.general.util.JsfUtil.PersistAction;
import edu.co.sena.onlineshop.contoller.administrador.beans.CategoriaFacade;

import java.io.Serializable;
import java.util.ArrayList;
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

@Named("categoriaController")
@ViewScoped
public class CategoriaController implements Serializable {

    @EJB
    private edu.co.sena.onlineshop.contoller.administrador.beans.CategoriaFacade ejbFacade;    
    private List<Categoria> items = null;
    private List<Categoria> itemsEncontrados = null;
    private Categoria selected;
    private Categoria selectedBuscados;

    private Integer idCategoriaBuscado;
    private String nombreCategoriaBuscado;
    private Boolean estadoBuscado;
    private String estadoBuscado2;
    
    private List<String> estados = new ArrayList<>();

    public CategoriaController() {
        estados.add(ResourceBundle.getBundle("/Bundle").getString("Activo"));
        estados.add(ResourceBundle.getBundle("/Bundle").getString("Inactivo"));
    }

    public Categoria getSelected() {
        return selected;
    }

    public void setSelected(Categoria selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private CategoriaFacade getFacade() {
        return ejbFacade;
    }
    
    public Categoria prepareCreate() {
        selected = new Categoria();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("CategoriaCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("CategoriaUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("CategoriaDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<Categoria> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    public List<Categoria> buscarPorId() {
        itemsEncontrados = getFacade().findById(idCategoriaBuscado);
        return itemsEncontrados;
    }
    public List<Categoria> buscarPorNombre() {
        itemsEncontrados = getFacade().findByNombre(nombreCategoriaBuscado);
        return itemsEncontrados;
    }
    
    public List<Categoria> buscarEstado() {
        itemsEncontrados = getFacade().findEstado(estadoBuscado);
        return itemsEncontrados;
    }
    public List<Categoria> buscarEstado2() {
        if(estadoBuscado2.equals(ResourceBundle.getBundle("/Bundle").getString("Activo"))) {
                estadoBuscado=true;
        }else{
                estadoBuscado=false;
        }
        itemsEncontrados = getFacade().findEstado(estadoBuscado);
        return itemsEncontrados;
    }
    
    

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected);
                    selected = null;
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

    public Categoria getCategoria(java.lang.Integer id) {
        return getFacade().find(id);
    }

    public List<Categoria> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Categoria> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    public List<Categoria> getItemsEncontrados() {
        return itemsEncontrados;
    }

    public void setItemsEncontrados(List<Categoria> itemsEncontrados) {
        this.itemsEncontrados = itemsEncontrados;
    }

    public Categoria getSelectedBuscados() {
        return selectedBuscados;
    }

    public void setSelectedBuscados(Categoria selectedBuscados) {
        this.selectedBuscados = selectedBuscados;
    }

    public Integer getIdCategoriaBuscado() {
        return idCategoriaBuscado;
    }

    public void setIdCategoriaBuscado(Integer idCAtegoriaBuscado) {
        this.idCategoriaBuscado = idCAtegoriaBuscado;
    }

    public String getNombreCategoriaBuscado() {
        return nombreCategoriaBuscado;
    }

    public void setNombreCategoriaBuscado(String nombreCategoriaBuscado) {
        this.nombreCategoriaBuscado = nombreCategoriaBuscado;
    }

    public Boolean getEstadoBuscado() {
        return estadoBuscado;
    }

    public void setEstadoBuscado(Boolean estadoBuscado) {
        this.estadoBuscado = estadoBuscado;
    }

    public List<String> getEstados() {
        return estados;
    }

    public void setEstados(List<String> estados) {
        this.estados = estados;
    }

    public String getEstadoBuscado2() {
        return estadoBuscado2;
    }

    public void setEstadoBuscado2(String estadoBuscado2) {
        this.estadoBuscado2 = estadoBuscado2;
    }

    @FacesConverter(forClass = Categoria.class)
    public static class CategoriaControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            CategoriaController controller = (CategoriaController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "categoriaController");
            return controller.getCategoria(getKey(value));
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
            if (object instanceof Categoria) {
                Categoria o = (Categoria) object;
                return getStringKey(o.getIdCategoria());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Categoria.class.getName()});
                return null;
            }
        }

    }

}
