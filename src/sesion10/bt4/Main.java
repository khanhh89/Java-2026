package sesion10.bt4;

public class Main {
    public static void main(String[] args) {
        RemoteControl smartLight = new RemoteControl() {
            @Override
            public void powerOn() {
                System.out.println("Đèn đã bật");
            }
        };

        System.out.println("Điều khiển nhà thông minh");
        smartLight.powerOn();
        smartLight.checkBattery();
        RemoteControl smartFan = new RemoteControl() {
            @Override
            public void powerOn() {
                System.out.println("Quạt đang quay...");
            }
        };
        System.out.println("\nThiết bị bổ sung");
        smartFan.powerOn();
    }
}
