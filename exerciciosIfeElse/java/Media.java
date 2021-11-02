import java.util.Scanner;
public class Media{
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        double n1, n2, n3, m, m2;
        System.out.println("Insira a primeira nota");
        n1 = input.nextDouble();
        System.out.println("Insira a sua segunda nota");
        n2 = input.nextDouble();
        m = (n1+n2/2);
         System.out.println("Sua media e"+media+);
         if (m <3){
              System.out.println("Reprovado");
         }else if (m>=6){
              System.out.println("Aprovado");
         }else if (m>=3 && m<6){
              System.out.println("Exame");
               System.out.println("Insira a sua terceira nota");
               n3 = input.nextDouble();
               m2 =(n3 + m/2);
         }if (m2>=6){
              System.out.println("Aprovado");
         }if (m2<6){
              System.out.println("Reprovado")
         }
    }
}