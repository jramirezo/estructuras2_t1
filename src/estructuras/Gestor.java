package estructuras;

import java.util.Objects;

public class Gestor {

    private Cola cola;

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
}
