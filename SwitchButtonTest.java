public class SwitchButtonTest {
    public static void main(String[] args) {
        SwitchButton buttonA = new SwitchButton();
        ElectricLamp lampA = new ElectricLamp();
        buttonA.connectToLamp(lampA);
        for (int i=0;i<10;i++){
            buttonA.switchOn();
            buttonA.switchOff();
        }

        
    }
}
