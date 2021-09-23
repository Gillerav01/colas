package Entidades;

public class Cola2 {
    private ListaFinal l;

    public Cola2() {
        this.l = new ListaFinal();
    } 

    public ListaFinal getL() {
        return l;
    }

    public void setL(ListaFinal l) {
        this.l = l;
    }
    
    public void encolar (int x) {
        l.addFin(x);
    }
    
    public int desencolar () {
        int resultado = l.getPrim().getInfo();
        if (!esVacia()) {
            l.borrarPrimero();
        }
        return resultado;
    }
    
    public int primero (){
        return l.getPrim().getInfo();
    }
    
    public boolean esVacia() {
        return l.getPrim() == null;
    }    
}
