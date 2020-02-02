import java.util.Scanner;
import java.util.*;
import java.util.Stack;

public class StackTextEditor {
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     StringBuilder st = new StringBuilder();
     Stack<StringBuilder> s=new Stack<StringBuilder>();
     for(int i=0;i<n;i++){
         
         int op=sc.nextInt();
         switch(op){
             case 1:
                      String g=sc.nextLine();
                      s.push(st);
                      System.out.println(st);
                      
                      break;
               
             case 2:
                 int it=sc.nextInt();
                 s.push(st);
                 System.out.println(st);
                 
                  break;
             case 3:
                   int p=sc.nextInt();
                   System.out.println(st.charAt(p)); 
                    break; 
             case 4:
                 st=s.peek();
                 System.out.println(st); 
                 s.pop();
                  break;
                 

         	}
     	}
	}
}

