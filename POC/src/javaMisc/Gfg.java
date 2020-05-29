package javaMisc;

/**
 * @author 212720190
 * @date Dec 1, 2019
 */
public class Gfg {
    Gfg() 
    { 
        System.out.println("Geeksforgeeks"); 
    } 
      
     Gfg a = new Gfg(); // stackoverflow error
  
    public static void main(String args[]) 
    { 
        Gfg b;
        b = new Gfg(); 
    }

}
