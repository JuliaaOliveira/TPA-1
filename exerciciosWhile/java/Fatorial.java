import java.util.Scanner;
public class Fatorial{
    public static void main (String[] args){
        Scanner in = new Scanner (System.in);
        int fator=0, i=0;
        double n;
        while (i>=1){
             System.out.println("Insira o numero a ser calculado");
             n= in.nextInt();
             fator= fator(*n);
             i=i+1;
              System.out.println(+fator+"de"+n+);
        }
    }
}