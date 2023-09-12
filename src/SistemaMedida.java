public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "P";

        switch (sigla) {
            case "P":
                System.out.println("PEQUENO");
                break;
            case "G":
                System.out.println("GRANDE");
                break;
            case "M":
                System.out.println("MEDIO");
                break;

            default:
            System.out.println("NENHUM");
                break;
        }

    }
}
