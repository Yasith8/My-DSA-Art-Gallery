package Stacks;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

public class StacknLinkedList {

    public static Node head;
    public static Node tail;


    public void push(int ele) {
        Node newNode = new Node(ele);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }

    public void pop(){
        if(head==null){
            System.out.println("underflow");
        }else{
            Node temp=head;
            head=head.next;
            System.out.println("Deleted Stack element : "+temp.data);
        }
    }

    public void peek(){
        if(head==null){
            System.out.println("underflow");
        }else{
            Node current=head;
            System.out.println("Current Top Element in Stack: "+current.data);
        }
    }

    public void display(){
        if(head==null){
            System.out.println("Stack is Empty");
        }else{
            for(Node temp=head;temp!=null;temp=temp.next){
                System.out.print("("+temp.data+")");
            }
        }
    }

    public static void main(String[] args) {
        StacknLinkedList linkStack = new StacknLinkedList();
        linkStack.push(10);
        linkStack.push(20);
        linkStack.push(30);
        linkStack.push(40);
        linkStack.push(50);
        linkStack.push(60);
        linkStack.push(70);

        linkStack.display();
        System.out.println();
        System.out.println("-------------------------------");
        linkStack.pop();
        linkStack.display();
        System.out.println();
        System.out.println("-------------------------------");
        linkStack.peek();
    }
}
