public class TestBank {
    public static void main(String[] args) {
        Client client = new Client();
        client.name = "Kamila";
        client.cpf = "123456789";
        client.profession = "dev";

        Account account = new Account();
        account.deposit(150);

        account.owner = client;
        System.out.println(account.owner.name);
    }

}
