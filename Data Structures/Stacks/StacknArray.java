package Stacks;
public class StacknArray {
    public int arr[] = new int[6];
    public int top = -1;
    public int n = arr.length;

   public void push(int ele){
    if(top==n-1){
        System.out.println("Overflow");
    }else{
        ++top;
        arr[top]=ele;
    }
   }

   public void pop(){
    if(top==-1){
        System.out.println("Underflow");
    }else{
        int temp=arr[top];
        --top;
        System.out.println("removed element in stack: "+temp);
    }
   }

   public void peek(){
    if(top==-1){
        System.out.println("Underflow");
    }else{
        int temp=arr[top];
        System.out.println("top element in stack: "+temp);
    }
}

public void print(){
    if(top==-1){
        System.out.println("Underflow");
    }else{
        for(int i=0;i<=top;i++){
            System.out.print("|"+arr[i]+"|");
        }
    }
   }


    public static void main(String[] args) {
        StacknArray newStack = new StacknArray();
        newStack.push(10);
        newStack.push(20);
        newStack.push(30);
        newStack.push(40);
        newStack.push(50);
        newStack.push(60);
        newStack.push(70);
        newStack.print();
        System.out.println();
        newStack.pop();
        newStack.print();
        System.out.println();
        newStack.peek();
        newStack.print();
    }
}
