package OOps;

public class add_this {
    void mess(){
        System.out.println(this);
    }
    public static void main(String args[]) {
        add_this s1=new add_this();
        System.out.println(s1);
        s1.mess();
    }
}
