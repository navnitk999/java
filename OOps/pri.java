package OOps;
public class pri {
    public String name;
    private int roll;
    public pri(String name,int roll){ // < this is is called "constructor" which is used to create an object"parmetershied constructor"
        this.name=name;
        this.roll=roll;
    }
    public pri(String name){ //copy constructor
        this.name=name;
    }
    public pri(){

    }
    public void setroll(int roll){
        if(roll<0){
            return;
        }
        System.out.println(this);
       // roll=roll;// < not a perfect idea about which roll object for we use this keyword 
       // output as 0 prince
       this.roll=roll;// by this we get 21 prince
    }
    public int getroll(){
        return roll;
    }
}
