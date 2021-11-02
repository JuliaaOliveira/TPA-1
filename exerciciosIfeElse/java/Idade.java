import java.util.Scanner;
public class Idade{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        double aa, an, idade;
        System.out.println("Insira o ano de nascimento");
        an = input.nextDouble();
        System.out.println("Insira o ano atual");
        aa = input.nextDouble();
        idade = (aa-an);
        System.out.println("A sua idade é"+idade+"anos");
        if (idade < 10){
            System.out.println("criança");
        }else if(idade < 18){
            System.out.println("Adolescente");
        }else if(idade < 60){
            System.out.println("Adulto");
        }else if (idade >= 60){
            System.oout.println("Idoso");
        }
    }
}