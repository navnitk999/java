package OOps;

public class invoke {
    void dis(){
        System.out.println("Print == dis");
    }
    void display(){
        System.out.println("print == display");
        this.dis();
    }
}
