package sesion15.bt6;

import java.util.*;
public class HospitalManagementSystem {
    static class Patient {
        String id, name, gender;
        int age;

        public Patient(String id, String name, int age, String gender) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "ID: " + id + " | Tên: " + name + " | Tuổi: " + age + " | Phái: " + gender;
        }
    }

    static class PatientWaitingQueue {
        private Queue<Patient> waitingQueue = new LinkedList<>();

        public void addPatient(Patient p) {
            waitingQueue.add(p);
        }

        public Patient callNext() {
            return waitingQueue.poll();
        }

        public void displayQueue() {
            System.out.println("Hàng chờ:");
            for (Patient p : waitingQueue)
                System.out.println(p);
        }
    }

    static class EditAction {
        String description, editedBy, editTime;

        public EditAction(String description, String editedBy, String editTime) {
            this.description = description;
            this.editedBy = editedBy;
            this.editTime = editTime;
        }

        @Override
        public String toString() {
            return "[" + editTime + "] " + description + " - Sửa bởi: " + editedBy;
        }
    }

    static class MedicalRecordHistory {
        private Stack<EditAction> editStack = new Stack<>();
        private String recordId;

        public MedicalRecordHistory(String recordId) {
            this.recordId = recordId;
        }

        public void addLog(EditAction action) {
            editStack.push(action);
        }

        public void displayHistory() {
            System.out.println("Lịch sử " + recordId + ":");
            for (int i = editStack.size() - 1; i >= 0; i--) {
                System.out.println(editStack.get(i));
            }
        }
    }

    static class Ticket {
        int ticketNumber;
        String issuedTime;

        public Ticket(int ticketNumber, String issuedTime) {
            this.ticketNumber = ticketNumber;
            this.issuedTime = issuedTime;
        }
    }

    static class TicketSystem {
        private Queue<Ticket> ticketQueue = new LinkedList<>();
        private int currentNumber = 0;

        public void issueTicket(String time) {
            currentNumber++;
            ticketQueue.add(new Ticket(currentNumber, time));
        }
        public void callTicket() {
            Ticket t = ticketQueue.poll();
            if (t != null)
                System.out.println("Gọi số: " + t.ticketNumber);
        }
    }
    static class InputAction {
        String fieldName, oldValue, newValue;
        public InputAction(String field, String oldVal, String newVal) {
            this.fieldName = field;
            this.oldValue = oldVal;
            this.newValue = newVal;
        }
    }
    static class UndoManager {
        private Stack<InputAction> undoStack = new Stack<>();
        private final int maxUndoSteps = 5;
        public void saveAction(InputAction action) {
            if (undoStack.size() >= maxUndoSteps)
                undoStack.remove(0);
            undoStack.push(action);
        }
        public void undo() {
            if (!undoStack.isEmpty()) {
                InputAction action = undoStack.pop();
                System.out.println("Undo [" + action.fieldName + "]: " + action.oldValue);
            }
        }
    }
    public static void main(String[] args) {
        PatientWaitingQueue pQueue = new PatientWaitingQueue();
        pQueue.addPatient(new Patient("BN01", "A", 20, "Nam"));
        pQueue.addPatient(new Patient("BN02", "B", 30, "Nữ"));
        pQueue.displayQueue();
        pQueue.callNext();

        MedicalRecordHistory history = new MedicalRecordHistory("REC01");
        history.addLog(new EditAction("Sửa huyết áp", "Dr.Hung", "08:00"));
        history.displayHistory();

        TicketSystem tickets = new TicketSystem();
        tickets.issueTicket("09:00");
        tickets.callTicket();

        UndoManager undoer = new UndoManager();
        undoer.saveAction(new InputAction("Tên", "Nguyen A", "Nguyen B"));
        undoer.undo();
    }
}
