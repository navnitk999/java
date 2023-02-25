package OOps;

public class THis {
    int id;
    String name;
    int marks;
    THis(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    void display(){
        System.out.println(id+" "+name+" "+marks);
    }
}
