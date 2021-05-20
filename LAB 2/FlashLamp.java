public class FlashLamp
{
    /**
     * Fields
     */
    private boolean status;
    private Battery battery;
    /**
     * Constructor for objects of class FlashLamp
     */
    public FlashLamp()
    {
        // To do:
        status=false;
    }
    /**
     * Methods
     */
    public void setBattery(Battery battery) {
        this.battery=battery;
    }
    public int getBatteryInfo() {
        return battery.getEnergy();
    }
    public void light() {
        if(status==true&&battery!=null&&battery.getEnergy()>0) {
            battery.decreaseEnergy();
        }
    }
    public void turnOn() {
        if(battery!=null&&battery.getEnergy()>0) {
            status=true;            
        }
        light();
    }
    public void turnOff() {
        status=false;
    }
}
