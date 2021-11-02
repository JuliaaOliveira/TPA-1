import java.util.Scanner;
public class Triangulo{
    public static void main (String [] args){
        Scanner input = new Sanner (System.in);
        double a, b, c;
        System.out.println("Insira o ablor de a");
        a = input.nextDouble();
        System.out.println("Insira o valr de b");
        b = input.nextDouble();
        System.out.println("Insira o valor de c");
        c = input.nextDouble();
        if (a>b+c){
            System.out.println("Nao e um triangulo");
        }else if(b>a+c){
            System.out.println("Nao e um triangulo");
        }else if (c> a+b){
            System.out.println("Nao e um triangulo");
        }else if( a=b && b=c){
            System.out.println("Triangulo equilatero");
        }else if (a!=b && b!=c && a!=c){
            System.out.println("Triangulo escaleno");
        }else  (){
            System.out.println("Triangulo isosceles");
        }
    }
}