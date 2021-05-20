public class ElectricLamp {
    private boolean status;

    public ElectricLamp(){
        status = false;
    }
    public void turnOn() {
        status = true;
        System.out.println("Electric Lamp turned on");
    }
    public void turnOff() {
        status = false;
        System.out.println("Electric Lamp turned off");
    }
}
