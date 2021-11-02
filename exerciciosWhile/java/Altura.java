import java.util.Scanner;
public class Altura{
    public static void main (String[] args){
        Scanner in = new Scanner (System.out.println);
        int i=0, j=134, p=145;
        double altjo, altpe;
        while (i<0){
             System.out.println("Insira quanto Joao cresce por ano");
             altjo = in.nextInt();
              System.out.println("Insira quanto Pedro cresce por ano");
              altpe = in.nextInt();
              j=(j+2.5);
              p(p+2);
              i=(i+1);
        }
         System.out.println(+i+"Anos para Joao ficar mais alto que Pedro");
    }
}