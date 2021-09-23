package Entidades;

public class Pila2 {
    private Lista l;

    public Pila2(Lista l) {
        this.l = new Lista();
    }
    
    public int top (){
        return l.getPrim().getInfo();
    }
    
    public int pop () {
        int ret = 0;
        if (!l.esVacia()) {
            ret = l.getPrim().getInfo();
            l.setPrim(l.getPrim().getSig());
        }        
        return ret;
    }
    
    public void push (int x) {
        Nodo nuevo = new Nodo();
        if (l.esVacia())  {
           l.setPrim(nuevo);
        } else {
            nuevo.setSig(l.getPrim());
            l.setPrim(nuevo);
        }
    }
    
    
}
