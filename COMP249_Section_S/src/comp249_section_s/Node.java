package comp249_section_s;

// Define class Node
// two parts: data and link
public class Node {

    // Data
    private String data;
    // Link
    private Node link;

    // Constrcutor(s)
    public Node(String data, Node link) {
        this.data = data;
        this.link = link;
    }

    // Getters/Setters
    public void setData(String data) {
        this.data = data;
    }

    public void setLink(Node link) {
        this.link = link;
    }

    public String getData() {
        return this.data;
    }

    public Node getLink() {
        return this.link;
    }

    // equals()
    @Override
    public boolean equals(Object otherObject) {
        return this.data.equals(otherObject);
    }

    // toString()
    @Override
    public String toString() {
        return this.data;
    }
}
