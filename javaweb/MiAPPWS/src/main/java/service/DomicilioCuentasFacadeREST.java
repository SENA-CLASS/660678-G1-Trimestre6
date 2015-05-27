/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import edu.co.sena.pruebagit2.miappws.DomicilioCuentas;
import edu.co.sena.pruebagit2.miappws.DomicilioCuentasPK;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author hernando
 */
@Stateless
@Path("edu.co.sena.pruebagit2.miappws.domiciliocuentas")
public class DomicilioCuentasFacadeREST extends AbstractFacade<DomicilioCuentas> {
    @PersistenceContext(unitName = "edu.co.sena.pruebagit2_MiAPPWS_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    private DomicilioCuentasPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;cuentaTipoDocumentoTipoDocumento=cuentaTipoDocumentoTipoDocumentoValue;cuentaNumeroDocumento=cuentaNumeroDocumentoValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        edu.co.sena.pruebagit2.miappws.DomicilioCuentasPK key = new edu.co.sena.pruebagit2.miappws.DomicilioCuentasPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> cuentaTipoDocumentoTipoDocumento = map.get("cuentaTipoDocumentoTipoDocumento");
        if (cuentaTipoDocumentoTipoDocumento != null && !cuentaTipoDocumentoTipoDocumento.isEmpty()) {
            key.setCuentaTipoDocumentoTipoDocumento(cuentaTipoDocumentoTipoDocumento.get(0));
        }
        java.util.List<String> cuentaNumeroDocumento = map.get("cuentaNumeroDocumento");
        if (cuentaNumeroDocumento != null && !cuentaNumeroDocumento.isEmpty()) {
            key.setCuentaNumeroDocumento(cuentaNumeroDocumento.get(0));
        }
        return key;
    }

    public DomicilioCuentasFacadeREST() {
        super(DomicilioCuentas.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(DomicilioCuentas entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") PathSegment id, DomicilioCuentas entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        edu.co.sena.pruebagit2.miappws.DomicilioCuentasPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public DomicilioCuentas find(@PathParam("id") PathSegment id) {
        edu.co.sena.pruebagit2.miappws.DomicilioCuentasPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<DomicilioCuentas> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<DomicilioCuentas> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
