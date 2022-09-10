import java.util.Scanner;

public class Ex1 {

    public static void main(String args[]) {
    int x=1;
    int apr=0;
  
   
       
   int [] gaba = new int[8];
      int acertos=0;
      
      
       
        try (Scanner sc = new Scanner(System.in)) {
            int nota=0;
        //Pegar gabarito
        System.out.println("--------GABARITO----------");
       for(int i=0;i<8;i++){
        System.out.println("Digite a resposta da questão " + x++ +":");
        gaba[i] = sc.nextInt();
        }
        //Aluno
        for (int i = 0; i < 10; i ++) {

            System.out.println("--- Aluno " + (i+1) + " ---");

            
            for (int j = 0; j < 8; j++) {
                
                System.out.println("digite a resposta da " + (j+1) + " questão");
                int resposta = sc.nextInt();

                if (resposta == (gaba[j]) ) {
                   acertos+=1; 
                }
            }
            nota=acertos;
            if(nota>=5){
                apr+=1;
            }
            System.out.println("A nota do aluno " + (i+1) + " é : " + acertos);
            nota = 0;

        
        
        }
       int pApr=apr*100/10;
       System.out.println(pApr+"% foram aprovados ");
        

    }
}
}