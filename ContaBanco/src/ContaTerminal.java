import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número da agencia: ");
        String agencia = scanner.nextLine();
        System.out.print("Digite o número da conta: ");
        int conta = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o seu nome: ");
        String nomeClinete = scanner.nextLine();
        System.out.print("Digte o seu saldo: ");
        float saldo = scanner.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é : %s, conta: %d e saldo %.2f",nomeClinete,agencia,conta,saldo);


        
    
    }
}
