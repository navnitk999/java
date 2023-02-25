package OOps;
import java.util.*;
public class maxof_2 {
    public static int max(int a,int b) {
        if (a>b){
            return a;
        }
        else if(a<b){
            return b; 
        }
        else{
            return 0;
        }
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the 1st no");
        int a=s.nextInt();
        System.out.println("enter the 2nd no");
        int b=s.nextInt();
        System.out.println("the max no is=" +max(a,b));
    }
    
}
