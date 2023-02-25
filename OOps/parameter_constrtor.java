package OOps;

public class parameter_constrtor {
    int id;
    String name;
    parameter_constrtor(int i,String n){
        id=i;
        name=n;
    }
    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String args[]) {
        parameter_constrtor s1=new parameter_constrtor(111,"prince");
        parameter_constrtor s2=new parameter_constrtor(112,"pinku");
        s1.display();
        s2.display();
    }
}
