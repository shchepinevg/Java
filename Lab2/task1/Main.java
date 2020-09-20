import phones.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("88005553535", "xiaomi", 283.3);
        Phone phone2 = new Phone("84951235685", "iphone", 100.0);
        Phone phone3 = new Phone("83954726586", "honor", 333.8);

        System.out.println(phone1.getNumber());
        System.out.println(phone1.getModel());
        System.out.println(phone1.getWeight());

        System.out.println(phone2.getNumber());
        System.out.println(phone2.getModel());
        System.out.println(phone2.getWeight());

        System.out.println(phone3.getNumber());
        System.out.println(phone3.getModel());
        System.out.println(phone3.getWeight());

        System.out.println();

        phone1.receiveCall("John");
        phone2.receiveCall("Tom");
        phone3.receiveCall("Andrew");

        System.out.println();

        phone1.receiveCall("Evgeny", "89994400700");
        phone2.receiveCall("Sergey", "86643756465");
        phone3.receiveCall("Dmitry", "85653859573");

        System.out.println();

        phone1.sendMessage("84951235685", "83954726586", "86643756465");
    }
}

