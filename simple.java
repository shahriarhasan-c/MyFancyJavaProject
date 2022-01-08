import java.util.Scanner;


class Singleton {
    private static Singleton single_instance = null;
 
    
      public int a, b;
      System.out.println("Enter x and y");
      Scanner in = new Scanner(System.in);
  
      
    private Singleton()
    {
      a = in.nextInt();
      b = in.nextInt();
    }
 
    public static Singleton Singleton()
    {
        
        if (single_instance == null) {
            single_instance = new Singleton();
        }
        return single_instance;
    }
}
 

class simple {
    
    public static void main(String args[])
    {
        
        Singleton x = Singleton.Singleton();
 
        
 
      System.out.println("Before Swapping\nx = "+x.a+"\ny = "+x.b);
  
      x.a = x.a + x.b;
      x.b = x.a - x.b;
      x.a = x.a - x.b;
  
      System.out.println("After Swapping without third variable\nx = "+x.a+"\ny = "+x.b);
 
        
        
    }
}
