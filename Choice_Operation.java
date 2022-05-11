import java.util.*;
class Choice_Operation
{
    public int n;
    public Scanner in=new Scanner(System.in);
    public void set(){
        System.out.println("Enter no:");
        System.out.println("To choose query");
        System.out.println("1:with draw");
        System.out.println("2:credit");
        System.out.println("3:checkBalance");
        System.out.println("4:Exit");
        n=in.nextInt();
    }
        
      public void  disp(){
        switch(n){
            case 1:{
                With_Draw();
                break;
            }
            case 2:{
                Credit();
                break;
            }
            case 3:{
                Check_Balance();
                break;
            }
            case 4:{
                Exit();
                break;
            }
            default:{
                System.out.println("Not Found");
            }

        }
    }
    public static void With_Draw(){
        if(b==0)
    }
}
class Main{
    public static void main(String args[]){
        Choice_Operation ob=new Choice_Operation();
        ob.set();
        ob.disp();  
    }
}