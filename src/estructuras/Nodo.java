package estructuras;

import java.util.Objects;

public class Nodo {

    private int valor;
    private Nodo siguiente;

    public Nodo(int valor, Nodo siguiente) {
        this.valor = valor;
        this.siguiente = siguiente;
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public Nodo(){
        this.valor = 0;
        this.siguiente = null;
    };

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public String print() {
        String msj = "";

        msj = this.valor + "";
        if (!Objects.isNull(this.getSiguiente())) {
            msj += "," + this.getSiguiente().print();
        }
        return msj;
    }
}
