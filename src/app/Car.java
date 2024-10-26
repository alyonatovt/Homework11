package app;

public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Started the electrical system");
    }

    private void startCommand() {
        System.out.println("The management system was launched");
    }

    private void startFuelSystem() {
        System.out.println("The fuel system has been launched");
    }
}
