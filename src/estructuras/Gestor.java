package estructuras;

import java.util.Objects;

public class Gestor {

    private Cola cola;

    private static Pila pila = new Pila();

    public Gestor() {
        cola = new Cola();
    }

    public void insertarEnCola(int valor) {
        cola.insertarElemento(valor);
    }

    public boolean atenderCola() {
        Nodo inicio = cola.atender();

        if (Objects.nonNull(inicio)) {
            return true;
        }
        return false;
    }

    public String imprimirCola() {
        return cola.print();
    }

    public boolean pushPila(int dato){
        boolean agregado = pila.push(dato);
        return agregado;
    }

    public String imprimirPila(){
        return pila.listar();
    }

    public int popPila(){
        return pila.pop();
    }
}
