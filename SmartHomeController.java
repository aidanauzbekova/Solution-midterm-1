import java.util.ArrayList;
import java.util.List;



class SmartHomeController {
    private List<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void turnAllOn() {
        System.out.println("Turning ON all devices in the smart home");
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    public void turnAllOff() {
        System.out.println("Turning OFF all devices in the smart home");
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }
}