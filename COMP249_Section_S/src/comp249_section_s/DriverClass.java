package comp249_section_s;

public class DriverClass {

    public static void main(String[] args) {

        LinkedList myList = new LinkedList();

        myList.addToTail("1");
        //myList.addToTail("2");
        //myList.addToTail("3");
        //myList.addToTail("4");
        //myList.addToHead("Hello");
        //System.out.println("You removed: " + myList.removeHead());
        myList.removeValue("2");

        myList.display();
        //System.out.println(myList.getSize());

    }

}
