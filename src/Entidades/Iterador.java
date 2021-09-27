package Entidades;

public class Iterador {
    
    private Lista lista;
    private Nodo actual;

    public Iterador(Lista l) {
        lista = l;
        actual = l.getPrim();
    }

    public Lista getLista() {
        return lista;
    }

    public void setLista(Lista lista) {
        this.lista = lista;
    }

    public Nodo getActual() {
        return actual;
    }

    public void setActual(Nodo actual) {
        this.actual = actual;
    }
    
    // boolean hasNext, Nodo next, int dameValor
    
    public boolean hasNext (){
        return actual != null;
    }
    
    public Nodo next (){
        return actual.getSig();
    }
    
    public int dameValor(){
        return actual.getInfo();
    }
    
    public void inicializar(){
        this.actual = lista.getPrim();
    }
    
}
