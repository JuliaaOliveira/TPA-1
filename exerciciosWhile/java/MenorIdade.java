import java.util.Scanner;
public Class MenorIdade{
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        int i=1, menor=0, maior=0;
        double a, n, id;
        while (i =10){
             System.out.println("Insira a idade do aluno"+1);
             id = in.nextInt();
             if (id >18){
                  System.out.println("O aluno e maior de idade");
                  maior++
             }else{
                  System.out.println("O aluno e menor de idade");
                  menor++
                  i++
             }
              System.out.println("Quantidade de alunos maiores de idade e "+maior+);
              System.out.println("Quantidade de alunos menores de idade e "+menor+);
        }
    }
}