class Charger {
    String brand;
    int powerOutput;
    int numberOfPorts;
    boolean fastCharging;

    Charger(String brand, int powerOutput, int numberOfPorts, boolean fastCharging) {
        this.brand = brand;
        this.powerOutput = powerOutput;
        this.numberOfPorts = numberOfPorts;
        this.fastCharging = fastCharging;
    }
}