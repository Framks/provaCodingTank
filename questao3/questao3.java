import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("informe o numero: ");
        int tam = scan.nextInt();
        int init = ((tam%2)==0) ? 2 : 1;
        for(int i = init;i <= tam;i = i+2){
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
        for(int i = tam;i >= init;i = i-2){
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
