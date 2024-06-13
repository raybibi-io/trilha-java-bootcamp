import java.util.Scanner;

public class ContaTerminal {
    int numero;
    String agencia;
    String n_cliente;
    double saldo;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta:");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String n_cliente = sc.nextLine();

        System.out.println("Por favor, digite o Saldo:");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + n_cliente + ", obrigado por criar uma conta em nosso banco.\n"
                + "Sua agência é " + agencia + ", conta " + numero + ", e seu saldo de " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
