package epamtask6;
import java.util.Scanner;
public class App 
{
	
    public static void main( String[] args )
    {
    	char ch;
    	boolean flag=true;
    	custom ob=new custom();
    	//ob.insert();
    	while(flag ) {
    		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
    	
		   System.out.println("MENU\n1.Add\n2.Remove\n3.printAll\n4.Fetch");
		   System.out.print("Enter your choice : ");
		   int c = sc.nextInt();
		   switch(c) {
		   case 1:
			   		String s;
			   		System.out.println("Enter string to add : ");
			   		s = sc.next();
			   		ob.add(s);
			   		System.out.println("\nDo you want to perform more operations?(y/n)");
    				ch=sc.next().charAt(0);
    				if(ch == 'y'||ch=='Y')
    					flag = true;
    				else {
    					flag = false;
    					System.out.println("Exit");
    				}
			   		break;
		   case 2:
			   		String r;
			   		System.out.println("Enter string to remove : ");
			   		r = sc.next();
			   		ob.remove(r);
			   		System.out.println("\nDo you want to perform more operations?(y/n)");
    				ch=sc.next().charAt(0);
    				if(ch == 'y'||ch=='Y')
    					flag = true;
    				else {
    					flag = false;
    					System.out.println("Exit");
    				}
    					break;
		   case 3:
			   		ob.printAll();
			   		System.out.println("\nDo you want to perform more operations?(y/n)");
    				ch=sc.next().charAt(0);
    				if(ch == 'y'||ch=='Y')
    					flag = true;
    				else {
    					flag = false;
    					System.out.println("Exit");
    				}
    					break;
		   case 4:
			   		System.out.println("Enter string : ");
			   		String f=sc.next();
			   		ob.fetch(f);
			   		System.out.println("\nDo you want to perform more operations?(y/n)");
    				ch=sc.next().charAt(0);
    				if(ch == 'y'||ch=='Y')
    					flag = true;
    				else {
    					flag = false;
    					System.out.println("Exit");
    				}
    					break;
			   		
		   default:
			   System.out.println( "please enter valid input" );
		   }
    	}
}
}