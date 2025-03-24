package comp249_section_s;

// Define class LinkedList
// head, add, remove, display
public class LinkedList {

    private Node head;
    private int numberOfElements;

    public LinkedList() {
        head = null;
    }

    // Add
    // addToHead
    public void addToHead(String data) {
        head = new Node(data, head);
        numberOfElements++;
    }

    // addToTail
    public void addToTail(String data) {
        if (head == null) {
            addToHead(data);
        } else {
            Node position = head;
            while (position.getLink() != null) {
                position = position.getLink();
            }
            Node n = new Node(data, null);
            position.setLink(n);
            numberOfElements++;
        }
    }

    // addAfter (addBefore)
    // Remove
    // removeHead
    public String removeHead() {

        if (head == null) {
            return null; // Probably throw an exception
        } else {
            String data = head.getData();

            head = head.getLink();
            numberOfElements--;
            return data;
        }
    }

    // removeTail
    // removeValue
    // removeAfter (remove before)
    // contains: Check if a specific data (value) exists in the list
    // display (go through all elements and display each one)
    public void display() {
        if (head == null) {
            System.out.println("This list has no element.");
        } else {
            Node position = head;
            while (position != null) {
                // display element
                System.out.println(position);
                position = position.getLink();
            }
        }
    }

    // getSize (how many elements in the list)
    public int getSize() {
        return numberOfElements;
    }
}
