import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        System.out.println("Por favor, digite o numero da agencia!");
        numero = scan.nextInt();

        scan.nextLine();

        System.out.println("Por favor, digite o nome da agencia!");
        agencia = scan.nextLine();

        //scan.nextLine();

        System.out.println("Por favor, digite seu nome!");
        nomeCliente = scan.nextLine();

        //scan.nextLine();

        System.out.println("Por favor, digite seu saldo!");
        saldo = scan.nextFloat();

        scan.nextLine();

        System.out.println("Ola "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agencia eh "
        +agencia+", conta "+numero+" e seu saldo "+saldo+" ja esta disponivel para saque");


        scan.close();
    }
    
}
