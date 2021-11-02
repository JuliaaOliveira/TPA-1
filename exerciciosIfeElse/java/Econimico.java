import java.util.Scanner;
public class Econimico{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        double distan, capat, media;
        System.out.println("Insira a distancia percorrida em quilometros");
        distan = input.nextDouble();
        System.out.println("Insira a capacidade do tanque em litros");
        capat = input.nextDouble();
        media =( diatan / capat);
        System.out.println("A media do seu tanque e"+media+"por quilometro");
        if (media <= 10){
            System.out.println("Economico");
        }else if (media > 10){
            System.out.println("Nao economico")
        }
    }
}