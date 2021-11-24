import java.util.Scanner; 
 public class Ex2{ 
    public static void main ( String [] args ){ 
       Scanner in = new Scanner (System.in); 
       final int TAM = 10; 
       int i, a[],b[],c[]; 
       a = new int [TAM]; 
       b = new int [TAM]; 
       c = new int [TAM];
       
      for(i=0; i<TAM; i++ ){ 
         System.out.println("Digite o " +(i + 1 )+"  valor do vetor A "); 
         a [i] = in.nextInt(); 
        } 
      for (i=0; i<TAM; i++){ 
          System.out.println("Digite o " +(i + 1 )+ "7valor do vetor B "); 
          b[i]= in.nextInt(); 
          c[i] = a[i] + b[i]; 
        } 
      System.out.print("Cb= "); 
      for(i=0; i<TAM; i++){ 
         System.out.print(c[i]+ " "); 
        } 
  
    } 
  
 }