class JavaSLL {
    public Node head;

    public JavaSLL() {
        this.head = null;
    }

    public JavaSLL(int value) {
        this.head = new Node(value);
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if(this.head == null){
            this.head = newNode;
        } else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void remove() {
        if(this.head.next == null){
            this.head = null;
        } else{
            Node current = this.head;
            int counter = 1;
            while(current.next != null){
                current = current.next;
            }
            current = null;
        }
    }
    public void printValues() {

        if(this.head == null){
            System.out.println("No nodes in this list!");
        } else{
            Node current = this.head;
            int counter = 1;
        
            while(current !=  null) {
                System.out.println("Node " + counter + ": " + current.val);
                counter ++;
                current = current.next;
            }
        }
    }
}