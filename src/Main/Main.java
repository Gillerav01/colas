package Main;

import Entidades.Cola1;
import Entidades.Cola2;
import Entidades.Iterador;
import Entidades.Lista;
import Entidades.ListaFinal;
import Entidades.Pila;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Cola1 c1 = new Cola1();
//        
//        c1.encolar(1);
//        c1.encolar(2);
//        c1.encolar(3);
//        c1.encolar(4);
//        c1.encolar(5);
//        c1.encolar(6);
//        c1.encolar(7);
//        c1.encolar(8);
//        
//        System.out.println(c1.leerPrimero());
//        System.out.println(c1.desencolar());
//        System.out.println(c1.desencolar());
//        System.out.println(c1.desencolar());
//        System.out.println(c1.desencolar());
//        System.out.println(c1.desencolar());
//        
//        while (!c1.esVacia()){
//            
//                System.out.println(c1.leerPrimero());
//                c1.desencolar();
//              
//              System.out.println(c1.getPrimero().getInfo());
//              c1.setPrimero(c1.getPrimero().getSig());

//            System.out.println(c1.desencolar());
//        Cola2 c2 = new Cola2();
//
//        c2.encolar(1);
//        c2.encolar(2);
//        c2.encolar(3);
//        c2.encolar(4);
//
//        System.out.println(c2.primero());
//        System.out.println(c2.desencolar());
//        System.out.println(c2.desencolar());
//        System.out.println(c2.primero());
//        System.out.println(c2.desencolar());
//        System.out.println(c2.desencolar());
//        System.out.println(c2.desencolar());

//          Pila p1 = new Pila();
//          p1.push(3);
//          p1.push(8);
//          p1.push(5);
//          p1.push(2);
//          
//          while (!p1.esVacia()) {
//              System.out.println(p1.top());
//              p1.pop();
//          }
//          
//          if (p1.esVacia()) {
//              System.out.println("----------------------");
//              System.out.println("La lista está vacía.");
//          } else {
//              System.out.println("----------------------");
//              System.out.println("La lista contiene elementos aún.");
//          }
//
//            Pila a = new Pila ();
//            a.push(1);
//            a.push(3);
//            a.push(5);
//            a.push(7);
//            a.push(9);
//            a.push(10);
//            
//            Pila b = new Pila();
//            b.push(2);
//            b.push(4);
//            b.push(6);
//            b.push(8);
//            
//            Pila c = new Pila();
//            c = c.mezclar(a, b);
//            
//            c.leer(); 
            
              
              // 2 colas y 1 pila
              
//              Cola1 c1 = new Cola1();
//              
//              c1.encolar(1);
//              c1.encolar(3);
//              c1.encolar(4);
//              c1.encolar(5);
//              c1.encolar(6);
//              
//              Cola2 c2 = new Cola2();
//              
//              c2.encolar(2);
//              c2.encolar(7);
//              c2.encolar(8);
//              c2.encolar(9);
//              c2.encolar(10);
//            
//              Pila p = new Pila();
//              
//              p.push(c1.desencolar());
//              p.push(c2.desencolar());
//              p.push(c1.desencolar());
//              p.push(c1.desencolar());
//              p.push(c1.desencolar());
//              p.push(c1.desencolar());
//              p.push(c2.desencolar());
//              p.push(c2.desencolar());
//              p.push(c2.desencolar());
//              p.push(c2.desencolar());
//              
//              p.leer();
//              

//            Pila p = new Pila();
//            Cola1 c1 = new Cola1();
//              
//              c1.encolar(1);
//              c1.encolar(3);
//              c1.encolar(4);
//              c1.encolar(5);
//              c1.encolar(6);
//              
//            Cola2 c2 = new Cola2();
//              
//              c2.encolar(2);
//              c2.encolar(7);
//              c2.encolar(8);
//              c2.encolar(9);
//              c2.encolar(10);
//             
//              int opcion = 0;
//              Scanner in = new Scanner(System.in);
//              while (!c1.esVacia() && !c2.esVacia()){
//                  System.out.println("Introduzca el identificador de la lista de la que deseas añadir el numero (1) o (2)");
//                  opcion = in.nextInt();
//                  switch(opcion) {
//                      case 1:
//                          p.push(c1.desencolar());
//                          break;
//                      case 2:
//                          p.push(c2.desencolar());
//                          break;
//                      default:
//                          System.out.println("Seleccione una opción correcta...");
//                          break;
//                  }
//              }
//              System.out.println("El resultado final de la lista es: ");
//              p.leer();
//    }
//
//                Lista l1 = new Lista();
//                l1.añadir(5);
//                l1.añadir(8);
//                l1.añadir(3);
//                
//                Iterador it = new Iterador(l1);
//                
//                while (it.hasNext()) {
//                    System.out.println(it.dameValor());
//                    it.setActual(it.next());             
//                }
//                

//                Lista l1 = new Lista();
//                l1.añadir(5);  l1.añadir(8);  l1.añadir(3);
//                
//                Iterador it = new Iterador(l1);
//                   
//                Scanner in = new Scanner  (System.in);
//                Scanner salir = new Scanner (System.in);
//                int x = 0;
//                boolean encontrado = false;
//                System.out.println("¿Quiere buscar un numero? (Si / No)");
//                char opSalida = salir.nextLine().toLowerCase().charAt(0);
//                while (opSalida != 'n') {
//                    it.inicializar();
//                    System.out.print("Dame un numero: ");
//                    x = in.nextInt();
//                    while (it.hasNext()) {
//                        if (it.getActual().getInfo() == x){
//                            System.out.println("El numero " + x +" se ha encontrado.");
//                            encontrado = true;
//                        }
//                        it.setActual(it.next());  
//                    }
//                    if (!encontrado){
//                        System.out.println("El numero " + x + " no se ha encontrado.");
//                    }
//                    
//                    System.out.println("¿Quiere buscar un numero? (Si / No)");
//                    opSalida = salir.nextLine().toLowerCase().charAt(0);
//                }
//                
//                if (opSalida == 'n') {
//                    System.out.println("Has salido del programa.");
//                }
//
//                  ListaFinal lf = new ListaFinal();
//                  lf.add(4);
//                  lf.add(5);
//                  lf.add(6);
//                  lf.add(7);
//                  
//                  ListaFinal lf1 = new ListaFinal();
//                  
//                  lf1.add(1);
//                  lf1.add(2);
//                  lf1.add(3);
//                  
//                  System.out.println( "\n" +"-------- Lista Final 1 concatenada con Lista Final 2 ---------");
//                  lf.concatenar(lf1);
//                  lf.leer();
//                  System.out.println("\n" + "--------------------------------------------------------------");
//                  System.out.println("Lista final 2: ");
//                  lf1.leer();
//                  System.out.println("\n");
//                  
                    ListaFinal lf = new ListaFinal();
                    
                    lf.add(1);
                    lf.add(2);
                    lf.add(3);
                    lf.add(4);
                    lf.add(5);
                    lf.leer();
                    lf.reverse();
                    lf.leer();
    }
}
