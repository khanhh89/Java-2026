package sesion15.bt2;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {
    private Queue<Patient> queue = new LinkedList<>();

    public void addPatient(Patient patient) {
        queue.add(patient);
    }

    public Patient callNextPatient() {
        return queue.poll();
    }

    public Patient peekNextPatient() {
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void displayQueue() {
        for (Patient patient : queue) {
            System.out.println(patient);
        }
    }

    public static void main(String[] args) {
        PatientQueue patientQueue = new PatientQueue();
        patientQueue.addPatient(new Patient("1", "Nguyen Van A", 20));
        patientQueue.addPatient(new Patient("2", "Nguyen Van B", 25));
        patientQueue.displayQueue();
        patientQueue.callNextPatient();
        patientQueue.displayQueue();
    }
}