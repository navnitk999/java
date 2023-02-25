package OOps;

public class this2 {
    public static void main(String args[]) {
        THis s1=new THis(111,"prince",80);
        THis s2=new THis(112,"pinku",42);
        s1.display();
        s2.display();
        invoke s3=new invoke();// invoke java file
        s3.display();
        new method_this().pri().mess();// use to class this keyword when it is in methode 
        //class.methode_class.methode                               
        para_this s4=new para_this(10);
        default_para s5=new default_para();
        reusage s6=new reusage(111,"prince","CSE");
        reusage s7=new reusage(111,"prince","CSE",6666f);
        s6.message();
        s7.message();
        error s8=new error(111,"prince","CSE");
        error s9=new error(111,"prince","CSE",6666f);
        s8.message();
        s9.message();
    }
}
