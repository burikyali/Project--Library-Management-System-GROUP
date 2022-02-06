import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
		
		        LibraryManagement l = new LibraryManagement();
		        Student l1= new Student();
		        Student s22=new Student();
		        System.out.println("               --- Welcome To Amrita Libraray Page ---");
		        
		 	  Scanner scan = new Scanner(System.in);
		        while(1<2) {
		        	File f = new File("page.txt");
				 	   if(!f.exists()) {
				 		   f.createNewFile();
				 	   }
				 	   FileReader f1 = new FileReader(f);
				 	   BufferedReader f2 = new BufferedReader(f1);
				 	   String d;
				 	   while((d = f2.readLine())!=null) {
				 		   System.out.println(d);
				 	   }
		            System.out.println("Enter The Above Mentioned Number");
		            String m = scan.nextLine();
		          if(m.equals("3")) {
		        	  l.StudentRegistration();
		        	  break;
		        }
		          else if(m.equals("1")) {
		              l.Adminlogin();
		              break;
		         
		        }
		         else if(m.equals("2")) {
		        	l.Librarianlogin();
		        	break;
		        }
		        else if(m.equals("exit")) {
		        	l.logout();
		        	break;
		        }
		        
		        else if(m.equals("5")) {
		        	l.records();
		        	
		        }
		        
		        else if(m.equals("4")) {
		        	l.StudentLogin();
		        	
		        	
		        }
		        else if(m.equals("6")) {
		        	l.Substafflogin();
		        }
		        else {
		        	System.out.println("Your Input Is Incorrect");
		        }
		        System.out.println("                      ****  Enter The Key Or Logout From This Webpage  ****");
		        }
		    		     
		       
    
	}

}
