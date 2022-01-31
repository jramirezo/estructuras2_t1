package estructuras;

import java.util.Objects;

public class Cola {

    private Nodo incio;
    private Nodo fin;
    private int longitud;

    public Cola() {
        this.incio = null;
        this.fin = null;
        this.longitud = 0;
    }

    public boolean esVacia() {
        if (Objects.isNull(this.incio) && Objects.isNull(this.fin)) {
            return true;
        }
        return false;
    }

    public void insertarElemento(int info) {
        Nodo nuevoElemento = new Nodo(info);

        if (esVacia()) {
            this.incio = nuevoElemento;
        } else {
            if (Objects.isNull(this.incio.getSiguiente())) {
                this.incio.setSiguiente(this.fin);
            }
            this.fin.setSiguiente(nuevoElemento);
        }
        this.fin = nuevoElemento;
        this.longitud++;
    }

    public Nodo atender() {
        if (esVacia()) { return null; }

        Nodo aux = this.incio;

        if (this.incio == this.fin) {
            this.incio = null;
            this.fin = null;
        } else {
            this.incio = aux.getSiguiente();
        }
        this.longitud--;

        return aux;
    }

    public boolean eliminarElemento(int posicion) {
        if (!esVacia()) {
            if (posicion > 0 && posicion <= this.longitud) {

                Nodo aux = this.incio;
                Nodo siguiente = null;

                if (posicion == 1) {
                    aux = aux.getSiguiente();
                    this.incio = aux;

                    if (!Objects.isNull(aux)) {
                        siguiente = aux.getSiguiente();
                    }
                } else {
                    for (int i = 1; i < posicion - 1; i++) {
                        aux = aux.getSiguiente();
                    }
                    siguiente = (aux.getSiguiente()).getSiguiente();
                }

                if (Objects.isNull(siguiente)) {
                    this.fin = aux;
                    if (!Objects.isNull(aux)) {
                        this.fin.setSiguiente(null);
                    }
                } else {
                    aux.setSiguiente(siguiente);
                }

                this.longitud--;
                return true;
            }
        }
        return false;
    }

    public String print() {
        String msj = "";

        if ( !esVacia() ) {
            msj = "[" + this.incio.getValor();

            if (!Objects.isNull(this.incio.getSiguiente())) {
                msj += "," + this.incio.getSiguiente().print();
            }
            msj += "]";
            //msj += this.end.getInfo() + "";
        } else {
            msj = "La cola está vacía";
        }

        return msj;
    }
}
