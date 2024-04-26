import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia =scan.nextLine();
        System.out.println("Por favor, digite o número da conta: ");
        int conta = scan.nextInt();
        System.out.println("Por favor, digite o seu saldo: ");
        double saldo = scan.nextDouble();
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",nome,agencia,conta,saldo);
        

        
    }
}
