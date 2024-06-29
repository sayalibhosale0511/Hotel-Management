import java.util.Scanner;

public class ChoiceConcreteMethod implements FirstChoice {
    static Scanner sc= new Scanner(System.in);
    static boolean login=false;

    @Override
    public void displayMenu() {
        Logic l=new Logic();
        if(login){
            Hotel h=new Hotel();
            h.MenuType();
            return;
        }
        System.out.println("Select Option\n1:Already have an Account\n2:New User");
        int choice=sc.nextInt();
        if(choice==1)
        {
            System.out.println("Enter Contact Number");
            long number=sc.nextLong();
            System.out.println("Enter Password");
            String pass=sc.next();
            l.checkAccount(number,pass);
        } else if (choice==2) {
            l.createAccount();
        }else {
            ChoiceConcreteMethod c=new ChoiceConcreteMethod();
            System.out.println("Invalid Choice\n Try Again!!!\n");
            c.displayMenu();
        }
    }

    @Override
    public void viewBill() {
        Hotel h= new Hotel();
        h.displayBill();
    }

    @Override
    public void CancelOrder() {
        Hotel h= new Hotel();
        h.cancelOrder();
    }

    @Override
    public void Exit() {

    }
}
