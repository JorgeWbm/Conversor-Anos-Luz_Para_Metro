import java.util.Scanner;
import java.math.BigInteger;

public class VelocidadeLuzParaMetro {
    public static void main(String[] args) {
        BigInteger metro = new BigInteger("9460536207068016");

        Scanner scanner = new Scanner(System.in);

        System.out.println("(o_o) - Olá viajante! Qual o seu nome?");
        String nome = scanner.nextLine();
        System.out.println("");

        System.out.println("(*_*) - Seja bem-vindo comandante " + nome + ", quantos anos luz iremos viajar hoje? ");
        System.out.println("")
        ;
        String input = scanner.nextLine();
        scanner.close();  // Fechar o Scanner após a leitura de todas as entradas

        BigInteger luz = new BigInteger(input);
        BigInteger conversao = metro.multiply(luz);

        System.out.println("");
        System.out.println("(x_x) - Uau! Isso é o equivalente a " + conversao + " metros. Vamos nessa!");
    }
}





