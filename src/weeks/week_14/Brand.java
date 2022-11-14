package weeks.week_14;

public class Brand extends Car {
    private String country;
    private boolean hasElectricity;
    private boolean hasSunroof;
    private int numberOfProductionPerYear;
    private double brandValue;

    public Brand(){
        this("Germany", true, false, 1000, 354000);
        super.color = "White";
        super.horsePower = 125;
        super.isAutomatic = true;
        super.type = "Hatchback";

    }
    public Brand(String country, boolean hasElectricity, boolean hasSunroof, int numberOfProductionPerYear, double brandValue){
        super();
        this.country = country;
        this.hasElectricity = hasElectricity;
        this.hasSunroof = hasSunroof;
        this.numberOfProductionPerYear = numberOfProductionPerYear;
        this.brandValue = brandValue;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isHasElectricity() {
        return hasElectricity;
    }

    public void setHasElectricity(boolean hasElectricity) {
        this.hasElectricity = hasElectricity;
    }

    public boolean isHasSunroof() {
        return hasSunroof;
    }

    public void setHasSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
    }

    public int getNumberOfProductionPerYear() {
        return numberOfProductionPerYear;
    }

    public void setNumberOfProductionPerYear(int numberOfProductionPerYear) {
        this.numberOfProductionPerYear = numberOfProductionPerYear;
    }

    public double getBrandValue() {
        return brandValue;
    }

    public void setBrandValue(double brandValue) {
        this.brandValue = brandValue;
    }
}
