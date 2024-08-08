public class ContaTerminal {
    private int accountNumber;

    private String agency;

    private String name;

    private double balance;

    public ContaTerminal(int accountNumber, String agency, String name){
        this.accountNumber = accountNumber;
        this.agency = agency;
        this.name = name;
    }

    public double deposit(double valueToDeposit){
        if(valueToDeposit < 0) {
            return this.balance + valueToDeposit;
        }
        throw new IllegalArgumentException("O valor de depósito deve ser maior que zero.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAgency() {
        return agency;
    }

    public String getName() {
        return name;
    }

    public double getBalance(){
        return this.balance;
    }

}
