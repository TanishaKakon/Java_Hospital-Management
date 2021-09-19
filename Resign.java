
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;


public class Resign {
     public static void main(String[] args)  {
        int id;
        String name;
        String speciality;
        String availability;
    
       try{
           Formatter formatter=new Formatter("C:/HProject/resign.txt");
           Scanner input=new Scanner(System.in);
           System.out.print("Doctor list:");
           int doctorList=input.nextInt();
           
           for(int i=1;i<=doctorList;i++){
               System.out.println("Enter Doctor's ID,Name,Speciality,Availability:");
               id=input.nextInt();
               name=input.next();
               speciality=input.next();
               availability=input.next();
               formatter.format("%d %s %s %s\r\n",id,name,speciality,availability);
           }
           formatter.close();
       }catch(IOException e){
           System.out.println("Exception occured");
    
    }
     }
}
