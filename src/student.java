
import java.io.BufferedReader;
import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

class Student {
	static String password;
	
	LibraryManagement l1;
	
	
	
	public static void checkAccount() throws IOException {
		     System.out.println("                                     ////    Acount Details    \\\\");
		Scanner scan = new Scanner(System.in);
		System.out.println("enter ur password");
		 password = scan.nextLine();
		File f = new File("student info.txt");
		FileReader  f1 = new FileReader(f);6
		BufferedReader f2 = new BufferedReader(f1);
		String line1;
		while((line1 = f2.readLine())!=null){
			if(line1.contains(password)) {
				System.out.println(line1);
			}
			
		}
		f2.close();
		
	}
	public static void forgetpassword()  {
		Scanner scan = new Scanner(System.in);
		
		try{File f = new File("student info.txt");
	    while(!f.exists()){
	           f.createNewFile();}
		   FileReader f11 = new  FileReader(f);
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
				System.out.println("Enter Your Username");
				String name = scan.nextLine();
				if(s33.contains(name)) {
					for(int j=0;j<3;j++) {
						System.out.println("Enter Your Institution Name");
						String clg = scan.nextLine();
						if(s33.contains(clg)) {
							File fw = new File("student info.txt");
							FileReader  f1 = new FileReader(fw);
							BufferedReader f2 = new BufferedReader(f1);
							String line1;
							while((line1 = f2.readLine())!=null){
								if(line1.contains(name)) {
									System.out.println("username || Password || institutionname-"+" "+line1);
									LibraryManagement l = new LibraryManagement();
									l.StudentLogin();
								}
								
							}
							f2.close();
							break;
						}
						else {
							System.out.println("Please Try Again");
						}
						if(j==2) {
							System.out.println(" <<<<   You Completed Your Trails Now Try Again   >>>>");
							forgetpassword();
						}
						
					}
					break;
					}
				else {
					System.out.println("            ???    Username Doesn't Exist Try again   ???    ");
					
			
			}
				if(i==2) {
					System.out.println("Your Chances Are Over ");
					forgetpassword();}
				}
			}
		catch(Exception e){
			System.out.println("file not created");
		}
			
	}
	public static void changepassword() throws IOException
    
    { 
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("                  *********  CHANGING PASSWORD   **********                ");
		File f = new File("student info.txt");
	    while(!f.exists()){
	           f.createNewFile();}
	       FileReader f11 = new  FileReader(f);
	       BufferedReader f22= new  BufferedReader(f11);
	       String f3;
		      String f41 = "";
		       while((f3=f22.readLine())!=null) {
		    	    f41 = f41 +f3;
		       }
		       String[] f44 = f41.split(",");
	       
	       Set<String> s33 = new HashSet<>();
			for(String w:f44) {
				s33.add(w);
			}
    System.out.println("enter ur old password");
	String oldString =scan.nextLine();
	if(s33.contains(oldString)) {
		System.out.println("enter your new password");
		String newString = scan.nextLine();
		File fileToBeModified = new File("student info.txt");
         
        String oldContent = "";
         
        BufferedReader reader = null;
         
        FileWriter writer = null;
         
        try
        {
            reader = new BufferedReader(new FileReader(fileToBeModified));
             
           
            String line = reader.readLine();
             
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();
                 
                line = reader.readLine();
            }
             
          
             
            String newContent = oldContent.replaceAll(oldString, newString);
             
            
             
            writer = new FileWriter(fileToBeModified);
             
            writer.write(newContent);
            System.out.println("Password Changed Successfully");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
               
                 
                reader.close();
                 
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
    
     
		
	}
	else {
		System.out.println("Please Input Correct Password");
	}
        
    
}
	public static void Membership() throws IOException {
		 Scanner scan = new Scanner(System.in);
		 
		 File f = new File("membership.txt");
		 try {
			FileReader f1 = new FileReader(f);
			BufferedReader f2 = new BufferedReader(f1);
			String f3;
			String f4 = "";
			while((f3=f2.readLine())!=null) {
				f4 = f4 + f3;
			}
			String[] f5 = f4.split(",");
			Set<String> f6 = new HashSet<>();
			for(String s1 : f5) {
				f6.add(s1);
			}
			for(int i=0;i<3;i++) {
				System.out.println("Enter Your Membership Id");
				 String Id = scan.next();
				if(f6.contains(Id)) {
					BOOK.books();
					break;
				}
				else {
					System.out.println("please Enter Correct Id Or Take MemberShip");
				}
				if(i==2) {
					System.out.println("                       >>>   Your Chances Are Over Take MemberShip Or Login again   <<<");
					break;}
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	public static void chance() throws IOException {
		   Scanner scan = new Scanner(System.in);
		   LibraryManagement l1 = new LibraryManagement();
		   System.out.println("1.Forget Password");
		   System.out.println("2.Register");
		   
		   while(1<2) {
			   System.out.println("Enter Your Selection");
			   String l2 = scan.nextLine();
			   if(l2.equals("1")) {
				   forgetpassword();
				   break;
			   }
			   else if(l2.equals("2")) {
				   l1.StudentRegistration();
				   break;
			   }
		   }
		   
		   
		   
	   }

	public static void takeBook(String bookname) throws IOException {
		System.out.println("                  ********* TAKING BOOK  **********                ");
        File bookFile = new File("book1.txt");
        if (!bookFile.exists()) {
            bookFile.createNewFile();}
        
        Scanner in = new Scanner(bookFile);
        ArrayList<String> g = new ArrayList<>();
        
        while(in.hasNext()){
            String a = in.nextLine();
            if((a.contains(bookname))){
                String[] h = a.split(",");
                if(Boolean.parseBoolean(h[6])==false){
                    System.out.println("Enter your name ");
                    Scanner d = new Scanner(System.in);
                    String Asto = d.nextLine();
                    h[4]=Asto;
                    System.out.println("Enter duedate according to your preference (max 3 weeks) in dd/mm/yyyy format");
                    String due = d.nextLine();
                    h[5]= due;
                    h[6]="true";
                    a=String.join(",",h[0],h[1],h[2],h[3],h[4],h[5],h[6]);
                    System.out.println("Suucessfully assigned the book to you ");
             }
             else{
                 System.out.println("Book is not available please try again ");
             }
             
         }
         
         g.add(a);
         
     }
     FileWriter bookFileReader = new FileWriter(bookFile);
    PrintWriter pw = new PrintWriter(bookFileReader);
         
    for(String S:g){
             pw.println(S);
             pw.flush();
    }
    pw.close();
    
}
	   
	   
	 
	
}
