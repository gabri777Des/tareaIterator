import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        ArrayList<RegistroProducto> listProducto = new ArrayList<>();
        Scanner po = new Scanner(System.in);
        boolean continuar = true;

        while (continuar){
            System.out.println("Ingrese el ID del producto");
            int idProdu = po.nextInt();
            po.nextLine();

            System.out.println("Ingrese el nombre del producto");
            String nombreProdu = po.nextLine();
            System.out.println("Ingrese el nombre de la marca");
            String nombreMarca = po.nextLine();
            System.out.println("Ingrese el precio del producto");
            double precioProduc = po.nextDouble();

            RegistroProducto prod = new RegistroProducto(idProdu,nombreProdu,nombreMarca,precioProduc);

            listProducto.add(prod);

            System.out.println("¿Quieres continuar agregando un producto? (s/n)");
            String respuesta = po.next();

            if (!respuesta.equalsIgnoreCase( "s")){
                continuar = false;
            }
        }

        System.out.println("Lista de Productos registrados: ");
        Iterator<RegistroProducto> iteratorProdu = listProducto.iterator();
        while (iteratorProdu.hasNext()){
            RegistroProducto producto = iteratorProdu.next();
            System.out.println(producto);
        }

    }
}
