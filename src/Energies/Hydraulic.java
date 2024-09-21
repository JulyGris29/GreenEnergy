package Energies;

public class Hydraulic extends RenewableEnergy {
    private double caudal; //cubic meters per second

    public Hydraulic(String country, int year, double production, double consumption, double caudal) {
        super("Hydraulic", country, year, production, consumption);
        this.caudal = caudal;
    }

    public double getCaudal() {
        return caudal;
    }

    public void setCaudal(double caudal) {
        this.caudal = caudal;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Caudal: " + caudal + " m³/s");
    }
}
