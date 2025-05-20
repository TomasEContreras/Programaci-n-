package ej3_tallermecanico;

import java.util.ArrayList;


public class Main {

   
    public static void main(String[] args) {
      ArrayList<Reparable> naves= new ArrayList();
      
      naves.add(new Auto("Fiat") {} );
      naves.add(new Moto("Honda"){});
      naves.add(new Auto("Toyota"){});
      naves.add(new Moto("Guerrero"){});
      
      for(Reparable r : naves){
         r.reparar();
      }
    }
    
}
