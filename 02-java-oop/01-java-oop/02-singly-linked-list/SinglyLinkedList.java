public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    // SLL methods go here. As a starter, we will show you how to add a node to the
    // list.
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public String remove() {
        if (head == null) {
            return "Nothing to remove";
        } else {
            Node runner = head;
            while (runner.next.next != null) {
                runner = runner.next;
            }
            runner.next = null;
            return "Successful removal";
        }
    }

    public String printValues() {
        if (head == null) {
            return "Nothing to print!";
        } else {
            Node runner = head;
            while (runner != null) {
                System.out.println(runner.value);
                runner = runner.next;
            }
            return "Method Complete!";
        }
    }
}