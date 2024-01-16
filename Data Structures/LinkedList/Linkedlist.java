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
    Node newNode = new Node(ele);

    if(head==null){
        head=newNode;
        tail=newNode;
    }else{
        newNode.next=head;
        head=newNode;
    }
   }


   public void deleteFromHead(){
    if(head==null){
        System.out.println("Linkedlist is empty");
    }else{
        Node temp=head;
        head=head.next;
        System.out.println("deleted data : "+temp.data);
    }
   }

   public void addToTail(int ele){
    Node newTail=new Node(ele);
    if(head==null){
        head=newTail;
        tail=newTail;
    }else{
        tail.next=newTail;
        tail=newTail;
    }
   }

   public void deleteFromTail(){
    if(head==null){
        System.out.println("Linkedlist is empty");
    }else{
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }

        Node prevTail=temp;
        prevTail.next=null;
        tail=prevTail;
    }
   }

   public void display(){
    for(Node temp=head;temp!=null;temp=temp.next){
        System.out.print("|"+temp.data+"|");
    }
   }

   public Node search(int loc){
    for(Node temp=head;temp!=null;temp=temp.next){
        if(temp.data==loc){
            return temp;
        }
    }
    return null;
   }

   public void insertAfter(int ele,int loc){
    Node prevNode=search(loc);
    Node newNextNode=new Node(ele);

    newNextNode.next=prevNode.next;
    prevNode.next=newNextNode;
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
        System.out.println("deleteFromHead");
        newLink.deleteFromHead();
        newLink.display();
        System.out.println("");
        System.out.println("deleteFromTail");
        newLink.deleteFromTail();
        newLink.display();
        System.out.println("");
        newLink.insertAfter(55,98);
        newLink.display();

    }
}
