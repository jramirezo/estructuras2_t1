package estructuras;

public class Pila {
    private Nodo header = null;
    private int longitud = 0;

    public Pila() {
    }

    public Nodo getHeader() {
        return header;
    }

    public void setHeader(Nodo header) {
        this.header = header;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean push (int pDato) {
        boolean agregado = false;
        Nodo nuevoNodo = new Nodo();
        if(esVacia()) {
            nuevoNodo.setValor(pDato);
            this.header = nuevoNodo;
            agregado = true;
        } else {
            nuevoNodo.setValor(pDato);
            nuevoNodo.setSiguiente(this.header);
            this.header = nuevoNodo;
            agregado = true;
        }
        this.longitud++;
        return agregado;
    }

    public boolean esVacia() {
        boolean vacia = false;
        if(this.longitud == 0) {
            vacia = true;
        }
        return vacia;
    }

    public String listar() {
        String datos = "";
        Nodo aux = this.header;
        int tamannio = this.longitud;
        if(!esVacia()){
            for(int i = 0; i < tamannio; i++){
                datos = datos + String.valueOf(aux.getValor()) + " ";
                aux = aux.getSiguiente();
            }
        } else {
            datos = "La pila está vacía";
        }
        return datos;
    }

    public int pop(){
        int tope = 0;
        if(!esVacia()){
            tope = header.getValor();
            this.header = this.header.getSiguiente();
            longitud--;
        }
        return tope;
    }
}
