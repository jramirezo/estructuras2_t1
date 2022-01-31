package ui;

import estructuras.Gestor;
import java.io.*;

public class UI {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private Gestor gestor;

    public UI () throws java.io.IOException {

        System.out.println("Bienvenido a la tarea 1 del curso estructuras de datos 2");

        boolean continuar = true;
        int opcion;
        gestor = new Gestor();

        do {
            presentarMenu();
            try {
                opcion = leerOpcion();
                continuar = ejecutarOpcion(opcion);
            } catch (Exception e) {
                opcion = -1;
                System.out.println("Error en el ingreso de datos, debe unicamente ingresar caracteres numericos");
            }
        } while (continuar);
    }

    public void presentarMenu() {
        System.out.println("------------------------------------------------");
        System.out.println("Menu de opciones");
        System.out.println("1. Insertar en lista ordenada");
        System.out.println("3. Insertar en cola FIFO");
        System.out.println("4. Atender cola FIFO");
        System.out.println("5. Push en pila");
        System.out.println("6. Pasar el tope de la pila a la cola");
        System.out.println("99. Ver estructuras");
        System.out.println("100. Salir");
        System.out.println("------------------------------------------------");
    }

    public int leerOpcion() throws java.io.IOException {
        int opcion;

        System.out.print("Ingrese un valor: ");
        opcion = Integer.parseInt(in.readLine());

        return opcion;
    }

    public boolean ejecutarOpcion(int opcion) throws IOException {
        boolean continuar = true;
        int valor;


        switch (opcion) {
            case 1://Insertar en lista ordenada

                break;

            case 3://Insertar en cola
                System.out.println("Insertando en cola");
                valor = leerOpcion();

                gestor.insertarEnCola(valor);
                System.out.println("Valor insertado con exito");
                break;

            case 4://Atender cola
                if (gestor.atenderCola()) {
                    System.out.println("Se ha atendido el primer elemento de la cola");
                } else {
                    System.out.println("No se pudo realizar la operacion");
                }
                break;

            case 5://Atender cola
                System.out.println("Insertando en pila");
                valor = leerOpcion();
                if (gestor.pushPila(valor)) {
                    System.out.println("Se ha agregado el numero con exito a la pila");
                } else {
                    System.out.println("No se pudo realizar la operacion");
                }
                break;

            case 6:
                int topePila = gestor.popPila();
                gestor.insertarEnCola(topePila);
                System.out.println("Cola: " + gestor.imprimirCola() );
                System.out.println("Pila: " +  gestor.imprimirPila());

            case 99:
                System.out.println("Mostrando estructuras de datos");
                System.out.println("Lista: " );
                System.out.println("Cola: " + gestor.imprimirCola() );
                System.out.println("Pila: " +  gestor.imprimirPila());
                break;
            case 100:
                continuar = false;
                break;

            default:
                System.out.println("Opcion incorrecta");
        }

        return continuar;
    }
}
