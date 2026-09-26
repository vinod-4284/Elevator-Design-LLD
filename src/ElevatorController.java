import java.util.ArrayList;
import java.util.List;

public class ElevatorController {
    private List<Elevator> elevators;

    public ElevatorController(int count, int capacity) {
        elevators = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            elevators.add(new Elevator(i, capacity));
        }
    }

    private Elevator assignElevator(int floor) {
        Elevator best = null;
        int minDistance = Integer.MAX_VALUE;
        for (Elevator e : elevators) {
            int distance = Math.abs(e.getCurrentFloor() - floor);
            if (distance < minDistance && e.getDirection() == Direction.IDLE) {
                minDistance = distance;
                best = e;
            }
        }
        if (best == null) {
            best = elevators.get(0); // fallback
        }
        return best;
    }

    public void requestElevator(int source, int destination) {
        Elevator e = assignElevator(source);
        Request req = new Request(source, destination);
        e.addRequest(req);
        System.out.println("Assigned Elevator " + e.getId() + " for " + req);
    }

    public void step() {
        for (Elevator e : elevators) {
            e.processRequests();
        }
    }

    public void printStatus() {
        for (Elevator e : elevators) {
            System.out.println(e);
        }
    }
}
