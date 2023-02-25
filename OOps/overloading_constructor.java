package OOps;

public class overloading_constructor {
    int id;
    String name;
    int age;
    overloading_constructor(int i,String n){
        id=i;
        name=n;
    }
    overloading_constructor(int i,String n,int a){
        id=i;
        name=n;
        age=a;
    }
    void display(){
        System.out.println(id+" "+name+" "+age);
    }
    public static void main(String args[]) {
        overloading_constructor s1=new overloading_constructor(111,"prince");
        overloading_constructor s2=new overloading_constructor(112,"pinku",18);
        s1.display();
        s2.display();
    }
}
