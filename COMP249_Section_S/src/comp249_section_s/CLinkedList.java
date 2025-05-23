package comp249_section_s;

public class CLinkedList<T> {

    private Node head; // MUST HAVE
    private Node tail; // Optional: improves performance if we add to tail or at head
    private int numberOfElements; // Optional, improves performance when getting the size

    // Constructor
    public CLinkedList() {
        head = null;
        tail = null;
        numberOfElements = 0;
    }

    // Add
    // addToHead
    public void addToHead(T data) { // IMPORTANT: addToHead affects tail in a CList
        Node n = new Node(data, head);

        if (head == null) { // if first element, update tail
            tail = n;
            n.link = n;
        }
        head = n;
        tail.link = head;
        numberOfElements++;
    }

    /*
    // addToTail
    public void addToTail(T data) {
        if (head == null) {
            addToHead(data);
        } else {

            Node n = new Node(data, null);
            tail.link = n; // The order of this and following statement is VERY important
            tail = n;
            numberOfElements++;
        }
    }

    // addAfter (addBefore)
    public void addAfter(T referenceValue, T value) {
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
    public T removeHead() {
        if (head == null) {
            return null; // Probably throw an exception
        } else {
            T data = head.data;

            head = head.link;
            numberOfElements--;

            if (numberOfElements == 0) { // Take care of tail if the removed element was the head and tail
                tail = null;
            }

            return data;
        }
    }

    // removeTail
    public T removeTail() {
        if (numberOfElements == 1) {
            return removeHead();
        } else {
            Node position = head;
            while (position.link != tail) {
                position = position.link;
            }
            T data = tail.data;
            position.link = null;
            tail = position;
            numberOfElements--;
            return data;
        }
    }

    // removeValue
    public T removeValue(String value) {
        if (head == null) {
            return null;
        }
        if (head.data.equals(value)) {
            return removeHead();
        } else if (tail.data.equals(value)) {
            return removeTail();
        } else {
            Node position = head;
            while (position.link != null && !position.link.data.equals(value)) {
                position = position.link;
            }

            if (position.link == null) {
                System.out.println("Value " + value + " does not exist in the list.");
                return null;
            } else {
                T data = position.link.data;

                //System.out.println(data);
                position.link = position.link.link;
                numberOfElements--;
                return data;
            }
        }
    }

    // removeAfter (remove before)
    public T removeAfter(String value) {
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
                T data = position.link.data;
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
    public T get(int index) {
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
    public void display() {
        if (head == null) {
            System.out.println("This list has no element.");
        } else {
            System.out.println("Your list contains the following element(s):");
            Node position = head;
            do {
                // display element
                System.out.println(position);
                position = position.link;
            } while (position != head);
        }
    }

    // getSize (how many elements in the list)
    public int getSize() {
        return numberOfElements;
    }

    private class Node {

        // Data
        private T data;
        // Link
        private Node link;

        // Constrcutor(s)
        public Node(T data, Node link) {
            this.data = data;
            this.link = link;
        }

        // equals()
        @Override
        public boolean equals(Object otherObject) {
            return this.data.equals(otherObject); // Compare the data

        }

        // toString()
        @Override
        public String toString() {
            return this.data.toString();
        }
    }
}
