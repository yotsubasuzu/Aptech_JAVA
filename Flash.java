public class Flash {
    public static void main(String[] args) {
        Battery batteryA = new Battery();
        batteryA.setEnergy(100);
        FlashLamp flashA = new FlashLamp();
        flashA.setBattery(batteryA);
        System.out.println(flashA.getBatteryInfo()); 

        for (int i=0;i<10;i++){
            flashA.turnOn();
            flashA.turnOff();
        }
        System.out.println(flashA.getBatteryInfo());
    }
}
