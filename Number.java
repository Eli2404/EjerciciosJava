package ejercicios;
import java.util.Scanner;
/**
 *
 * @author ela24
 */
public class Number {

    /**
     * @param args the command line arguments
     */
        // TODO code application logic 
 public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Numero el cual se quiere checar:");
        n = s.nextInt();
        if(n % 2 == 0)
        {
            System.out.println("El numero dado "+n+" es par ");
        }
        else
        {
            System.out.println("El numero dado "+n+" es impar ");
	}
    }
}