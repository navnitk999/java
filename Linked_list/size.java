package Linked_list;

public class size {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    // property of linked list
    public static Node head;
    public static Node tail;
    public static int size;
    // add element in linked list
    public void addEle(int data){
        Node newNode=new Node(data); //create a new node
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode; //link
        tail=newNode; //head=newNode
    }
    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;

        }
        System.out.println("null");
    }
    public static void main(String args[]){
        size list=new size();
        list.addEle(4);
        list.addEle(5);
        list.addEle(6);
        list.print();
        System.out.println(list.size);
    }
}
    

