package comp249_section_s;

public class DriverClass {

    public static void main(String[] args) {

        Address address1 = new Address(1445, "Maisonneuve West", "Montreal");
        Person p1 = new Person("John", 15, address1);

        Person p2 = new Person(p1);

        new Person(p2);

        Address ad2 = p1.getAddress();
        ad2.setCityName("Laval");
        p1.setAddress(ad2);

        p1.getAddress().setCityName("Laval");

        System.out.println(p1.getAddress());
        //System.out.println(p2.getAddress());
    }

}
