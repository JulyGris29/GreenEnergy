package Users;


public class Admin extends User {

    public Admin(int id, String name, String address, String email, String password) {
        super(id, name, address, email, password);
    }

    public void userManagement() {
        System.out.println("Managing users...");
    }

    public void createReports() {
        System.out.println("Creating reports...");
    }
}

