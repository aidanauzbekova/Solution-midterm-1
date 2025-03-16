interface ThirdPartySecuritySystem {
    void activate();
    void deactivate();
}



class LegacySecuritySystem implements ThirdPartySecuritySystem {
    public void activate() {
        System.out.println("Legacy Security System Activated");
    }

    public void deactivate() {
        System.out.println("Legacy Security System Deactivated");
    }
}



class SecuritySystemAdapter implements SmartDevice {
    private ThirdPartySecuritySystem securitySystem;

    public SecuritySystemAdapter(ThirdPartySecuritySystem system) {
        this.securitySystem = system;
    }

    public void turnOn() {
        securitySystem.activate();
    }

    public void turnOff() {
        securitySystem.deactivate();
    }
}

