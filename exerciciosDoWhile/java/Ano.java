import java.util.Scanner;
public class Ano{
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        int an=0, anf=0, i=1;
        System.out.println("Insira o ano inicial");
        ani =in.nextInt();
        System.out.println("Insira o ano final");
        anf =in.nextInt();
        do{
            if(ani % 4==0){
                System.out.println("O ano"+ani+"que voce digitou e um ano bissexto");
            }else{}
            an++
        }while (ani <= anf);
    }
}