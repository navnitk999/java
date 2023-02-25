package CLAss;

interface Eatable{
    void eat();
    }
public class INTERface {
        public static void main(String args[]) {
            Eatable e=new Eatable() {
                public void eat() {
                    System.out.println("nice fruit");
                }
            };
            e.eat();
        }
}

