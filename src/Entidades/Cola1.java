package Entidades;

public class Cola1 {
    private Nodo primero;
    private Nodo fin;

    public Cola1() {
        this.primero = null;
        this.fin = null;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }
    
    public boolean encolar(int x){
        Nodo nuevo = new Nodo(x, null);
        boolean encolado = false;
        if (this.esVacia()) {
            primero = nuevo;
            fin = nuevo;
            encolado = true;
        } else {
            fin.setSig(nuevo);
            fin = nuevo;
            encolado = true;
        }
        return encolado;
    }
    
    public int desencolar(){
        int x = 0;
        if (!esVacia()) {
            x = primero.getInfo();
            primero = primero.getSig();
        }
        return x;
    }
    

    
    public int leerPrimero(){
        int x = 0;
        if (!esVacia()){
            x = primero.getInfo();
        }
        return x;
    }
    
    public boolean esVacia() {
        return this.primero == null;
    }

    public Pila fusionarCola (Cola1 a, Cola1 b) {
        Pila ret = new Pila();
        
         if (!a.esVacia() || !b.esVacia()) {
                  ret.setCima(a.primero);
                  a.primero = a.primero.getSig();
                  
                  // Primero L1 1  L2 2  L1 3 4 5 6 L2 7 8 9 10
                  
         }
        
        return ret;
    }
    
}
