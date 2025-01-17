import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        double minimo = 5.0;
        double maximo = 1000.0;
        double saldo = minimo + (maximo - minimo) * Math.random();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite seu nome completo: ");
        String nome_cliente = scanner.nextLine();

        System.out.println("Olá " + nome_cliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }
}
wsl