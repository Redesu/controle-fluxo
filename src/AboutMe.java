import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();
            System.out.println("Nome: " + nome + " " + sobrenome + " Idade: " + idade + " Altura:" + altura + "m");
            scanner.close();
        } catch (InputMismatchException e) {
            System.err.println("Verifique todos os campos!"); 
            throw e; 
         } 
        

    }

}
