# **DSA-Art-Gallery**
This is my Learning Journey about Data Structure and Algorithm

##***What is Data Structure and Algorithem?***

When we talking about DSA, Data Structures are a containers that capable to storing in a computer.Data structures provide a framework for storing and organizing data in a way that makes it easy to access, modify, and manipulate. Common data structures include arrays, linked lists, stacks, queues, trees, graphs, and hash tables, among others. Each data structure has its own strengths and weaknesses, making it suitable for different types of problems and operations.

Algorithms, on the other hand, are sets of instructions that outline a series of steps to solve a specific problem or perform a task. Algorithms take inputs, perform operations on those inputs, and produce outputs. They can range from simple procedures to complex processes. The efficiency of an algorithm is a critical aspect, as it determines how quickly and resource-efficiently a problem can be solved. Efficient algorithms are crucial for optimizing the performance of software applications and systems.

So We Can Classfied Data Structures based on their characteristics.

<img width="1416" alt="Material App" src="https://github.com/Yasith8/My-DSA-Art-Gallery/assets/90121062/d457749a-dbc8-4cb7-8d9a-efdc7691a009">

**1. Based on Arrangement**
  - Linear
    - In linear data structures, the data items are arranged in a linear sequence.
      * eg:Array Linked List, Stack, Queue
  - Non Linear
    - In non-linear data structure, data items are not in sequence.
      * eg: tree, graph

**2. Based on Data Type**
  - Homogeneous
    - The All elements are same type.
  - Non-Homogeneous
    - The All elements are may or maynot same type.

**3. Based on Location**
  - Static
    - Size and structures assosiated memory locations are fixed.
      - eg: Array
  - Dynamic
    - Memory location can be changed.
      - eg: linked List
     
  <h2>**Data Structures that I have learned so far**</h2>

  1. [Array](#Array)
  2. LinkedList
  3. Stack
  4. Queue
  5. Tree
  6. Heap
  7. Graph



## [Array](https://github.com/Yasith8/My-DSA-Art-Gallery/tree/main/Data%20Structures/Array)

- **Print Array**
  <br>
  ```java
  public class PrintArray {
     public static void main(String args[]){
        int myArray[]={10,20,30,40,50};
        int n=myArray.length;

        for(int i=0; i<n;i++){
           System.out.print(myArray[i]+",");
         }
       }
    }
  ```

- **Print Selected Array Elements**
  ```java
  //Challenge1: Print index 3 to end in array
  //Challenge2: Print index 2 to 6 in array

   public class PrintSelectedArray {
       public static void main(String args[]){
           int myArray[]={10,20,30,40,50,60,70,80,90};

           System.out.println("---Challenge--1---");

           //Challenge1:
          for(int i=3;i<myArray.length;i++){
               System.out.print(myArray[i]+" || ");
          }
        
              System.out.println("");

              System.out.println("---Challenge--2---");
          //Challenge2:
         for(int i =2;i<7;i++){
             System.out.print(myArray[i]+" || ");
          }
       }
    }

- **Insert a value into fixed Array**

```java
public class Insert {
    public static void main(String args[]){
        int A[]={10,20,30,40,50};
        int N=A.length;
        int POS=2;
        int VAL=90;

        
        for(int i=N-1;i>POS;i--){
            A[i]=A[i-1];
        } 

        A[POS]=VAL;

        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }

    }
}
