import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("qual o valor de um empréstimo: ");
        float valorImprestimo = scan.nextFloat();
        System.out.println("qual a taxa de juros do empréstimo: ");
        float valorTaxaJuros = scan.nextFloat();
        System.out.println("qual o tempo de pagamento em meses: ");
        int tempoPagamento = scan.nextInt();

        float saldo_devedor_total = valorImprestimo;

        float amortizacao = valorImprestimo / tempoPagamento;
        float saldo_devedor_atual = saldo_devedor_total;
        float juros_mensal = 0;
        float parcela_mensal = 0;

        
        float total_prestacao = 0;
        float total_juros = 0;
        System.out.println("\nValor fixo da amortização R$ "+amortizacao+", Saldo devedor total R$ "+valorImprestimo+" com um juros de "+valorTaxaJuros+"% ao mês\n");
        for(int i = 1; i<= tempoPagamento;i++){
            juros_mensal = saldo_devedor_atual*(valorTaxaJuros/100);
            parcela_mensal = juros_mensal + amortizacao;
            saldo_devedor_atual = saldo_devedor_atual - amortizacao;
            System.out.println("Parcela i | Juros: R$ "+juros_mensal+" | Prestação: R$ "+parcela_mensal+" | Saldo devedor: R$ "+saldo_devedor_atual);
            total_juros += juros_mensal;
            total_prestacao += parcela_mensal;
        }
        System.out.println("\nPrestação R$ "+total_prestacao+", Juros R$ "+total_juros+", Amortização R$ "+saldo_devedor_total);
        scan.close();
    }
}