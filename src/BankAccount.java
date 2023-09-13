public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public double deposit(double sum) {
        return amount += sum;
    }
    public void withDraw(int sum) throws LimitException {
        if (sum > amount){
            throw new LimitException("Ошибка! Недостаточно средств на счете", amount);
        }
        amount -= sum;

    }

}
