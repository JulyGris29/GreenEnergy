package Energies;

public class Wave extends RenewableEnergy {

    public double powerWave; //KW per meter wave

    public Wave(String country, int year, double production, double consumption, double powerWave) {
        super("Wave", country, year, production, consumption);
        this.powerWave = powerWave;
    }

    public double getPowerWave() {
        return powerWave;
    }

    public void setPowerWave(double powerWave) {
        this.powerWave = powerWave;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("PowerWade: " + powerWave + " KW * m");

    }

}
