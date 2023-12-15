import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe a temperatura: ");
        float temperatura_origem = scan.nextFloat();
        float temperatura_destino = 0;
        boolean teste = true;
        String origem = "";
        String destino = "";
        scan.nextLine();
        while (teste) {
            System.err.print("\nQual a unidade de origem dessa temperatura? [C, K, F] ");
            origem = scan.nextLine();
            switch (origem) {
                case "C":
                case "K":
                case "F":
                    teste = false;
                    break;
            
                default:
                    System.out.println("opção invalida:::: ");
                    break;
            }
        }
        teste = true;
        while (teste) {
            System.err.print("\nQual a unidade de destino dessa temperatura? [C, K, F] ");
            destino = scan.nextLine();
            switch (origem) {
                case "C":
                case "K":
                case "F":
                    teste = false;
                    break;
            
                default:
                    System.out.println("opção invalida:::: ");
                    break;
            }
        }
        if (origem.equals("C") && destino.equals("K")) {
            temperatura_destino = (float) (273.15 + temperatura_origem);
        }else if(origem.equals("C") && destino.equals("F")){
            temperatura_destino = (temperatura_origem * 9 / 5) + 32;
        }else if(origem.equals("F") && destino.equals("C")){
            temperatura_destino = (temperatura_origem - 32) * 5 / 9;
        }else if(origem.equals("F") && destino.equals("K")){
            temperatura_destino =(float) (((temperatura_origem - 32) * 5 / 9) + 273.15);
        }else if (origem.equals("K") && destino.equals("C")) {
            temperatura_destino = (float) (temperatura_origem - 273.15);
        }else if(origem.equals("K") && destino.equals("F")){
            temperatura_destino =(float) ((temperatura_origem - 273.15) * 9 / 5) + 32; 
        }else{
            temperatura_destino = temperatura_origem;
        }
        temperatura_destino = (float) (Math.round(temperatura_destino*100)/100.0);
        System.out.println(temperatura_origem +" " + origem +" = "+temperatura_destino+" "+destino );
        scan.close();
    }
}
