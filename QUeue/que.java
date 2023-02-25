package QUeue;

public class que {
    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        Queue(int n){
            arr=new int[n];
            this.size=n;
        }
        public static boolean isEmpty(){
            return  rear==-1;
        }
        public static void add(int data){
            if(rear==(size-1)){
                System.out.println("full queue");   //use to enque element in queue
                return;
            }
            rear ++;
            arr[rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){       //use to deque element in queue
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;          //use to find the top element in queue
            }
            return arr[0];
        }
    }
    public static void main(String args[]){
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
