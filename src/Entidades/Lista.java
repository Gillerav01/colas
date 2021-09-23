package Entidades;

import Entidades.Nodo;

public class Lista {
    private Nodo prim;

    public Lista() {
        this.prim = null;
    }

    public Nodo getPrim() {
        return prim;
    }

    public void setPrim(Nodo prim) {
        this.prim = prim;
    }
    
    // TODOO Leer, repetido
    
    public boolean esVacia() {
        return this.prim == null;
    }
    
    public void añadir (int x){
        Nodo nuevo = new Nodo (x, null);
        if (this.esVacia()) {
            prim = nuevo;
        } else {
            nuevo.setSig(prim);
            prim = nuevo;
        }
    }
    
    public boolean existe (int x){
        
        Nodo aux = prim;
        
        while (aux.getSig() != null){
            if (aux.getInfo() == x) {
                return true;
            }
            aux = aux.getSig();
        }
        return false;
    }
    
    public int repetido(int x) {
        int repeticiones = -1;
        Nodo aux = prim;
        while (aux.getSig() != null) {
            if (x == aux.getInfo()) {
                repeticiones = repeticiones + 1;
            }
            aux = aux.getSig();
        }
        return repeticiones;
    }
    
    public void leer () {
        Nodo aux = prim;
        System.out.println( "\n" + " --------------------" + "\n");
        while (aux != null) {
            System.out.println(aux.getInfo());
            aux = aux.getSig();
        }
        System.out.println( "\n" + " --------------------" + "\n");
    }
    
    public boolean borrar (int x) {
        Nodo aux = prim;
        Nodo ant = null;
        boolean encontrado = false;
            while (aux != null) {
                if (aux.getInfo() == x){
                    if (ant == null){
                        this.prim = aux.getSig();
                    } else {
                    ant.setSig(aux.getSig());
                    }
                    encontrado = true;
                } else ant = aux;
                aux = aux.getSig();
        }
        return encontrado;  
    }
 }
