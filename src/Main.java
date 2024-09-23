import Energies.Hydraulic;
import Users.Admin;
import Users.Client;
import Users.User;

public class Main {
    public static void main(String[] args) {
        //Create user
        User user = new User(2, "Lulú", "Meta", "Lulu@gmail", "OPQ");
        //user.register();
        user.login();

        //user.exploreEnergies();
        user.viewHistory();
        //user.editProfile("");
        //user.requestSupport("Tengo un  problema");

        Client client = new Client(2, "Sara", "Tulúa", "sari@gmail", "sara123");
        client.register();
        client.processPayment(12);
        System.out.println(client);
        Admin admin = new Admin(1, "Chavo8", "Necaxa", "Cahvao@gmail", "chav123");
        admin.userManagement();
        admin.createReports();
        Training train = new Training("Solar", "none");
        train.displayTrainingInfo();
        System.out.println("Está seleccionando un entrenamiento");

    }
}