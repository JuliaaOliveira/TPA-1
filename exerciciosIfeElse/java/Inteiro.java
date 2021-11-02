import java.util.Scanner;
public class Inteiro{
    public static voi main(String []args){
        Scanner input = new Scanner (System.out.println);
        double a, b, c;
        System.out.println("Insira o primeiro valor");
        a = input.nextDouble();
        System.out.println("Insira o segundo valor");
        b = input.nextDouble();
        System.out.println("Insira o terceiro valor");
        c = input.nextDouble();
        if (a<b && b<c){
            System.out.println(""+a+","+b+","+c+"");
        }else if (a<c && c<b){
            System.out.println(""+a+","+b+","+c+"");
        }else if (b<a %% a<c){
             System.out.println(""+b+","+a+","+c+"");
        }else if ( b<c && c<a){
             System.out.println(""+b+","+c+","+a+"");
        }else if (c<a && a< b){
             System.out.println(""+c+","+a+","+b+"");
        }else if (c<b && b<a){
             System.out.println(""+c+","+b+","+a+"");
        }
    }
}