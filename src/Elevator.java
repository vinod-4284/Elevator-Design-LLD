import java.util.LinkedList;
import java.util.Queue;

public class Elevator {
    private int id;
    private int currentFloor;
    private Direction direction;
    private int capacity;
    private Queue<Request> requests;

    public Elevator(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
        this.currentFloor = 0;
        this.direction = Direction.IDLE;
        this.requests = new LinkedList<>();
    }

    public int getId() {
        return id;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public Direction getDirection() {
        return direction;
    }

    public void addRequest(Request req) {
        requests.add(req);
        if (req.getDestinationFloor() > currentFloor) {
            direction = Direction.UP;
        } else if (req.getDestinationFloor() < currentFloor) {
            direction = Direction.DOWN;
        } else {
            direction = Direction.IDLE;
        }
    }

    public void processRequests() {
        while (!requests.isEmpty()) {
            Request req = requests.poll();
            System.out.println("Elevator " + id + " moving from floor " + currentFloor +
                    " to " + req.getSourceFloor());
            currentFloor = req.getSourceFloor();

            System.out.println("Elevator " + id + " moving passenger to floor " + req.getDestinationFloor());
            currentFloor = req.getDestinationFloor();
        }
        direction = Direction.IDLE;
    }

    @Override
    public String toString() {
        return "Elevator " + id + " at floor " + currentFloor + " direction " + direction;
    }
}
