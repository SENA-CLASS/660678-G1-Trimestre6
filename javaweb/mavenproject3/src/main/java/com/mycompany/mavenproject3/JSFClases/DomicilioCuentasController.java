package com.mycompany.mavenproject3.JSFClases;

import com.mycompany.mavenproject3.DomicilioCuentas;
import com.mycompany.mavenproject3.JSFClases.util.JsfUtil;
import com.mycompany.mavenproject3.JSFClases.util.JsfUtil.PersistAction;
import com.mycompany.mavenproject3.sessionBeans.DomicilioCuentasFacade;

import java.io.Serializable;
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

@Named("domicilioCuentasController")
@SessionScoped
public class DomicilioCuentasController implements Serializable {

    @EJB
    private com.mycompany.mavenproject3.sessionBeans.DomicilioCuentasFacade ejbFacade;
    private List<DomicilioCuentas> items = null;
    private DomicilioCuentas selected;

    public DomicilioCuentasController() {
    }

    public DomicilioCuentas getSelected() {
        return selected;
    }

    public void setSelected(DomicilioCuentas selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
        selected.getDomicilioCuentasPK().setCuentaTipoDocumentoTipoDocumento(selected.getCuenta().getCuentaPK().getTipoDocumentoTipoDocumento());
        selected.getDomicilioCuentasPK().setCuentaNumeroDocumento(selected.getCuenta().getCuentaPK().getNumeroDocumento());
    }

    protected void initializeEmbeddableKey() {
        selected.setDomicilioCuentasPK(new com.mycompany.mavenproject3.DomicilioCuentasPK());
    }

    private DomicilioCuentasFacade getFacade() {
        return ejbFacade;
    }

    public DomicilioCuentas prepareCreate() {
        selected = new DomicilioCuentas();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("DomicilioCuentasCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("DomicilioCuentasUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("DomicilioCuentasDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<DomicilioCuentas> getItems() {
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

    public DomicilioCuentas getDomicilioCuentas(com.mycompany.mavenproject3.DomicilioCuentasPK id) {
        return getFacade().find(id);
    }

    public List<DomicilioCuentas> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<DomicilioCuentas> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = DomicilioCuentas.class)
    public static class DomicilioCuentasControllerConverter implements Converter {

        private static final String SEPARATOR = "#";
        private static final String SEPARATOR_ESCAPED = "\\#";

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            DomicilioCuentasController controller = (DomicilioCuentasController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "domicilioCuentasController");
            return controller.getDomicilioCuentas(getKey(value));
        }

        com.mycompany.mavenproject3.DomicilioCuentasPK getKey(String value) {
            com.mycompany.mavenproject3.DomicilioCuentasPK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new com.mycompany.mavenproject3.DomicilioCuentasPK();
            key.setCuentaTipoDocumentoTipoDocumento(values[0]);
            key.setCuentaNumeroDocumento(values[1]);
            return key;
        }

        String getStringKey(com.mycompany.mavenproject3.DomicilioCuentasPK value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value.getCuentaTipoDocumentoTipoDocumento());
            sb.append(SEPARATOR);
            sb.append(value.getCuentaNumeroDocumento());
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof DomicilioCuentas) {
                DomicilioCuentas o = (DomicilioCuentas) object;
                return getStringKey(o.getDomicilioCuentasPK());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), DomicilioCuentas.class.getName()});
                return null;
            }
        }

    }

}
