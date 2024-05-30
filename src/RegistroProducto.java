public class RegistroProducto {
    private int id;
    private String nombre;
    private String marca;
    private double precio;

    public RegistroProducto(){}

    public RegistroProducto(int pId, String pNombre, String pMarca, double pPrecio) {
        id = pId;
        nombre = pNombre;
        marca = pMarca;
        precio = pPrecio;
    }

    @Override
    public String toString() {
        return "Productos " + '\n'+
                 nombre + '\n'+
                 marca + '\n'+
                 precio ;
    }

    public int getId() {
        return id;
    }

    public void setId(int pId) {
        id = pId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String pNombre) {
        nombre = pNombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String pMarca) {
        marca = pMarca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double pPrecio) {
        precio = pPrecio;
    }

}
