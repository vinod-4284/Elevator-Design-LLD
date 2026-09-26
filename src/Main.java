public class Main {
    public static void main(String[] args) {
        ElevatorController controller = new ElevatorController(5, 5);

        controller.printStatus();

        controller.requestElevator(3, 7);
        controller.requestElevator(5, 2);
        controller.requestElevator(1, 9);
        controller.requestElevator(4, 2);

        controller.step();

        controller.printStatus();
    }
}
