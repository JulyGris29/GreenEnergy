package Users;

public class Client extends User {

    // Constructor
    public Client(int id, String name, String city, String email, String password) {
        super(id, name, city, email, password);
    }

    public void processPayment(float amount) {
        System.out.println("Payment processed: " + amount);
    }

    public void selectEnergy(String energyType) {
        System.out.println("Client selected energy: "+ energyType);
    }
}