package LinkedList;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        next=null;
    }
}

public class Linkedlist {
 
    public static Node head;     
    public static Node tail;

    public void addToHead(int ele){
        Node newHead=new Node(ele);

        if(head==null){
            head=newHead;
            tail=newHead;
        }else{
            newHead.next=head;
            head=newHead;
        }
    }


    public void deleteFromHead(){
        if(head==null){
            System.out.println("Linkedlist is empty");
        }else{
            Node temp=head;
            head=head.next;
            System.out.println("Deleted Item: "+temp.data);
        }
    }

    public void display(){
        if(head==null){
            System.out.println("Linked list is empty");
        }else{
            
            for(Node temp=head;temp!=null;temp=temp.next){
                System.out.print(temp.data+"|");
            }
        }
    }



    public static void main(String[] args) {
        Linkedlist newLink= new Linkedlist(); 
        newLink.addToHead(10);   
        newLink.addToHead(340);   
        newLink.addToHead(98);   
        newLink.addToHead(02);   
        newLink.addToHead(45);   

        System.out.println("LinkedList");
        newLink.display();
        
        System.out.println("");
        newLink.deleteFromHead();
        newLink.display();
        System.out.println("");

    }
}
