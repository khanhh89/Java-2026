package sesion15.bt5;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyCaseQueue {
    private Queue<EmergencyCase> cases = new LinkedList<>();

    public void addCase(EmergencyCase c) {
        cases.add(c);
    }

    public EmergencyCase getNextCase() {
        return cases.poll();
    }

    public boolean isEmpty() {
        return cases.isEmpty();
    }
}