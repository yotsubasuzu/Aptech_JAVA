public class Temperature {
    private double cTemp;

    public Temperature(double cTemp) {
        this.cTemp = cTemp;
    }

    public void getCTemp() {
        System.out.println("C degree: " + cTemp);
    }

    public void setCTemp(double value) {
        this.cTemp = value;
    }

    public void getFTemp() {
        System.out.println("F degree: " + (cTemp * 9 / 5 + 32));
    }

    public void getKTemp() {
        System.out.println("K degree: " + (cTemp + 273.15));
    }
}