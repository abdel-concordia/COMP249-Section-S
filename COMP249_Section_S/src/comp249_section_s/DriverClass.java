package comp249_section_s;

public class DriverClass {

    public static void main(String[] args) {

        LinkedList myList = new LinkedList();

        //myList.addToTail("Hi");
        //myList.addToTail("Hi again");
        //myList.addToHead("Hello");
        System.out.println("You removed: " + myList.removeHead());
        myList.display();
        //System.out.println(myList.getSize());

    }

}
