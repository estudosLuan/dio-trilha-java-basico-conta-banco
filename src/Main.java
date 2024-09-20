import java.util.Locale;
import java.util.Scanner;

public class Main {
    public  static void main (String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta!");
        int numero = sc.nextInt();
        System.out.println("Por favor, digite o número da agência!");
        sc.nextLine();
        String agencia = sc.nextLine();
        System.out.println("Por favor, digite o seu nome!");
        String nome = sc.nextLine();
        System.out.println("Por favor, digite o seu saldo!");
        Double saldo = sc.nextDouble();

        System.out.printf("Olá %s," +
                " obrigado por criar uma conta em nosso banco," +
                " sua agência é %s," +
                " %d e seu saldo é $%.2f já está disponível para saque."
                , nome, agencia, numero, saldo);
    }
}