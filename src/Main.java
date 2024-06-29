public class Main
{
    public static void main(String[] args) {
        System.out.println("Welcome to the Our Hotel ");
        Logic l= new Logic();
        ChoiceConcreteMethod c= new ChoiceConcreteMethod();
        boolean operation=true;
        while (operation){
            int choice=l.takingChoice();
            switch (choice){
                case 1:
                    c.displayMenu();
                    break;
                case 2:
                    c.viewBill();
                    break;
                case 3:
                    c.CancelOrder();
                    break;
                case 4:
                    c.Exit();
                    operation=false;
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
