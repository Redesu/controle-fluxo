import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

    private static double valorRandom() {
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }

    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada > 0) {
            Double valorDoce = valorRandom();
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Valor adicionado ao carrinho: " + valorDoce);
            mesada = mesada - valorDoce;

        }

        System.out.println("mesada: " + mesada);
        System.out.println("gastou tudo");
    }

}
