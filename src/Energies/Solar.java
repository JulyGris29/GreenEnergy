package Energies;

public class Solar extends RenewableEnergy {
    private double sunHour;

    public Solar(String country, int year, double production, double consumption, double sunHour) {
        super("Solar", country, year, production, consumption);
        this.sunHour = sunHour;
    }

    public double getSunHour() {
        return sunHour;
    }

    public void setSunHour(double sunHour) {
        this.sunHour = sunHour;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Average hours of sunshine per year: " + sunHour);
    }
}
