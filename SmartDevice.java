import java.util.*;



interface SmartDevice {
    void turnOn();
    void turnOff();
}




class Light implements SmartDevice {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void turnOn() {
        System.out.println(name + " is turned ON");
    }

    public void turnOff() {
        System.out.println(name + " is turned OFF");
    }
}




class Thermostat implements SmartDevice {
    private String name;

    public Thermostat(String name) {
        this.name = name;
    }

    public void turnOn() {
        System.out.println(name + " is set to a comfortable temperature");
    }

    public void turnOff() {
        System.out.println(name + " is turned OFF");
    }
}




class Room implements SmartDevice {
    private String name;
    private List<SmartDevice> devices = new ArrayList<>();

    public Room(String name) {
        this.name = name;
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void turnOn() {
        System.out.println("Turning ON all devices in " + name);
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    public void turnOff() {
        System.out.println("Turning OFF all devices in " + name);
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }
}



