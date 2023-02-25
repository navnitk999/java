package OOps;

public class nam {
    
    public static void main(String[] args) {
        //pri s1=new pri("Prince",21);// address "OOps.pri@36baf30c"
        //pri s1=new pri("prince");
        pri s1=new pri();
        System.out.println(s1);// this and object has same address mean acts like local pointer 
        //s1.name="prince"; //use in default value
        s1.setroll(21);   // use in private value
        System.out.println(s1.getroll()+" "+s1.name);//output:-21 Prince

        //System.out.println(s1.name);
       /* pri s2=new pri();
        s2.name="pinku";
        s2.setroll(21);
        System.out.println(" "+s2.name);*/
    }
}
