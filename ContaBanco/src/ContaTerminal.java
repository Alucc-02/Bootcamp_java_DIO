import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        //feito por Lucca Lazzari
        String nome;
        int numero;
        String agencia;
        double saldo;


        System.out.println("Por favor, digite o nome de sua agência:");
        agencia = t.next();
        System.out.println("Por favor, digite número de sua conta:");
        numero = t.nextInt();
        System.out.println("Por favor, digite o seu nome:");
        nome = t.next();
        System.out.println("Por favor, informe seu saldo:");
        saldo = t.nextDouble();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");

    }
}
