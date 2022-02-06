import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
 
public abstract class  STAFF {
    String Username;
    private String Password;
    int BookFine;
    
    abstract void library() throws IOException;
	
    
    public String GetPassword(){
        return Password;
    }
    
    public void Changepassword(String Password){
        this.Password=Password;
    }
    public static void GiveFine(){
    	System.out.println("                  *********  GIVEFINE  **********                ");
        System.out.println("Printing details of books which have been taken ");
        File f = new File("book1.txt");
        
        try{
        Scanner u = new Scanner(f);
        while(u.hasNext()){
            String a = u.nextLine();
            String[] i = a.split(",");
            if(Boolean.parseBoolean(i[6])){
            System.out.println("BOOK NAME :"+i[0]+" BOOK ID :"+i[3]+" ASSIGNED TO : "+i[4]+" DUE DATE : "+i[5]);
        }
        
    }
    
}
    catch(FileNotFoundException e){
        e.printStackTrace();
    }
  
   boolean p = true;
   Scanner in = new Scanner(System.in);
   System.out.println("Enter the no of books  for giving fine");
   int a1 = in.nextInt();
  
   Scanner in1 = new Scanner(System.in);
   ArrayList<String> a3 = new ArrayList<>();
   for(int a2=1;a2<a1+1;a2++){
       
       System.out.println("book"+" "+a2);
       System.out.println("Enter the name of Book ");
       String h = in1.nextLine();
       System.out.println("Enter the fine for the Book ");
       String j = in1.nextLine();
       String r = h+","+j;
       a3.add(r);
       
   }
   try{
       File F = new File("Bookfine.txt");
       while(!F.exists()){
           F.createNewFile();
       }
       FileWriter f1 = new FileWriter(F,true);
       PrintWriter pw = new PrintWriter(f1);
       for(String i1:a3){
           pw.println(i1);
           pw.flush();
       }
       pw.close();
       System.out.println("Your Fine Is Updated");
   }
   catch(IOException ioe){
         ioe.printStackTrace();
    
}
   
   
   
    
    }
    public static void viewfine() throws IOException {
    	File F = new File("Bookfine.txt");
        while(!F.exists()){
            F.createNewFile();
        }
        FileReader f1 = new FileReader(F);
        BufferedReader f2 = new BufferedReader(f1);
        
        String line;
        while((line=f2.readLine())!=null) {
        	System.out.println(line);
        }
    }
}
    
class LIBRARIAN extends STAFF {
    String Name;
    String ID;
    public static void AddBook(){System.out.println("                  *********  ADDING BOOK  **********                ");
    	Scanner scan = new Scanner(System.in);
    	System.out.println("enter Title");
    	String Titl = scan.nextLine();
    	System.out.println("enter Autho");
    	String Autho = scan.nextLine();
    	System.out.println("enter BookTyp");
    	String BookTyp = scan.nextLine();
    	
    	System.out.println("enter id");
    	String ID = scan.nextLine();
    	
        BOOK b1=new BOOK();
        b1.Title=Titl;
        b1.Author=Autho;
        b1.BookType=BookTyp;
        b1.BookId=ID;
        File f3 = new File("book1.txt");
       
        try{
            FileWriter fw = new FileWriter(f3,true);
            PrintWriter pw = new PrintWriter(fw);
            String s = b1.Title + ","+b1.Author+","+b1.BookType+","+b1.BookId+","+b1.AssignedTo+","+b1.Duedate+","+(Boolean.toString(b1.Status));
            pw.println(s);
            
            
            pw.flush();
            pw.close();
            
            System.out.println("Successfully Added");
            
        }
        catch(IOException ioe){
         ioe.printStackTrace();
      }
        }
    public static void RemoveBook(){
    	System.out.println("                  ********* REMOVING  **********                ");
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter Title");
    	String Titl = scan.nextLine();
        File f = new File("book1.txt");
        String f4 = Titl;
        ArrayList<String> a1 = new ArrayList<>(); 
        try{
            Scanner in = new Scanner(f);
            while(in.hasNext()){
                String a=in.nextLine();
                a1.add(a);
                
            }
           
            Iterator<String> l = a1.iterator();
            boolean j = true;
            while(l.hasNext()){
                String o= l.next();
                if(o.contains(f4)){
                    l.remove();
                    System.out.println("Book Removed Successfully");
                    j=true;
                    break;
                }
                else {
                	
                	j=false;
                }
            }
            if(j==false) {
            	System.out.println("Book not found try again");
            }
            
            
            
            in.close();
            
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            for(String s1:a1){
                pw.println(s1);
                pw.flush();
            }
            pw.close();
        }
        catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    catch(IOException ioe){
         ioe.printStackTrace();
      }
    
    
    }
    public static void RemoveBookId(){
    	System.out.println("                  ********* REMOVING  **********                ");
    	Scanner scan = new Scanner(System.in);
    	System.out.println("enter id");
    	String ID = scan.nextLine();
        File f = new File("book1.txt");
        String f4 = ID;
        ArrayList<String> a1 = new ArrayList<>(); 
        try{
            Scanner in = new Scanner(f);
            while(in.hasNext()){
                String a=in.nextLine();
                a1.add(a);
                
            }
            boolean j = true;
            Iterator<String> l = a1.iterator();
            while(l.hasNext()){
                String o= l.next();
                if(o.contains(f4)){
                    l.remove();
                    System.out.println("Book Removed Successfully");
                    j=true;
                    break;
                }
                else {
                	
                	j=false;
                }
            }
            if(j==false) {
            	System.out.println("Book not found try again");
            }
            
            
            
            in.close();
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            for(String s1:a1){
                pw.println(s1);
                pw.flush();
            }
            pw.close();
        }
        catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    catch(IOException ioe){
         ioe.printStackTrace();
      }
    
    }
    public void library() throws IOException {
    	Scanner scan = new Scanner(System.in);
    	File f = new File("libraryinfo.txt");
    	try {
			FileReader f1 = new FileReader(f);
			BufferedReader f2 = new BufferedReader(f1);
			String line;
			while((line = f2.readLine())!=null) {
				System.out.println(line);
			}
			f2.close();
			while(1<2) {
				System.out.println("Enter The Key As Above");
				String m1 = scan.nextLine();
				if(m1.equals("1")) {
					AddBook();
				}
				else if(m1.equals("2")) {
					RemoveBook();
				}
				else if(m1.equals("3")) {
					RemoveBookId();
				}
				else if(m1.equals("4")) {
					GiveFine();
				}
				else if(m1.equals("5")) {
					viewfine();
				}
				
				else if(m1.equals("exit")) {
					System.out.println("                            %%%    Thank You For Visiting Our Site   %%%");
					break;
				}
				else {
					System.out.println(" Please Input Correct Key");
				}
				System.out.println("  ---   If You Want To Continue Enter Key Or exit");
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("some exception found");
			e.printStackTrace();
		}
    	
    }
    
    
    
    
}
    

class   SUBSTAFF extends STAFF{
        String Name;
        String ID;
        public void library() throws IOException {
        	Scanner scan = new Scanner(System.in);
        	File f = new File("substaffinfo.txt");
        	try {
    			FileReader f1 = new FileReader(f);
    			BufferedReader f2 = new BufferedReader(f1);
    			String line;
    			while((line = f2.readLine())!=null) {
    				System.out.println(line);
    			}
    			f2.close();
    			while(1<2) {
    				System.out.println("Enter The Key As Above");
    				String m1 = scan.nextLine();
    				if(m1.equals("1")) {
    					LIBRARIAN.AddBook();
    				}
    				
    				else if(m1.equals("2")) {
    					LIBRARIAN.GiveFine();
    				}
    				else if(m1.equals("3")) {
    					LIBRARIAN.viewfine();
    				}
    				
    				else if(m1.equals("exit")) {
    					System.out.println("                            %%%    Thank You For Visiting Our Site   %%%");
    					break;
    				}
    				else {
    					System.out.println(" Please Input Correct Key");
    				}
    				System.out.println("  ---   If You Want To Continue Enter Key Or exit");
    			}
    			
    			
    		} catch (FileNotFoundException e) {
    			System.out.println("some exception found");
    			e.printStackTrace();
    		}
        	
        }
        
        
    }
