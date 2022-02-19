/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.fci;



import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ArbolBinario {

    private NODO raiz;
    //para procesos internos
    private int cant;
    private int altura;

    public ArbolBinario() {
        raiz = null;
    }

    public NODO getRaiz() {
        return raiz;
    }

    public boolean esVacia() {
        return raiz == null;
    }

    public boolean esHoja() {
        return raiz.getIzquierdo() == null && raiz.getDerecho() == null;
    }

 public void Añadir(int orden, String nombre, String apellido, int cedula, String servicio, int cantidad, int precio_u, float subtotal, float iva, float total, int pago, float deuda, float cambio, String fecha) {
        NODO nuevonodo = new NODO(orden, nombre, apellido,  cedula,  servicio, cantidad, precio_u,  subtotal, iva,  total,  pago,  deuda,  cambio, fecha);
        insertar(nuevonodo, raiz);
    }
    private void insertar(NODO nuevo, NODO r) {
        if (esVacia()) {
            raiz = nuevo;
           
        } else if (nuevo.getCedula() < r.getCedula()) {
            if (r.getIzquierdo() == null) {
                r.setIzquierdo(nuevo);
            } else {
                insertar(nuevo, r.getIzquierdo());
            }
        } else if (nuevo.getCedula() > r.getCedula()) {
            if (r.getDerecho() == null) {
                r.setDerecho(nuevo);
            } else {
                insertar(nuevo, r.getDerecho());
            }
        } else {
            System.out.println("Dato " + nuevo .getCedula()+ " duplicado...");
        }

    }
    
    
    
    
    
    
    
         public boolean METODO_BUSQUEDA(int dato_buscado) { 
NODO nodo= raiz;
while (nodo!=null || dato_buscado == nodo.getCedula() ) { 
    
         
    
        if (dato_buscado == nodo.getCedula()){ 
    JOptionPane.showMessageDialog(null,"ORDEN#: "+ nodo.getOrden() + "\n NOMBRE: "+ nodo.getNombre()+ 
            " \nCEDULA: "+ nodo.getCedula()+ " \nPELICULA: " + nodo.getServicio()+ " \nDIAS_DE ARQUILER: " + nodo.getCantidad()
    + "\nPRECIO_TOTAL: "+ nodo.getTotal()) ;
        return true;
        }
       else if (dato_buscado < nodo.getCedula())
                     nodo= nodo.getIzquierdo(); 
       else 
                     nodo= nodo.getDerecho();
        
       
           
        }
 JOptionPane.showMessageDialog(null,"EL DATO NO EXISTE");
 return false;
} 
        
        
        
        

     public int nodosCompletos(NODO r) {
        if (r== null) {
            return 0;
        } else {
            if (r.getIzquierdo() != null && r.getDerecho() != null) {
                return nodosCompletos(r.getIzquierdo()) + nodosCompletos(r.getDerecho()) + 1;
            }
            return nodosCompletos(r.getIzquierdo()) + nodosCompletos(r.getDerecho());
        }
    }
    //graficar Àrbol
  /*  public void graficar()
    { GraficaArbolBinario Migrafico=new GraficaArbolBinario(this);
        JFrame ventana=new JFrame("Mi Árbol Binario");
        ventana.getContentPane().add(Migrafico);
        ventana.setDefaultCloseOperation(3);
        ventana.setSize(800,600);
        ventana.setVisible(true);
    }*/
    
    //ELIMINAR UN NODO
    private NODO encontrarMax(NODO r) {
        if (r != null) {
            while (r.getDerecho() != null) {
                r = r.getDerecho();
            }
        }
        return r;
}
private NODO encontrarMin(NODO r) {
        if (r == null) {
            return null;
        } else 
           if (r.getIzquierdo() == null) {
            return r;
        }
        return encontrarMin(r.getIzquierdo());
}
public void Eliminar(int dato) {

   
        raiz = eliminar(dato, raiz);
 
       
}
     
 
private NODO eliminar(int dato, NODO r) {
     if (r == null) {
            return r; 
           }
     if (dato < r.getCedula()) {
            r.setIzquierdo(eliminar(dato, r.getIzquierdo()));
     } else 
          if(dato> r.getCedula()) {
                   r.setDerecho(eliminar(dato, r.getDerecho()));
           } else 
                if (r.getIzquierdo() != null && r.getDerecho() != null) {
                       r.setCedula(encontrarMin(r.getDerecho()).getCedula());
                       r.setDerecho(eliminar(r.getCedula(), r.getDerecho()));
                 } else {
                       r = (r.getIzquierdo() != null) ? r.getIzquierdo() : r.getDerecho();
                           }
    
      return r;
      
    }





}
