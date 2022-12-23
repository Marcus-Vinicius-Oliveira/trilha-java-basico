import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

      int numeroConta;
      String agencia;
      String nomeCliente;
      double saldo = 237.48;

      Scanner sc = new Scanner(System.in);

      System.out.println("Por favor, digite um nome de usuário: ");
      nomeCliente = sc.nextLine();

      System.out.println("Por favor, digite o número da conta: ");
      numeroConta = sc.nextInt();

      System.out.println("Por favor, digite o número da Agência: ");
      agencia = sc.next();

      System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");

      sc.close();



    }
}
