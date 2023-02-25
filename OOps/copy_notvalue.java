package OOps;

public class copy_notvalue {
    int id;
    String name;
    copy_notvalue(int i,String n){
        id=i;
        name=n;
    }
    copy_notvalue(){}
    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String args[]) {
        copy_notvalue s1=new copy_notvalue(111,"prince");
        copy_notvalue s2=new copy_notvalue();
        s2.id=s1.id;
        s2.name=s1.name;
        s1.display();
        s2.display();
    }
}
