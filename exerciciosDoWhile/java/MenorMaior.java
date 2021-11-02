import java.util.Scanner;
public class MenorMaior{
    publc static void main (String [] args){
        Scanner in = new Scanner (System.out.in);
        int i=1, n, mr, mn, rept;
        System.out.println ("Quantos numeros voce ira multiplicar?");
        rept = in.nextInt ();
        
        System.out.println("Digite um numero");
        n = in.nextInt();
        do{
            System.out.println("Digite outro numero");
            n = in.nextInt();
            if (n > mn){
                mr=n;
            }else if (n< mn){
                mn=n
            }
            i++
        }while (i<rept){
            System.out.println(+mr+"e o maior numero")
        }
   }
}