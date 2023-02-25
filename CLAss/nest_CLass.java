package CLAss;
class Outerclass{
    static int outer_x=10;
    int outer_y=20;
    private int outer_private=30;
    class Innerclass{
        void display(){
            System.out.println("outer_x=" + outer_x);
            System.out.println("outer_y" + outer_y);
            System.out.println("outer_private" + outer_private);
        }
    }
}
public class nest_CLass {
    public static void main(String args[]) {
        // accessing an inner class
        Outerclass outerobj = new Outerclass();
        Outerclass.Innerclass innerobj = outerobj.new Innerclass();
        innerobj.display();// calling a constructor
    }    
}
