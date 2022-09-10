import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        String produto = new String();
double estoquemaximo=0;
double estoqueminimo=0;
double estoquemedio=0;
        try (Scanner scanf = new Scanner(System.in)) {
            System.out.print("Qual é o produto que você deseja verificar o estoque médio?");
            produto = scanf.next();
            System.out.print("Digite a quantidade total de " + produto + " em seu estoque");
            estoquemaximo= scanf.nextDouble();
            System.out.print("Digite a quantidade minima de " + produto + " em seu estoque");
            estoqueminimo=scanf.nextDouble();
        }
        estoquemedio= (estoquemaximo+estoqueminimo)/2;
        System.out.println("A quantidade média de "+ produto + " em seu estoque é: "+ estoquemedio);




        
    }
}
