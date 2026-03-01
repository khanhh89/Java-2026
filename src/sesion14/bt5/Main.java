package sesion14.bt5;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Comparator<Patient> patientComparator = (p1, p2) -> {
            if (p1.severity != p2.severity) {
                return Integer.compare(p1.severity, p2.severity);
            } else {
                return p1.arrivalTime.compareTo(p2.arrivalTime);
            }
        };
        Set<Patient> emergencyQueue = new TreeSet<>(patientComparator);
        emergencyQueue.add(new Patient("Bệnh nhân A", 2, "10:00"));
        emergencyQueue.add(new Patient("Bệnh nhân B", 1, "10:05"));
        emergencyQueue.add(new Patient("Bệnh nhân C", 3, "10:02"));
        emergencyQueue.add(new Patient("Bệnh nhân D", 1, "10:01"));
        System.out.println("Thứ tự bệnh nhân được cấp cứu:");
        for (Patient patient : emergencyQueue) {
            System.out.println(patient);
        }
    }
}
