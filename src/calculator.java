/**
*Hello World, first application, only output.
*/
import java.util.Scanner;
public class calculator{
  public static void main (String [] args) {

    Scanner myInt = new Scanner(System.in);
    System.out.println("Input A :");
    int a = myInt.nextInt();
    System.out.println("Input B :");
    int b = myInt.nextInt();
    System.out.println("Hasil penjumlahan variable a dan b = "+ (a+b));
    System.out.println("Hasil pengurangan variable a dan b = "+ (a-b));
    System.out.println("Hasil peerkalian variable a dan b = "+ a*b);
    System.out.println("Hasil pembagian variable a dan b = "+ (float)a/b);


    myInt.close();

    } //end main
}//end class