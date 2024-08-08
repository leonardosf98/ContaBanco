import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seja bem vindo ao banco DIO");
        System.out.println("Para iniciarmos, digite seu nome e sobrenome. Ex: João Silva");
        String name = sc.next();
        String surname = sc.next();
        String fullName = name.concat(" " + surname);

        System.out.println("Digite o número da sua agência: ");
        String agency = sc.next();


        while (agency.isEmpty() || !agency.matches("^\\d{3}-\\d$")){
            System.out.println("Digite um número válido para sua agência: ");
            agency = sc.next();
        }

        System.out.println("Agora precisamos do número da sua conta: ");
        int accountNumber = sc.nextInt();

        System.out.println("Deseja fazer um depósito? Digite 's' para fazer e 'n' para continar sem depósito");

        String response = sc.next();
        ContaTerminal novaConta = new ContaTerminal(accountNumber, agency, fullName);

        if(response.equals("s")){
            System.out.println("Qual o valor do depósito?");
            double valueToDeposit = sc.nextDouble();
            novaConta.deposit(valueToDeposit);
        }

        System.out.println("Olá " + novaConta.getName() + ", obrigado por criar uma conta em nosso banco, sua agência é " + novaConta.getAgency() + ", conta " + novaConta.getAccountNumber() + " e seu saldo " + novaConta.getBalance() + " já está disponível para saque.");
    }
}