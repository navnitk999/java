package OOps;

public class error {
    int roll;
    String name,course;
    float fee;
    public error(int roll, String name, String course, float fee) {
        this.fee = fee;// Compile Time error
        this(roll,name,course);//Compile Time error
        
    }
    public error(int roll, String name, String course) {
        this.roll = roll;
        this.name = name;
        this.course = course;
    }
    void message(){
        System.out.println(roll+" "+name+" "+course+" "+fee);
    }
}
