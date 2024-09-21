public class Main {
    public static void main(String[] args) {
        // Create un user
        User user = new User(1, "pepito1", "street 123", "pep1@.com", "password123abc");
        user.register(); // Register user
        user.login();    // Login

        // Explore energies
        user.exploreEnergies();
        user.selectEnergy("Solar");

        // Show history
        user.viewHistory();

        // Edit profile
        user.editProfile("pedro pepe.", "pedrop@.com");

        // Request and training
        user.requestSupport("I have a problem with my account.");
        user.requestTraining();

        // Create Client and payment
        Client client = new Client(2, "Pepita", "Calle 10", "pppita@.com", "pass456");
        client.register();
        client.processPayment(150.50f);

        // Create client and manage users
        Admin admin = new Admin(3, "Pepito Admin", "Admin pepe", "admin@.com", "adminPass");
        admin.userManagement();
        admin.createReports();

        // create an instance of energy
        Energy solarEnergy = new Energy(1, "Solar", "Renewable energy from the sun.");
        solarEnergy.displayEnergyInfo();

        // create an instance of training
        Training training = new Training("Solar", "training over solar energy");
        training.displayTrainingInfo();
    }
}