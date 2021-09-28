package Entidades;

public class ListaFinal {

    private Nodo prim;
    private Nodo fin;

    public ListaFinal() {
        this.prim = null;
        this.fin = null;
    }

    public Nodo getPrim() {
        return prim;
    }

    public void setPrim(Nodo prim) {
        this.prim = prim;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }

    public boolean esVacia() {
        return this.prim == null && this.fin == null;
    }

    public void add(int x) {
        Nodo nuevo = new Nodo(x, null);

        if (this.esVacia()) {
            prim = nuevo;
            fin = nuevo;
        } else {
            nuevo.setSig(prim);
            prim = nuevo;
        }
    }

    public void addFin(int x) {
        Nodo nuevo = new Nodo(x, null);
        if (this.esVacia()) {
            prim = nuevo;
            fin = nuevo;
        } else {
            fin.setSig(nuevo);
            fin = nuevo;
        }
    }

    public void leer() {
        Nodo aux = prim;
        System.out.println("\n" + "--------------------------");
        while (aux != null) {
            System.out.print(aux.getInfo() + " ");
            aux = aux.getSig();
        }
    }

    public boolean borrar(int x) {
        boolean encontrado = false;
        Nodo aux = prim;
        Nodo ant = null;

        while (aux != null) {
            if (aux.getInfo() == x) {
                if (ant == null) {
                    this.prim = aux.getSig();
                } else {
                    ant.setSig(aux.getSig());
                }
                encontrado = true;
            } else {
                ant = aux;
            }
            aux = aux.getSig();
        }

        return encontrado;
    }

    public void borrarPrimero() {
        if (!this.esVacia()) {
            this.prim = prim.getSig();
        }
    }

    public int leerPrimero() {
        int x = 0;
        if (!esVacia()) {
            x = prim.getInfo();
        }
        return x;
    }
    
    public void concatenar(ListaFinal lf) {
        Nodo aux = lf.prim;
        while (aux != null) {
            this.addFin(aux.getInfo());
            aux = aux.getSig();
        }
    }
    
    public int length () {
        int ret = 0;
        Nodo aux = this.prim;
        
        while (aux != null) {
            ret++;
            aux = aux.getSig();
        }
        return ret;
    }
    
    public void reverse () {
        ListaFinal l = this;
        Nodo aux = l.getPrim();
        this.prim = null;
        this.fin = null;
        while (aux != null) {
           this.add(aux.getInfo());
           aux = aux.getSig();
        }
    }

}
