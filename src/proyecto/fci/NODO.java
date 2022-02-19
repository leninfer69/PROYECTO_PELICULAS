/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.fci;

/**
 *
 * @author EVOTEC
 */
public class NODO {
   private  int orden;
   private String nombre;
    private String apellido;
    private int cedula;
 private String servicio;
 private int cantidad;
 private int precio_u;
private float subtotal;
private float iva;
private float total;
private int pago;
private float deuda;

private float cambio;
private String fecha;
 private NODO izquierdo, derecho;
 
 
     public NODO(int orden, String nombre, String apellido, int cedula, String servicio, int cantidad, int precio_u, float subtotal, float iva, float total, int pago, float deuda, float cambio, String fecha) {
        this.orden = orden;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.servicio = servicio;
        this.cantidad = cantidad;
        this.precio_u = precio_u;
        this.subtotal = subtotal;
        this.iva = iva;
        this.total = total;
        this.pago = pago;
        this.deuda = deuda;
        this.cambio = cambio;
        this.fecha = fecha;
       
        this.izquierdo = null;
        this.derecho = null;
  
   
     }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio_u() {
        return precio_u;
    }

    public void setPrecio_u(int precio_u) {
        this.precio_u = precio_u;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }

    public float getDeuda() {
        return deuda;
    }

    public void setDeuda(float deuda) {
        this.deuda = deuda;
    }


    public float getCambio() {
        return cambio;
    }

    public void setCambio(float cambio) {
        this.cambio = cambio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public NODO getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NODO izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NODO getDerecho() {
        return derecho;
    }

    public void setDerecho(NODO derecho) {
        this.derecho = derecho;
    }

   
}



