abstract class DeviceDecorator implements SmartDevice {
    protected SmartDevice decoratedDevice;

    public DeviceDecorator(SmartDevice device) {
        this.decoratedDevice = device;
    }

    public void turnOn() {
        decoratedDevice.turnOn();
    }

    public void turnOff() {
        decoratedDevice.turnOff();
    }
}



class LoggingDecorator extends DeviceDecorator {
    public LoggingDecorator(SmartDevice device) {
        super(device);
    }

    public void turnOn() {
        System.out.println("Logging: Device is about to turn ON");
        super.turnOn();
    }

    public void turnOff() {
        System.out.println("Logging: Device is about to turn OFF");
        super.turnOff();
    }
}
