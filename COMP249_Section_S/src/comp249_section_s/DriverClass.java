package comp249_section_s;

public class DriverClass {

    public static void main(String[] args) {

        DLinkedList myDList = new DLinkedList();

        myDList.addToTail("1");
        myDList.addToTail("2");
        myDList.addToTail("7");
        myDList.removeValue("7");

        myDList.displayForward();
        myDList.displayBackward();
    }

}
