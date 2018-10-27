package test1;

import java.util.ArrayList;

public class Boliche {
      
protected String nombreBoliche;


public Boliche(String nombreBoliche) {
        this.nombreBoliche = nombreBoliche;
    }

    public String getnombreBoliche() {
        return nombreBoliche;
    }

    public void setnombreBoliche(String nombreBoliche) {
        this.nombreBoliche = nombreBoliche;
    }

    public Boliche(Boliche bolic) {
    
    
    //BoliList Class 
      ArrayList <Boliche> boliList = new ArrayList <Boliche>();
      
      //Instanciamos usuarios y contrasenas por ejemplo
      
      Boliche bolic0 = new Boliche("Believe BS.AS.");
      boliList.add(bolic0);
      
      Boliche bolic1 = new Boliche("Club Leloir");
      boliList.add(bolic1);
      
      Boliche bolic2 = new Boliche("Bora Bora");
      boliList.add(bolic2);
      
      Boliche bolic3 = new Boliche("Crobar");
      boliList.add(bolic3);
      
      Boliche bolic4 = new Boliche("Sucht");
      boliList.add(bolic4);
      
      Boliche bolic5 = new Boliche("Al Diablo");
      boliList.add(bolic5);
    
      for(int index=0; index <boliList.size(); index++){
          Boliche boli = boliList.get(index);
            boli.mostrar();
        }    
}
      public void mostrar(){
    
     System.out.println("Nombre del boliche:" + nombreBoliche);
    
}

}
       