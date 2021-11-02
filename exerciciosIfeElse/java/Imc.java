import java.util.Scanner;
public class Imc{
    public static vois main (String[] args){
        System input = new Scanner (System.in);
        double pes, alt, imc;
        System.out.println("Insira a sua altura");
        alt = input.nextDouble();
        System.out.println("Insira o seu peso");
        pes = input.nextDouble();
        imc =( pes / alt* alt);
        System.out.println("Seu insice de massa corporal e"+imc+);
        if (imc < 18.5){
            System.out.println("excesso de magreza");
        }else if(imc < 25){
            System.out.println("peso adequado");
        }else if(imc <30){
            System.out.println("excesso de peso");
        }else if( imc<35){
            System.out.println("Obesidade de grau 1");
        }else if (ims=c < 40){
            System.out.println("Obesidade de grau 2");
        }else if(imc >40){
            System.out.println("Obesidade de grau 3");
        }
    }
}