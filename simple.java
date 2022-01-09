import java.util.Scanner;
  
class SwapTwoNumberWithoutThirdVariable
{
   public static void main(String args[])
   {
      int c, d;
      System.out.println("Enter x and y");
      Scanner in = new Scanner(System.in);
  
      c = in.nextInt();
      d = in.nextInt();
  
      System.out.println("Before Swapping\nx = "+c+"\ny = "+d);
  
      c = c + d;
      d = c - d;
      c = c - d;
  
      System.out.println("After Swapping without third variable\nx = "+c+"\ny = "+d);
   }
}