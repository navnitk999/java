package OOps;

public class reusage {
    int roll;
    String name,course;
    float fee;
    public reusage(int roll, String name, String course, float fee) {
        this(roll,name,course);//reusing constructor
        this.fee = fee;
    }
    public reusage(int roll, String name, String course) {
        this.roll = roll;
        this.name = name;
        this.course = course;
    }
    void message(){
        System.out.println(roll+" "+name+" "+course+" "+fee);
    }
}
