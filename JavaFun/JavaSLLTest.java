public class JavaSLLTest {
    public static void main(String[] args) {
        JavaSLL sl1 = new JavaSLL();
        Node n1 = new Node(3);
        Node n2 = new Node(7);
        JavaSLL sl2 = new JavaSLL(3);
        sl2.add(2);
        sl2.add(44);
        sl2.printValues();
    }
}