
 import java.io.IOException;
 import java.util.Formatter;
 import java.util.Scanner;
 
public class Patient {
    public static void main(String[] args) {
        String name;
        String gender;
        int age;
        String disease;
        int phone;
        
        try{
            Formatter formatter=new Formatter("C:/HProject/patient.txt");
           Scanner input=new Scanner(System.in);
           System.out.print("Patient Number:");
           int patientinformation=input.nextInt();
           
           for(int i=1;i<=patientinformation;i++){
               System.out.println("Enter Patient's name,gender,age,disease,phone:");
             name=input.next();
             gender=input.next();
             age=input.nextInt();
             disease=input.next();
             phone=input.nextInt();
             formatter.format("%s %s %d %s %d\r\n",name,gender,age,disease,phone);
        }
           formatter.close();
    }catch(IOException e){
            System.out.println("Exception occured");
    }
}
}