/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author hernando
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(service.CarritoComprasFacadeREST.class);
        resources.add(service.CatalogoFacadeREST.class);
        resources.add(service.CategoriaFacadeREST.class);
        resources.add(service.CuentaFacadeREST.class);
        resources.add(service.DepartamentoFacadeREST.class);
        resources.add(service.DomicilioCuentasFacadeREST.class);
        resources.add(service.DomicilioProveeFacadeREST.class);
        resources.add(service.FacturaFacadeREST.class);
        resources.add(service.InventarioComprasFacadeREST.class);
        resources.add(service.ItemCarritoFacadeREST.class);
        resources.add(service.ItemFacadeREST.class);
        resources.add(service.MunicipioFacadeREST.class);
        resources.add(service.PagoFacadeREST.class);
        resources.add(service.PedidoFacadeREST.class);
        resources.add(service.ProductoFacadeREST.class);
        resources.add(service.ProveedorFacadeREST.class);
        resources.add(service.TipoDocumentoFacadeREST.class);
        resources.add(service.UsuarioFacadeREST.class);
    }
    
}
