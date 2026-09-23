
package v_gui_tp6.ej2;


public class Producto implements Comparable<Producto>{
    
    
    private final int id;
    private String descripcion;
    private double precio; // de venta al público
    private int stock;
    private Rubro rubro; // clase enum porque rubro refiere a un conjunto cerrado de posibilidades.

    public Producto(int id, String descripcion, double precio, int stock, Rubro rubro) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    public int getId() {
        return id;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }

    @Override
    public String toString() {
        return "ID: " +id+ ", " +descripcion+ ", " +precio+ ", stock:" +stock+ ", " +rubro;
    }

    @Override
    public int compareTo(Producto p) {      
          return Integer.compare(this.id, p.id);       
    }
       
    
}
