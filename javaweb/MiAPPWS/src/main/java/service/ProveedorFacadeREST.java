/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import edu.co.sena.pruebagit2.miappws.Proveedor;
import edu.co.sena.pruebagit2.miappws.ProveedorPK;
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
@Path("edu.co.sena.pruebagit2.miappws.proveedor")
public class ProveedorFacadeREST extends AbstractFacade<Proveedor> {
    @PersistenceContext(unitName = "edu.co.sena.pruebagit2_MiAPPWS_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    private ProveedorPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;tipoDocumentoTipoDocumento=tipoDocumentoTipoDocumentoValue;numDocumento=numDocumentoValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        edu.co.sena.pruebagit2.miappws.ProveedorPK key = new edu.co.sena.pruebagit2.miappws.ProveedorPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> tipoDocumentoTipoDocumento = map.get("tipoDocumentoTipoDocumento");
        if (tipoDocumentoTipoDocumento != null && !tipoDocumentoTipoDocumento.isEmpty()) {
            key.setTipoDocumentoTipoDocumento(tipoDocumentoTipoDocumento.get(0));
        }
        java.util.List<String> numDocumento = map.get("numDocumento");
        if (numDocumento != null && !numDocumento.isEmpty()) {
            key.setNumDocumento(numDocumento.get(0));
        }
        return key;
    }

    public ProveedorFacadeREST() {
        super(Proveedor.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(Proveedor entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") PathSegment id, Proveedor entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        edu.co.sena.pruebagit2.miappws.ProveedorPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public Proveedor find(@PathParam("id") PathSegment id) {
        edu.co.sena.pruebagit2.miappws.ProveedorPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<Proveedor> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Proveedor> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
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
