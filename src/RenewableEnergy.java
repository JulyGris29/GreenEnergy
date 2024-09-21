public class RenewableEnergy {

    protected String type;
    protected String country;
    protected int year;
    protected double production; // In megawatts (MW)
    protected double consumption;

    public RenewableEnergy(String type, String country, int year, double production, double consumption) {
        this.type = type;
        this.country = country;
        this.year = year;
        this.production = production;
        this.consumption = consumption;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getProduction() {
        return production;
    }

    public void setProduction(double production) {
        this.production = production;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }
}