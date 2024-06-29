import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Logic {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Customer> al= new ArrayList<>();

    {
        Customer c1=new Customer(7218853184L,"Sayali","Saswad",412303,"Sayali@05");
        Customer c2=new Customer(8888656272L,"AB","YAWAT",412212,"Aba@9090");
        Customer c3=new Customer(9119408685L,"ST","PUNE",412234,"Shopping#1234");
        al.add(c1);
        al.add(c2);
        al.add(c3);
    }

    int takingChoice(){
        System.out.println("1:Display Menu\n2:View Bill\n3:Cancel Order\n4:Exit");
        int choice=sc.nextInt();
        return choice;
    }

    void createAccount(){
        System.out.println("Enter Contact Number");
        long number=sc.nextLong();
        System.out.println("Enter Name");
        String name=sc.next();
        System.out.println("Enter Address");
        sc.nextLine();
        String address=sc.nextLine();
        System.out.println("Enter Pin Code");
        int pin=sc.nextInt();
        System.out.println("Enter Password");
        String pass1=sc.next();
        System.out.println("Confirm Password");
        String pass2=sc.next();
        if(number>= 7000000000L && number<= 10000000000L && pass1.equals(pass2)){
            boolean AZ=false;
            boolean az=false;
            boolean sp=false;
            char [] pass=pass2.toCharArray();
            for(int i=0;i<pass.length;i++){
                char c=pass[i];
                if(c>='A' && c<='Z'){
                    AZ=true;
                }
                if(c>='a' && c<='z'){
                    az=true;
                }if((c>32 && c<48) || (c>57 && c<65) || (c>90 && c<97) || (c>122 && c<127)){
                    sp=true;
                }
            }
            if(az && AZ && sp){
                Customer c= new Customer(number,name,address,pin,pass1);
                al.add(c);
                System.out.println("Account Created Successfully!");
            }else {
                System.out.println("Password Does not Sastify the Condition!");
            }
        }else {
            System.out.println("Something Went Wrong!");
        }
    }

    void checkAccount(long number, String password){
        for (Iterator<Customer> it = al.iterator(); it.hasNext();) {
            Customer c=it.next();
            int a=Long.compare(c.getContactNumber(),number);
            if(a==0 && password.equals(c.getPassword())){
                System.out.println("login Successful");
                Hotel h=new Hotel();
                h.MenuType();
                ChoiceConcreteMethod.login=true;
                return;
            }
        }
        System.out.println("Invalid Contact sNumber/Password");
    }
}
