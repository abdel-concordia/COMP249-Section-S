package comp249_section_s;

public class DLinkedList {

    private Node head; // MUST HAVE
    private Node tail; // MUST HAVE
    private int numberOfElements; // Optional, improves performance when getting the size

    // Constructor
    public DLinkedList() {
        head = null;
        tail = null;
        numberOfElements = 0;
    }

    // Add
    // addToHead
    public void addToHead(String data) {
        Node n = new Node(null, data, head);

        if (head == null) { // if first element, update tail
            tail = n;
        } else {
            head.previous = n;
        }
        head = n;
        numberOfElements++;
    }

    // addToTail
    public void addToTail(String data) {
        if (head == null) {
            addToHead(data);
        } else {
            Node n = new Node(tail, data, null);
            tail.next = n; // The order of this and following statement is VERY important
            tail = n;
            numberOfElements++;
        }
    }

    // addAfter (addBefore)
    public void addAfter(String referenceValue, String value) {
        if (head == null) {
            System.out.println("Your list is empty, cannot add after!");
        } else {
            Node position = head;
            while (position != null && !position.data.equals(referenceValue)) {
                position = position.link;
            }
            if (position == null) {
                System.out.println("The reference value " + referenceValue + " does not exist in the list.");
            } else {
                Node newNode = new Node(value, position.link);
                position.link = newNode;

                if (newNode.link == null) {
                    tail = newNode;
                }
            }
            numberOfElements++;
        }
    }

    // Remove
    // removeHead
    public String removeHead() {
        if (head == null) {
            return null; // Probably throw an exception
        } else {
            String data = head.data;
            head = head.next;
            numberOfElements--;
            if (numberOfElements == 0) { // Take care of tail if the removed element was the head and tail
                tail = null;
            } else {
                head.previous = null;
            }

            return data;
        }
    }

    // removeTail
    public String removeTail() {
        if (numberOfElements <= 1) { // This takes care of empty list and when there is only 1 element
            return removeHead();
        } else {
            String data = tail.data;
            tail = tail.previous;
            tail.next = null;
            numberOfElements--;
            return data;
        }
    }

    // removeValue
    public String removeValue(String value) {
        if (head == null) {
            return null;
        }
        if (head.data.equals(value)) {
            return removeHead();
        } else if (tail.data.equals(value)) {
            return removeTail();
        } else {
            Node position = head;
            while (position.next != null && !position.next.data.equals(value)) {
                position = position.next;
            }

            if (position.next == null) {
                System.out.println("Value " + value + " does not exist in the list.");
                return null;
            } else {
                String data = position.next.data;

                Node temp = position.next;

                //System.out.println(data);
                // The order of the following 2 statements is VERY IMPORTANT (or adjust the number of .next)
                position.next.next.previous = position;
                position.next = position.next.next;

                // Some data sanitization!
                temp.next = null;
                temp.previous = null;

                numberOfElements--;
                return data;
            }
        }
    }

    /*
    // removeAfter (remove before)
    public String removeAfter(String value) {
        if (head == null) {
            System.out.println("Cannot remove from an empty list.");
            return null;
        } else {
            Node position = head;
            while (position != null && !position.data.equals(value)) {
                position = position.link;
            }

            if (position == null) {
                System.out.println("Value " + value + " does not exist.");
                return null;
            } else if (position == tail) {
                System.out.println("There is no value after " + value);
                return null;
            } else {
                String data = position.link.data;
                // Check if the removed value was on tail
                if (position.link == tail) {
                    tail = position;
                }
                position.link = position.link.link;
                numberOfElements--;
                return data;
            }
        }
    }

    // contains: Check if a specific data (value) exists in the list
    public boolean contains(String value) {
        Node position = head;
        while (position != null) {
            if (position.data.equals(value)) {
                return true;
            }
            position = position.link;
        }
        return false;
    }

    // get data at position index
    public String get(int index) {
        if (index >= 0 && index < numberOfElements) {
            Node position = head;
            for (int i = 0; i < index; i++) {
                position = position.link;
            }
            return position.data;
        } else {
            return null;
        }
    }
     */
    // display (go through all elements and display each one)
    public void displayForward() {
        if (head == null) {
            System.out.println("This list has no element.");
        } else {
            System.out.println("Your list contains the following element(s):");
            Node position = head;
            while (position != null) {
                // display element
                System.out.println(position);
                position = position.next;
            }
        }
    }

    public void displayBackward() {
        if (tail == null) {
            System.out.println("This list has no element.");
        } else {
            System.out.println("Your list contains the following element(s) in reverse order:");
            Node position = tail;
            while (position != null) {
                // display element
                System.out.println(position);
                position = position.previous;
            }
        }
    }

    // getSize (how many elements in the list)
    public int getSize() {
        return numberOfElements;
    }

    private class Node {

        // Data
        private String data;
        // Link 1
        private Node next;
        // Link 2
        private Node previous;

        // Constrcutor(s)
        public Node(Node previous, String data, Node next) {
            this.data = data;
            this.previous = previous;
            this.next = next;
        }

        // equals()
        @Override
        public boolean equals(Object otherObject) {
            return this.data.equals(otherObject); // Compare the data

        }

        // toString()
        @Override
        public String toString() {
            return this.data;
        }
    }
}
