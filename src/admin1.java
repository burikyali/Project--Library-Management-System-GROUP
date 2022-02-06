

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class admin{
	static String Id;
	public static void adminid() {
    	Scanner scan = new Scanner(System.in);
    	File f = new File("admin.txt");
       
        try{FileReader f11 = new  FileReader(f);
        BufferedReader f22= new  BufferedReader(f11);
        String f3 = f22.readLine();
        String[] line = f3.split(",");
        Set<String> s33 = new HashSet<>();
 		for(String w:line) {
 			s33.add(w);
 		}
        
    	for(int i=0;i<3;i++) {
    		System.out.println("Enter Your Id:");
    		 Id = scan.nextLine();
    		if(s33.contains(Id)) {
    			admin1();
    			break;
    		}
    		else{
    			System.out.println("Please Enter Correct Id");
    		}
    		if(i==2) {
    			System.out.println("Your Chances Are Over");
    		}
    	}}
        catch(Exception e) {
        	System.out.println("Something Went Wrong");
        }}
    public static void AddLibrarian(){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the name of librarian");
            System.out.println("                  --------- ADDING LIBRARIAN  --------                ");
            String o1 = in.nextLine();
            LIBRARIAN l1 = new LIBRARIAN();
            l1.Name = o1;
            System.out.println("Enter the username of librarian");
            String o2 = in.nextLine();
            l1.Username = o2;
            System.out.println("Enter the password for librarian");
            String o3 = in.nextLine();
            l1.Changepassword(o3);
            System.out.println("Enter the ID of librarian");
           String o4 = in.nextLine();
            l1.ID = o4;
            File f = new File("librarian.txt");
            while(!f.exists()){
                try
                {
                    f.createNewFile();
                }
                catch (IOException ioe)
                {
                    ioe.printStackTrace();
                }}
            try{
                FileWriter fw = new FileWriter(f);
                PrintWriter pw = new PrintWriter(fw);
                pw.println(o2+","+o3+","+o4);
                pw.flush();
                pw.close();
                
                System.out.println("Successfully Added");
                
            }
            catch(IOException ioe){
             ioe.printStackTrace();
          }
        }
    public static void AddSubstaff(){
                Scanner in = new Scanner(System.in);
                System.out.println("                  --------- ADDING SUBSTAFF --------                ");
                System.out.println("Enter the name of substaff");
                String o1 = in.nextLine();
                SUBSTAFF l1 = new SUBSTAFF();
                l1.Name = o1;
                System.out.println("Enter the username of substaff");
                String o2 = in.nextLine();
                l1.Username = o2;
                System.out.println("Enter the password for substaff");
                String o3 = in.nextLine();
                l1.Changepassword(o3);
                System.out.println("Enter the ID of substaff");
                String o4 = in.nextLine();
                l1.ID = o4;
                File f = new File("substaff.txt");
                while(!f.exists()){
                    try
                    {
                        f.createNewFile();
                    }
                    catch (IOException ioe)
                    {
                        ioe.printStackTrace();
                    }}
                try{
                    FileWriter fw = new FileWriter(f,true);
                    PrintWriter pw = new PrintWriter(fw);
                    pw.println(o2+","+o3+","+o4);
                    pw.flush();
                    pw.close();
                    
                    
                    System.out.println("Sucessfully Added");
                }
                catch(IOException ioe){
                 ioe.printStackTrace();
              }
            }
    public static void removesubstaff(){
                Scanner in = new Scanner(System.in);
                System.out.println("                  --------- REMOVING SUBSTAFF --------                ");
                System.out.println("Enter the ID of substaff");
                String o3 = in.nextLine();
                File f = new File("substaff.txt");
                ArrayList<String> a = new ArrayList<>();
                try{
                Scanner fc = new Scanner(f);
                while(fc.hasNext()){
                    String y = fc.nextLine();
                    if(!y.contains(o3)){
                        a.add(y);
                    }
                }
                fc.close();
            }
            catch(FileNotFoundException e){
                System.out.println("substaff File not found ");
            }
           
            try{
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            for(String i : a){
                pw.println(i);
                pw.flush();
            }
            pw.close();
            System.out.println("Successfully removed substaff");
        }
        catch(IOException e){
            e.printStackTrace();
        }
        }
    public  static void admin1() throws IOException {
    	Scanner scan = new Scanner(System.in);
    	
			while(1<2) {
				File f = new File("admininfo.txt");
		    	try {
					FileReader f1 = new FileReader(f);
					BufferedReader f2 = new BufferedReader(f1);
					String line;
					while((line = f2.readLine())!=null) {
						System.out.println(line);
					}
					f2.close();
				System.out.println("Enter The Key As Above");
				String m1 = scan.nextLine();
				
				
				
				 if(m1.equals("exit")) {
					System.out.println("                            %%%    Thank You For Visiting Our Site   %%%");
					break;
				}
				else if(m1.equals("1")) {
					File file =new File("bookfeedback.txt");
			        if(!file.exists()){
			           file.createNewFile();
			                       
			        }
			        FileReader fw = new FileReader(file);
			        BufferedReader bw = new BufferedReader(fw);
			        String line1;
			        while((line1=bw.readLine())!=null) {
			        	System.out.println(line1);
			        }
			        bw.close();
				}
				else if(m1.equals("2")) {
					admin.AddSubstaff();
				}
				else if(m1.equals("3")) {
					admin.removesubstaff();
				}
				else if(m1.equals("4")) {
					admin.AddLibrarian();
				}
				else {
					System.out.println(" Please Input Correct Key");
				}
				System.out.println("  ---   If You Want To Continue Enter Key Or exit");
			}
			
			
		 catch (FileNotFoundException e) {
			System.out.println("some exception found");
			e.printStackTrace();
		}
    }
}}

