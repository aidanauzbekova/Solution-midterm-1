import java.util.ArrayList;
import java.util.List;

interface SmartHomeFactory {
    Light createLight(String name);
    Thermostat createThermostat(String name);
}


class BasicSmartHomeFactory implements SmartHomeFactory {
    public Light createLight(String name) {
        return new Light(name);
    }
    public Thermostat createThermostat(String name) {
        return new Thermostat(name);
    }
}


