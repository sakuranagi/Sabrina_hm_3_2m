public class Main {
    public static void main(String[] args) {
        BankAccount user = new BankAccount();
        user.deposit(15000);
        while (true) {
            try {
                System.out.println("На вашем счету: " + user.getAmount());
                user.withDraw(6000);
                System.out.println("Снято 6000.0. Остаток на счете " + user.getAmount());
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                try {
                    user.withDraw((int) e.getRemainingAmount());
                    System.out.println("На вашем счету осталось: " + e.getRemainingAmount());
                    System.out.println("Снято " + e.getRemainingAmount() + " сом. Остаток на счете: " + user.getAmount() +" сом.");
                } catch (LimitException ex) {
                    System.out.println(e.getMessage());
                }
                break;
            }
        }
    }
}
