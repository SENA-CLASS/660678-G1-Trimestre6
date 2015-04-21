/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.myonlineshop.integracion.jpa.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author hernando
 */
@Embeddable
public class InventarioComprasPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "FECHA_COMPRA")
    @Temporal(TemporalType.DATE)
    private Date fechaCompra;
    @Basic(optional = false)
    @Column(name = "PRODUCTO_ID_PRODUCTO")
    private String productoIdProducto;
    @Basic(optional = false)
    @Column(name = "PROVEEDOR_TIPO_DOCUMENTO_TIPO_DOCUMENTO")
    private String proveedorTipoDocumentoTipoDocumento;
    @Basic(optional = false)
    @Column(name = "PROVEEDOR_NUM_DOCUMENTO")
    private String proveedorNumDocumento;

    public InventarioComprasPK() {
    }

    public InventarioComprasPK(Date fechaCompra, String productoIdProducto, String proveedorTipoDocumentoTipoDocumento, String proveedorNumDocumento) {
        this.fechaCompra = fechaCompra;
        this.productoIdProducto = productoIdProducto;
        this.proveedorTipoDocumentoTipoDocumento = proveedorTipoDocumentoTipoDocumento;
        this.proveedorNumDocumento = proveedorNumDocumento;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getProductoIdProducto() {
        return productoIdProducto;
    }

    public void setProductoIdProducto(String productoIdProducto) {
        this.productoIdProducto = productoIdProducto;
    }

    public String getProveedorTipoDocumentoTipoDocumento() {
        return proveedorTipoDocumentoTipoDocumento;
    }

    public void setProveedorTipoDocumentoTipoDocumento(String proveedorTipoDocumentoTipoDocumento) {
        this.proveedorTipoDocumentoTipoDocumento = proveedorTipoDocumentoTipoDocumento;
    }

    public String getProveedorNumDocumento() {
        return proveedorNumDocumento;
    }

    public void setProveedorNumDocumento(String proveedorNumDocumento) {
        this.proveedorNumDocumento = proveedorNumDocumento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fechaCompra != null ? fechaCompra.hashCode() : 0);
        hash += (productoIdProducto != null ? productoIdProducto.hashCode() : 0);
        hash += (proveedorTipoDocumentoTipoDocumento != null ? proveedorTipoDocumentoTipoDocumento.hashCode() : 0);
        hash += (proveedorNumDocumento != null ? proveedorNumDocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventarioComprasPK)) {
            return false;
        }
        InventarioComprasPK other = (InventarioComprasPK) object;
        if ((this.fechaCompra == null && other.fechaCompra != null) || (this.fechaCompra != null && !this.fechaCompra.equals(other.fechaCompra))) {
            return false;
        }
        if ((this.productoIdProducto == null && other.productoIdProducto != null) || (this.productoIdProducto != null && !this.productoIdProducto.equals(other.productoIdProducto))) {
            return false;
        }
        if ((this.proveedorTipoDocumentoTipoDocumento == null && other.proveedorTipoDocumentoTipoDocumento != null) || (this.proveedorTipoDocumentoTipoDocumento != null && !this.proveedorTipoDocumentoTipoDocumento.equals(other.proveedorTipoDocumentoTipoDocumento))) {
            return false;
        }
        if ((this.proveedorNumDocumento == null && other.proveedorNumDocumento != null) || (this.proveedorNumDocumento != null && !this.proveedorNumDocumento.equals(other.proveedorNumDocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.co.sena.myonlineshop.integracion.jpa.entities.InventarioComprasPK[ fechaCompra=" + fechaCompra + ", productoIdProducto=" + productoIdProducto + ", proveedorTipoDocumentoTipoDocumento=" + proveedorTipoDocumentoTipoDocumento + ", proveedorNumDocumento=" + proveedorNumDocumento + " ]";
    }
    
}
