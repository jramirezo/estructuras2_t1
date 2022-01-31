package structures;

import java.util.Objects;

public class Nodo {

    private int info;
    private Nodo siguiente;

    public Nodo(int info, Nodo siguiente) {
        this.info = info;
        this.siguiente = siguiente;
    }

    public Nodo(int info) {
        this.info = info;
        this.siguiente = null;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public String print() {
        String msj = "";

        msj = this.info + "";
        if (!Objects.isNull(this.getSiguiente())) {
            msj += "," + this.getSiguiente().print();
        }
        return msj;
    }
}
