// Time Complexity : O(n)
// Space Complexity : O(1)
class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            this.data = data;
            this.next = null;
        }
    }


    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        return root == null;

    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);

        //If stack is empty, then make new node as the root, else add new node at the end
        if(isEmpty()) {
            root = newNode;
        }
        else {
            StackNode current = root;
            while(current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if(isEmpty())
            return 0;

        //pop the element at the root
        StackNode poppedNode = root;

        //Update root to point to root.next
        root = root.next;

        return poppedNode.data;

    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        return root.data;
    }

    //Driver code
    public static void main(String[] args)
    {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
}
