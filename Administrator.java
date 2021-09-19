 import java.io.*;
 import java.util.Scanner;
 
public class Administrator {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       
        
        try{
        System.out.println("Press (1) for Doctor's information\nPress (2) for Patient's information\nPress (3) for Patient's Updated information\nPress (4) for Doctor's Updated information");
        Scanner input=new Scanner(System.in);
        int press=input.nextInt();
        
        if(press==1){
            File dfile=new File("C:/HProject/doctor.txt");
            Scanner scan=new Scanner(dfile);    
            
            while(scan.hasNext()){
                int id=scan.nextInt();
                String name=scan.next();
                String speciality=scan.next();
                String availability=scan.next();
                
                System.out.println("Doctor's ID:"+id+" Name:"+name+"  Speciality:"+speciality+"  Availability:"+availability);
        }
            scan.close();
        }
        else if(press==2){
            File pfile=new File("C:/HProject/patient.txt");
            Scanner scan=new Scanner(pfile);
            while(scan.hasNext()){
                String name=scan.next();
                String gender=scan.next();
                int age=scan.nextInt();
                String disease=scan.next();
                int phone=scan.nextInt();
                System.out.println("Patient's Name:"+name+" Gender:"+gender+"  Age:"+age+"  Disease:"+disease+"  Phone:"+phone);
            }
            scan.close();
        }
        else if(press==3){
             PrintWriter pw=new PrintWriter("C:/HProject/PatOutput.txt");
        BufferedReader br1=new BufferedReader(new FileReader("C:/HProject/patient.txt"));
        String line1=br1.readLine();
        
        while(line1!=null){
            boolean flag=false;
            BufferedReader br2=new BufferedReader(new FileReader("C:/HProject/release.txt"));
            String line2=br2.readLine();
            
            while(line2!=null){
                if(line1.equals(line2)){
                    flag=true;
                    break;
                }
                line2=br2.readLine();
            }
           if(!flag)
               pw.println(line1);
           
           line1=br1.readLine();
        }
        pw.flush();
        
        br1.close();
        pw.close();
        
        System.out.println("File operation performed successfully");
        
          File pfile=new File("C:/HProject/PatOutput.txt");
            Scanner scan=new Scanner(pfile);
            while(scan.hasNext()){
                String name=scan.next();
                String gender=scan.next();
                int age=scan.nextInt();
                String disease=scan.next();
                int phone=scan.nextInt();
                System.out.println("Patient's Name:"+name+" Gender:"+gender+"  Age:"+age+"  Disease:"+disease+"  Phone:"+phone);
            }
            scan.close();
    }
        else if(press==4){
                    PrintWriter pw=new PrintWriter("C:/HProject/DocOutput.txt");
        BufferedReader br1=new BufferedReader(new FileReader("C:/HProject/doctor.txt"));
        String line1=br1.readLine();
        
        while(line1!=null){
            boolean flag=false;
            BufferedReader br2=new BufferedReader(new FileReader("C:/HProject/resign.txt"));
            String line2=br2.readLine();
            
            while(line2!=null){
                if(line1.equals(line2)){
                    flag=true;
                    break;
                }
                line2=br2.readLine();
            }
           if(!flag)
               pw.println(line1);
           
           line1=br1.readLine();
        }
        pw.flush();
        
        br1.close();
        pw.close();
        
        System.out.println("File operation performed successfully");
        
          File dfile=new File("C:/HProject/DocOutput.txt");
            Scanner scan=new Scanner(dfile);    
            
            while(scan.hasNext()){
                int id=scan.nextInt();
                String name=scan.next();
                String speciality=scan.next();
                String availability=scan.next();
                
                System.out.println("Doctor's ID:"+id+" Name:"+name+"  Speciality:"+speciality+"  Availability:"+availability);
        }
            scan.close();
        }
        }


        
    catch(IOException e){
            System.out.println("Exception occured");
}
   
}
 
 }