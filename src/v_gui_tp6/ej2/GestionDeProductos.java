
package v_gui_tp6.ej2;

import java.util.ArrayList;
import java.util.TreeSet;


public class GestionDeProductos {
    
    private TreeSet<Producto> setDeProductos;
    private int idProximo; // Variable para ID autogenerado 
    
    
    // AGREGACIÓN: GestionDeProductos ◇──────> Producto
    public GestionDeProductos() {
        
        this.setDeProductos = new TreeSet<>();
        idProximo = 1; // Inicializo contador
    }

    
    // Método que obtiene el siguiente código cada vez que es invocado desde el evento del botón Guardar.
    public int generarCodigo() {
        
        // Devuelve primero, incrementa después:
        return idProximo++;
        
        // En cambio return ++idProximo, incrementa primero.
    }
    
    
    public TreeSet<Producto> getSetDeProductos() {
        return setDeProductos;
    }

    public void setSetDeProductos(TreeSet<Producto> setDeProductos) {
        this.setDeProductos = setDeProductos;
    }

    @Override
    public String toString() {
        return "GestionDeProductos{" + "setDeProductos=" + setDeProductos + '}';
    }
    
    // ABM (Agregar, Borrar, Modificar)
    public boolean agregarProducto(Producto p){
        
        if (setDeProductos.add(p)) {
            System.out.println("Producto agregado");
            return true;
        } else {
            System.out.println("El producto ya existe");
            return false;
        }
        
    } 
       
    public boolean borrarProducto(Producto p){
        
        return setDeProductos.remove(p); 
        
        /*
        Es lo mismo que hacer:
        
        if (setDeProductos.contains(p)) {
            setDeProductos.remove(p);
            return true;
        }

        return false;
        */
        
    }
    
    // Método para el botón Actualizar:
    public boolean modificarProducto(int id, String descripcion, double precio, int stock, Rubro rubro){
    
        Producto producto = buscarPorCodigo(id);
        
        if (producto == null) {
            
            System.out.println("Producto inexistente.");
            return false;
        }
        
        
        setDeProductos.remove(producto);
          
        producto.setDescripcion(descripcion);
        producto.setPrecio(precio);
        producto.setStock(stock);
        producto.setRubro(rubro);
        
        setDeProductos.add(producto);

        return true;
        
        // El TreeSet no se reordena automáticamente si se modifica un atributo
        // que participa en el ordenamiento mientras el objeto ya está almacenado.
        // Por este motivo, dejo al int id como un atributo fijo.
        
    }    
        
    
        
    // CONSULTAS
   
    public Producto buscarPorCodigo(int id) {

        for (Producto p : setDeProductos) {
            if (p.getId() == id) {
                return p;
            }
        }

        return null;
    }
    
    
    public ArrayList<Producto> buscarPorNombre(String descripcion){
        
        ArrayList<Producto> productosEncontrados = new ArrayList<>();

        for (Producto p : setDeProductos) {
            
            if (p.getDescripcion().trim().equalsIgnoreCase(descripcion.trim())) {
                
                productosEncontrados.add(p);
            }
        }

        return productosEncontrados;

    }
    
    
    public ArrayList<Producto> buscarPorPrecio(double min, double max) {

        ArrayList<Producto> productosEncontrados = new ArrayList<>();

        for (Producto p : setDeProductos) {
            
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                
                productosEncontrados.add(p);
            }
        }

        return productosEncontrados;
    }
    
    
    public ArrayList<Producto> buscarPorRubro(Rubro rubro) {

        ArrayList<Producto> productosEncontrados = new ArrayList<>();

        for (Producto p : setDeProductos) {
            
            if (p.getRubro() == rubro) {
                
                productosEncontrados.add(p);
            }
        }

        return productosEncontrados;
    }
    
    
}
