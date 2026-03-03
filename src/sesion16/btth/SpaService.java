package sesion16.btth;

import java.util.Queue;
import java.util.LinkedList;

public class SpaService<waitingQueue> {
    private Queue<Pet> waitingQueue = new LinkedList<>();
    public void addToQueue(Pet pet) {
        waitingQueue.offer(pet);
        System.out.println("Da them: " + pet.getName());
        System.out.println("So luong dang cho: " + sesion16.btth.waitingQueue.size());
    }
    // xu ly thu cung
    public void serveNext() {
        Pet currentPet = waitingQueue.poll();
        if (currentPet != null) {
            System.out.println("Dang phuc vu");
            System.out.println(currentPet);
        } else {
            System.out.println("Khong co pet de phuc vu");
        }
    }

    // xem thu cung tiep theo khong xoa
    public void viewNext() {
        Pet nextPet = waitingQueue.peek();
        if (nextPet != null) {
            System.out.println("Thu cung tiep theo: ");
            System.out.println(nextPet);
        } else {
            System.out.println("Khong co thu cung nao dang cho");
        }
    }

    // hien thi toan bo thu cung
    public void displayQueue() {
        if (waitingQueue.isEmpty()) {
            System.out.println("Khong co thu cung nao dang cho");
            return;
        }
        for (Pet pet : waitingQueue) {
            System.out.println(pet);
        }
    }

}