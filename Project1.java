import java.io.BufferedWriter;
import java.io.Console;
import java.io.FileWriter;
import java.io.IOException;
import java.io.WriteAbortedException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.naming.NoPermissionException;
class Account {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static String s ;
    public static int n;
    Scanner in = new Scanner(System.in);
    HashMap<String,Integer> h = new HashMap<String,Integer>();
    public String a1;
    public static String m;
   


    public  String login() {
            try{
            h.put("yogesh", 1234);
            h.put("Ram", 2124);
            h.put("gopi", 4444);
            h.put("praneeth", 8888);
            System.out.println("Enter Name:");
            s = in.nextLine();
            Console console = System.console();
                    if (console == null) {
                        System.out.println("Couldn't get Console instance");
                        System.exit(0);
                    }
                    char passwordArray[] = console
                            .readPassword("Enter your password: (It won't show due to security reasons) \n");
                      n=Integer.parseInt(new String(passwordArray));
                     //System.out.println(n);
                     //System.out.println(n instanceof Integer);
                    int l=String.valueOf(n).length();
                    System.out.println("Password Length : " +l+" "+ ".");
                   // System.out.println("Enter password:");
                    //n =in.nextInt();
            }catch(Exception e){
                System.out.println("Invalid Charaters");
            }
            return s+n;
        }
        
        public String display(){
            try{
                
            if (h.containsKey(s)) {
                Integer x=h.get(s);
        
                if(x == n){
                return m=(ANSI_YELLOW + "-----------LOGIN SUCCESSFULLY-----------" + ANSI_RESET);
                }
                    
                
                else{
                return m="Enter password or name is incorrect1";}
            }
            else{
                return m="Enter password or name is incorrect2";
            }

        } catch (InputMismatchException e) {
            
           return m="Invalid Charaters";
        }
    } 
}
