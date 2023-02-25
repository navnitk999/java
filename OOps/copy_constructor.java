package OOps;

public class copy_constructor {
    int id;
    String name;
    copy_constructor(int i,String n){
        id=i;
        name=n;
    }
    copy_constructor(copy_constructor s){
        id=s.id;
        name=s.name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String args[]) {
        copy_constructor s1=new copy_constructor(111,"prince");
        copy_constructor s2=new copy_constructor(s1);
        s1.display();
        s2.display(); 
    }
}
