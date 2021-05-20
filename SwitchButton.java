public class SwitchButton {
    private boolean statusButton;
    private ElectricLamp lamp;

    public SwitchButton(){
        statusButton = false;
    }

    public void connectToLamp(ElectricLamp status){
        this.lamp = status;
    }

    public void switchOn(){
        statusButton = true;
        System.out.println("Switch button turned on");
        lamp.turnOn();
    }

    public void switchOff(){
        statusButton = false;
        System.out.println("Switch button turned off");
        lamp.turnOff();
    }
}

