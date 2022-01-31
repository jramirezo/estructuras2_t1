import structures.*;

public class Main {

    public static void main(String[] args) {
        Cola c1 = new Cola();
        boolean result = false;


        c1.insertarElemento(1);
        c1.insertarElemento(2);
        c1.insertarElemento(3);

        System.out.println("Cola creada: " + c1.print());

        System.out.println("Eliminar posicion : " + c1.eliminarElemento(2));
        System.out.println(c1.print());
    }
}
