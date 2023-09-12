public class CaixaEletronico {
    public static void main(String[] args) {

        double balance = 25.0;
        double solicitedValue = 26.0;

        if (solicitedValue < balance) {
            balance = balance - solicitedValue;
            System.out.println("balance: " + balance);
        }

        else {
            System.out.println("Insufficient balance");
            System.out.println(balance);
        }

    }

}
