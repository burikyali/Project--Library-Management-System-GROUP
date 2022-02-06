import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

 class LibraryManagement {
    private String username;
    private String password;
    private String institutionName;
    private String username2;
    private String password2;
    private String username1;
    private String password1;
    static String  login1;
 	static String login2;
     
     
 
     
     

   public  void StudentRegistration() throws IOException{
	  
	   File f = new File("student info.txt");
	   while(!f.exists()){
           f.createNewFile();}
      
       FileReader f11 = new  FileReader(f);
       BufferedReader f22= new  BufferedReader(f11);
       String f3;
	      String f4 = "";
	       while((f3=f22.readLine())!=null) {
	    	    f4 = f4 +f3;
	       }
	       String[] f44 = f4.split(",");
       f22.close();
       Set<String> s33 = new HashSet<>();
		for(String w:f44) {
			s33.add(w);
		}
		Scanner scan = new Scanner(System.in);
	   for(int i=0;i<3;i++) {
		   System.out.println("    ....   Registration   ....    ");
		   System.out.println("Enter Username");
	        username=scan.nextLine();
	       if(s33.contains(username)) {
	        	System.out.println("Please Enter Another Username --  It Already Taken");
	        }
	        else {
	        	for(int j=0;j<3;j++) {
	        		System.out.println("Enter Password");
			        password=scan.nextLine();
		        	if(s33.contains(password)) {
		        		System.out.println("Weak Password - Please Enter Another Password ");
	        	}
		        	else {
		        		System.out.println("Enter Your Institution Name:");
		                institutionName=scan.nextLine();
		        		System.out.println("Successfully Registered");
		        		 File f7 = new File("student info.txt");
		        	        
		                 FileWriter f1 = new FileWriter(f7,true);
		                 BufferedWriter f2 = new BufferedWriter(f1);
		                 PrintWriter writer2 = new PrintWriter(f2);
		                 writer2.println(username+","+password+","+institutionName+",");
		                 f2.close();
		        		StudentLogin();
		        		break;
		        	}
		        	if(j==2) {
		        		System.out.println("Register Again");
		        		System.out.println("Go To The Webpage");
		        		break;
		        	}
		        	
	        	
	        		
	        	}
	        	
	        	break;}
	        if(i==2) {
	       		System.out.println("Register Again");
	       		System.out.println("Go To The Webpage");
	        }
	   
	   }
	  
	   
        
       
        
        
        

            
     scan.close();
   
    
    }
   public static void StudentLogin() throws IOException {
		 Scanner scan = new Scanner(System.in);
		 LibraryManagement l1 = new LibraryManagement();
	        
	        File f4 = new File("student info.txt");
	        FileReader f11 = new  FileReader(f4);
	        BufferedReader f22= new  BufferedReader(f11);
	        String f3;
		      String f41 = "";
		       while((f3=f22.readLine())!=null) {
		    	    f41 = f41 +f3;
		       }
		       String[] f44 = f41.split(",");
	       f22.close();
	        Set<String> s33 = new HashSet<>();
			for(String w:f44) {
				s33.add(w);
			}
	        for(int i=0;i<3;i++) {
	        	System.out.println("Enter Username");
	        	login1=scan.nextLine();
	        	if(s33.contains(login1)) {
	        		 for(int j=0;j<3;j++) {
	     	        	System.out.println("Enter Password");
	     		        login2=scan.nextLine();
	     	        	if(s33.contains(login2)) {
	     	        		System.out.println("You Have Logined Successfully");
	     	        		Student.Membership();
	     	        		break;}
	     	        	else {
	     	        		System.out.println("Please Enter Correct Password");}
	     	        	if(j==2) {
	     	        		System.out.println("Your Chances Are Over--");
	     	        	    Student.chance();
	     	        	}
	     	        }
	        		break;}
	        	else
	        		System.out.println("Please Enter Correct Username");
	        	if(i==2) {
	        		System.out.println("Your Chances Are Over");
	        		
	        		Student.chance();
	        		
	        	}
	        }
	        
	        
	        
	       
	   
		
	        
	}
   
   public void Librarianlogin() throws IOException {
	   Scanner scan = new Scanner(System.in);
	   File f = new File("librarian.txt");
       while(!f.exists()){
           f.createNewFile();}
       FileReader f11 = new  FileReader(f);
       BufferedReader f22= new  BufferedReader(f11);
       String f3 = f22.readLine();
       String[] line = f3.split(",");
       Set<String> s33 = new HashSet<>();
		for(String w:line) {
			s33.add(w);
		}
       f22.close();
       
       
       
       for(int i=0;i<3;i++) {
    	   System.out.println("    ....   Librarian Login   ....");
       	System.out.println("Enter Username");
	        username2=scan.nextLine();
       	if(s33.contains(username2)) {
       		 for(int j=0;j<3;j++) {
    	        	System.out.println("Enter Password");
    		        password2=scan.nextLine();
    	        	if(s33.contains(password2)) {
    	        		System.out.println("Successfully Logined");
    	        		LIBRARIAN l = new LIBRARIAN();
    	        		l.library();
    	        		break;}
    	        	else {
    	        		System.out.println("Please Enter Correct Password");}
    	        	if(j==2) {
    	        		System.out.println("Your Chances Are Over - Login Again");
    	        		
    	        		
    	        	}
    	        }
       		break;}
       	else
       		System.out.println("Please Enter Correct Username");
       	if(i==2) {
       		System.out.println("Your Chances Are Over - Login Again");
       		
       	}
       	
   }
       
}
 
   public  void Adminlogin() throws IOException {
	   
	   Scanner scan = new Scanner(System.in);
       File f = new File("admin.txt");
       while(!f.exists()){
           f.createNewFile();}
       FileReader f11 = new  FileReader(f);
       BufferedReader f22= new  BufferedReader(f11);
       String f3 = f22.readLine();
       String[] line = f3.split(",");
       Set<String> s33 = new HashSet<>();
		for(String w:line) {
			s33.add(w);
		}
       
       
       for(int i=0;i<3;i++) {
    	  System.out.println("    ....   Admin Login   ....");
       	System.out.println("Enter Username");
	        username1=scan.nextLine();
       	if(s33.contains(username1)) {
       		 for(int j=0;j<3;j++) {
    	        	System.out.println("Enter Password");
    		        password1=scan.nextLine();
    	        	if(s33.contains(password1)) {
    	        		System.out.println("Successfully Logined");
    	        		admin.adminid();
    	        		break;}
    	        	else {
    	        		System.out.println("Please Enter Correct Password   -- Weak Password");}
    	        	if(j==2) {
    	        		System.out.println("Your Chances Are Over Try To Login Again");
    	        		
    	        	}
    	        }
       		break;}
       	else
       		System.out.println("Please Enter Correct Username");
       	if(i==2) {
       		System.out.println("Your Chances Are Over Try To Login Again");
       		
       	}
       	
       }
   }
   public static void Substafflogin() throws IOException {
		 Scanner scan = new Scanner(System.in);
		 LibraryManagement l1 = new LibraryManagement();
	        
	        File f4 = new File("substaff.txt");
	        FileReader f11 = new  FileReader(f4);
	        BufferedReader f22= new  BufferedReader(f11);
	        String f3;
		      String f41 = "";
		       while((f3=f22.readLine())!=null) {
		    	    f41 = f41 +f3;
		       }
		       String[] f44 = f41.split(",");
	       f22.close();
	        Set<String> s33 = new HashSet<>();
			for(String w:f44) {
				s33.add(w);
			}
	        for(int i=0;i<3;i++) {
	        	System.out.println("Enter Username");
		        login1=scan.nextLine();
	        	if(s33.contains(login1)) {
	        		 for(int j=0;j<3;j++) {
	     	        	System.out.println("Enter Password");
	     		        login2=scan.nextLine();
	     	        	if(s33.contains(login2)) {
	     	        		System.out.println("You Have Logined Successfully");
	     	        		SUBSTAFF s = new SUBSTAFF();
	     	        		s.library();
	     	        		
	     	        		break;}
	     	        	else {
	     	        		System.out.println("Please Enter Correct Password");}
	     	        	if(j==2) {
	     	        		System.out.println("Your Chances Are Over--");
	     	        	    
	     	        	}
	     	        }
	        		break;}
	        	else
	        		System.out.println("Please Enter Correct Username");
	        	if(i==2) {
	        		System.out.println("Your Chances Are Over");
	        		
	        		
	        		
	        	}
	        }
	        
	        
	        
	       
	   
		
	        
	}
   public void records() throws IOException {
		   File f = new File("records1.txt");
		   if(!f.exists()) {
			   f.createNewFile();
		   }
		   FileReader f1 = new FileReader(f);
		   BufferedReader f2 = new BufferedReader(f1);
		   String d;
		   while((d = f2.readLine())!=null) {
			   System.out.println(d);
		   }
		   f2.close();
		   System.out.println("          ***********  PRINTING DETAILS OF BOOKS   **************             ");
		   File r = new File("book1.txt");
		   Scanner i = new Scanner(r);
		  
		   while(i.hasNext()) {
			   String o = i.nextLine();
			   String[] o1 = o.split(",");
			   
			   System.out.println("NAME- "+o1[0]+"\t"+"AUTHOR- "+o1[1]+"\t"+"TYPE "+o1[2]);
		   }
	   }
   public void logout() {
		   System.out.println("                     ---  Thank You For Visiting Our Site  ---");
	   }
  
 }
 
       
