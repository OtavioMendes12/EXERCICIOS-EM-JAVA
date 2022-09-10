

public class MenoreMaiorNum Matriz{
    public static void main(String[] args) {

        int[][] matriz = new int [3] [4];
        // for de atribuição de valores para a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                
                matriz[i][j] = (int)((Math.random()*100) + 1); // gerando numero aleatorio
                System.out.print(matriz[i][j] + " | "); // mostrando
                
            }	
            System.out.println("");
        }
    
        
        
        System.out.println("");
        
        int[] maioresDeCadaLinha = new int[3];
        
        int aux = 0;
        
        // descobre qual o maior numero de cada linha
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                aux = Math.max(aux, matriz[i][j]);
                
            }	
            
            maioresDeCadaLinha[i] = aux;
            aux = 0;
            System.out.println("Maior da "+ i + "º linha é " + maioresDeCadaLinha[i]);
        }
        
        System.out.println("");
        
        
        int[] menoresDeCadaColuna = new int[4];
        
        int[] aux1 = new int[4];
        // descobre qual o menor numero de cada coluna
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                
                aux1[j] = matriz[i][j];
                
                if (i==0){
                    menoresDeCadaColuna[j] = aux1[j];
                }
                
                if (j==9){
                    
                    for (int j2 = 0; j2 < 4; j2++) {
                        menoresDeCadaColuna[j2] = Math.min(aux1[j2], menoresDeCadaColuna[j2]);
                }
                    
                }
                   
            }	
            
        }
        
        //apenas mostra os menores numero de cada coluna
        for (int i = 0; i < menoresDeCadaColuna.length; i++) {
            
            System.out.println("Menor da "+ i + "º coluna é " + menoresDeCadaColuna[i]);
            
        }
        
        
    }
}