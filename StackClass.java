public class StackClass {
    public static class Node {
        int data;
        Node next;

         Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        public static Node head = null;
        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newnNode = new Node(data);
            if (isEmpty()) {
                head = newnNode;
                return;
            }
            newnNode.next = head;
            head = newnNode;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            Node top = head;
            head= head.next;
            return top.data;

        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            Node top = head;
            return top.data;
        }

    }


    public static void main(String[] args) {

        Stack stack= new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty())
        {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
