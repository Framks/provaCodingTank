import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("informe o numero: ");
        int tam = scan.nextInt();
        int fator = ((tam%2)==0) ? 1 : 2;
        for(int i = 1;i <= tam;i = i+fator){
            int espaco = (tam - i)/2;
            for(int k=1;k<=espaco;k++){
                System.out.printf(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.printf("*");
            }
            for(int k=1;k<=espaco;k++){
                System.out.printf(" ");
            }
            System.out.printf("\n");
        }
        for(int i = tam;i >= 1;i = i-fator){
            int espaco = (tam - i)/2;
            for(int k=1;k<=espaco;k++){
                System.out.printf(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.printf("*");
            }
            for(int k=1;k<=espaco;k++){
                System.out.printf(" ");
            }
            System.out.printf("\n");
        }
        scan.close();
    }
}
