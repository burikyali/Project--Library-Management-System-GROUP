
import java.util.*;
import java.io.*;
public class BOOK implements Serializable {
String Title;

String Author;

static boolean Status;

String BookId;

String BookType;

String AssignedTo;

String Duedate;


BOOK(){
    BookId="";
}


public static void feedback() {
    try{
    	Scanner scan = new Scanner(System.in);
    	System.out.println("enter title of the book");
    	String Title = scan.nextLine();
    	System.out.println("please enter your feedback:");
    	String s = scan.nextLine();
        File file =new File("bookfeedback.txt");
        if(!file.exists()){
           file.createNewFile();
                       
        }
        FileWriter fw = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter p1 = new PrintWriter(bw);
        p1.println(Title+"\t"+s);
        p1.close();
  }
  catch(IOException ioe){
         System.out.println("Exception occurred:");
         ioe.printStackTrace();
    }
}
public static void Searchbook() {
	System.out.println("                  ********* SEARCHING  **********                ");
	Scanner scan = new Scanner(System.in);
	System.out.println("search book:");
	String j = scan.nextLine();
    File f = new File("book1.txt");
    ArrayList<BOOK> b2 = new ArrayList<>();
    boolean b = false;
    try {
          Scanner in = new Scanner(f);
          while(in.hasNext()) {
                    
                    String a = in.nextLine();
                    String[] fr = a.split(",");
                    
                    if(a.contains(j)){
                    BOOK o = new BOOK();
                    o.Title=fr[0];
                    o.Author=fr[1];
                    o.BookType=fr[2];
                    o.BookId=(fr[3]);
                    o.AssignedTo=fr[4];
                    o.Duedate=fr[5];
                    o.Status=Boolean.parseBoolean(fr[6]);
                    System.out.println("Title is "+o.Title);
                    System.out.println("Author is "+o.Author);
                    System.out.println("BookId is "+o.BookId);
                    b=true;
                    break;
            }
                    else {
                    	b=false;
                    }
                    
            
                
                
               
        
        
        
       
}
          if(b==false) {
        	  System.out.println("Book not found try again");
          }
  
    
             
        
        }
     catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
       
    
    
}
	
	
	
    
    
    
       
    
    

public static void Searchbookid() {
	System.out.println("                  ********* SEARCHING  **********                ");
	Scanner scan = new Scanner(System.in);
	System.out.println("please enter id: ");
	String j = scan.nextLine();
    File f = new File("book1.txt");
    ArrayList<BOOK> b2 = new ArrayList<>();
    boolean b = false;
    try {
          Scanner in = new Scanner(f);
          while(in.hasNext()) {
                    
                    String a = in.nextLine();
                    String[] fr = a.split(",");
                    
                    if(a.contains(j)){
                    BOOK o = new BOOK();
                    o.Title=fr[0];
                    o.Author=fr[1];
                    o.BookType=fr[2];
                    o.BookId=(fr[3]);
                    o.AssignedTo=fr[4];
                    o.Duedate=fr[5];
                    o.Status=Boolean.parseBoolean(fr[6]);
                    System.out.println("Title is "+o.Title);
                    System.out.println("Author is "+o.Author);
                    System.out.println("BookId is "+o.BookId);
                    b=true;
                    break;
            }
                    else {
                    	b=false;
                    }
                    
            
                
                
               
        
        
        
       
}
          if(b==false) {
        	  System.out.println("Book not found try again");
          }
  
    
             
        
        }
     catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
       
    
    
}
public static void books() throws IOException{
	Scanner scan1 = new Scanner(System.in);
	
	File re = new File("Book.txt");
	if(!re.exists()) {
		re.createNewFile();
	}
	FileReader ree =  new FileReader(re);
	BufferedReader h = new BufferedReader(ree);
	String line;
	while((line=h.readLine())!=null) {
		System.out.println(line);
	}
	while (1<2) {
		System.out.println("Enter the Key");
		String k = scan1.nextLine();
		if(k.equals("c")) {
			feedback();
			System.out.println("                             *******Thank You For Your Feedback*******");
		}
		
		else if(k.equals("a")) {
			Searchbook();
		}
		else if(k.equals("b")) {
			Searchbookid();
		}
		else if(k.equals("d")) {
			Student.changepassword();
		}
		else if(k.equals("e")){
			Student.checkAccount();
		}
		else if(k.equals("f")) {
			Scanner y = new Scanner(System.in);
			System.out.println("Enter the name of the book ");
			String f = y.nextLine();
			Student.takeBook(f);
		}
		else if(k.equals("exit")) {
			System.out.println("                                    ###    Redirected To Main Page   ### ");
			
			break;
		}
		System.out.println("              !!!!   If You Want To Continue Enter Key Or Exit   !!!!");
	}
	
	
	
}
}
    
	
    
    
    
       
    
