package CLAss;
abstract class Person{
    abstract void eat();
}

public class ABStract {
    public static void main(String args[]) {
        Person e=new Person() {
            public void eat() {
                System.out.println("Prince kumar");
            }
        };
        e.eat();
    }
    
}
