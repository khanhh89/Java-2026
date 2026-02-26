package sesion13.bt3;
import java.lang.reflect.Array;

import java.util.ArrayList;
import java.util.List;
public class findPatients {
    public static void main(String[] args) {
        List<Object> patients = new ArrayList<>();
        List<Integer> listA = new ArrayList<>();
        listA.add(101);
        listA.add(102);
        listA.add(105);
        List<Integer> listB = new ArrayList<>();
        listB.add(102);
        listB.add(105);
        listB.add(108);
        List<Integer> commonPatients = findCommonPatients(listA, listB);
        System.out.println(commonPatients);
        List<String> listC = new ArrayList<>();
        listC.add("P001");
        listC.add("P002");
        listC.add("P005");
        List<String> listD = new ArrayList<>();
        listD.add("P002");
        listD.add("P005");
        listD.add("P008");
        List<String> commonPatients1 = findCommonPatientss(listC, listD);
        System.out.println(commonPatients1);
    }

    private static List<Integer> findCommonPatients(List<Integer> listA, List<Integer> listB) {
        List<Integer> commonPatients = new ArrayList<>();
        for (Integer patientA : listA) {
            if (listB.contains(patientA)) {
                commonPatients.add(patientA);
            }
        }
        return commonPatients;
    }
    private static List<String> findCommonPatientss(List<String> listC, List<String> listD) {
        List<String> commonPatients1 = new ArrayList<>();
        for (String patientC : listC) {
            if (listD.contains(patientC)) {
                commonPatients1.add(patientC);
            }
        }
        return commonPatients1;
    }
}
