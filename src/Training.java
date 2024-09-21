public class Training {
    private String nameEnergy;
    private String information;

    public Training(String nameEnergy, String information) {
        this.nameEnergy = nameEnergy;
        this.information = information;
    }

    public void displayTrainingInfo() {
        System.out.println("Energy: " + nameEnergy);
        System.out.println("Information: " + information);
    }
}
