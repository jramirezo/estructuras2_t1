package estructuras;

public class Gestor {

    private Cola cola;

    public Gestor() {
        cola = new Cola();
    }

    public void insertarEnCola(int valor) {
        cola.insertarElemento(valor);
    }

    public void atenderCola(int valor) {

    }

    public String imprimirCola() {
        return cola.print();
    }
}
