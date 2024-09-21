package Energies;

public class Wind extends RenewableEnergy {
    private double windSpeed; //meters per second (m/s)

    public Wind(String country, int year, double production, double consumption, double windSpeed) {
        super("Wind", country, year, production, consumption);
        this.windSpeed = windSpeed;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Wind Speed: " + windSpeed + " m/s");
    }
}
