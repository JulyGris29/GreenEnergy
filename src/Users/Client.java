package Users;

public class Client extends User {
    public Client(int id, String name, String address, String email, String password) {
        super(id, name, address, email, password);
    }

    public void processPayment(float amount) {
        System.out.println("Processing payment of: $" + amount);
    }
}