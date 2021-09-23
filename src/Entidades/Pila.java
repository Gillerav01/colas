package Entidades;

public class Pila {
    private Nodo cima;
    
    public Pila (){
        cima = null;
    }

    public Pila(Nodo cima) {
        this.cima = cima;
    }

    public Nodo getCima() {
        return cima;
    }

    public void setCima(Nodo cima) {
        this.cima = cima;
    }
    
    public int top(){
        return cima.getInfo();
    } 
    
    public int pop(){
        int ret = 0;
        if (!esVacia()) {
            ret = this.getCima().getInfo();
            cima = cima.getSig();
        }
        return ret;
    }
    
    public void push (int x) {
        Nodo nuevo = new Nodo(x, null);
        if (esVacia()) {
            this.setCima(nuevo);
        } else {
            nuevo.setSig(cima);
            this.setCima(nuevo);
        }
    }
    
    public boolean esVacia(){
        return cima == null;
    }
    
    public Pila mezclar (Pila a, Pila b) {
        Pila nueva = new Pila();
        
        if (!a.esVacia() || !b.esVacia()) {
            while (a.getCima() != null || b.getCima() != null) {
                nueva.push(a.pop());
                nueva.push(b.pop());                
            }
        }
        return nueva;
    }
    
        public void leer () {
        Nodo aux = cima;
        System.out.println( "\n" + " --------------------" + "\n");
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getSig();
        }
        System.out.println( "\n" + " --------------------" + "\n");
    }
    
}
