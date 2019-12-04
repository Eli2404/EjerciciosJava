package ejercicios;
import java.util.Scanner;
/**
 *
 * @author ela24
 */
public class TextMark {

    /**
     * @param args the command line arguments
     */
        // TODO code application logic 
public static void main(String[] args)
{
int cal,op=1,op1=2,op2=3,op3=4,op4=5,op5=6,a = 0,b=0,c=0,d=0,f=0;
    
    System.out.println("Cual es la calificacion a ingresar");
    Scanner sc = new Scanner(System.in);
    cal = Integer.parseInt(sc.next());
   
    if((cal==9)||(cal==10))
        System.out.println("Salient");
    else if((cal==7)||(cal==8))
     System.out.println("Notable");
    else if(cal==6)
        System.out.println("Bien");
    else if(cal==5)
        System.out.println("Aprobado");
    else if ((cal>=0)||(cal<=4))
        System.out.println("Suspenso");
    else
        System.out.println("Error");
    switch(cal){
        case 1:
        case 2:
        case 3:
        case 4:
            System.out.println("Suspenso");
            break;
        case 5:
            System.out.println("Aprobado");
            break;
        case 6:
            System.out.println("Bien");
            break;
        case 7:
        case 8:
            System.out.println("Notable");
            break;
        case 9:
        case 10:
            System.out.println("Salient");
            break;   
        default:
            System.out.println("Error");
            break;
    }
}


}