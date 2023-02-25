package OOps;
public class para_constrtor_new {
    int a,b;  
    para_constrtor_new(int a,int b)  
    {  
        this.a=a;  
        this.b=b;  
    }  
    void display()  
    {  
        System.out.println(a+b);  
    }  
    public static void main(String[] args) {  
        para_constrtor_new obj=new para_constrtor_new(10,20);  
        obj.display();  
    }  
}
