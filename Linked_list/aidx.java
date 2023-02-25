package Linked_list;

public class aidx {
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
        Node newNode=new Node(data); //create a new node from last index
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
    public void add(int idx,int data){
        if(idx==0){
            addEle(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;    //adding element to the scific postion other than last
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public static void main(String args[]){
        aidx list=new aidx();
        list.addEle(2);
        list.addEle(1);
        list.addEle(3);
        list.addEle(4);
        list.addEle(5);
        list.addEle(6);
        list.add(2,9);
        list.print();
        System.out.println(list.size);
    }
}

