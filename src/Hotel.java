import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Hotel
{
    static Scanner sc = new Scanner(System.in);
    String item;
    int price;

    static String paymentMode;
    Order o=null;
    static ArrayList<Order> ao=new ArrayList<>();

    void displayMenu(){
        System.out.println();
    }

    void MenuType(){
        Hotel h= new Hotel();
        System.out.println("Select Options\n1:Today's Special\n2:Veg\n3:Non-veg");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                h.todaySpecial();
                break;
            case 2:
                h.veg();
                break;
            case 3:
                h.nonVeg();
                break;
            default:
                System.out.println("Select Correct Option");
                h.MenuType();
                break;
        }
    }

    void todaySpecial(){
        System.out.println("Today's Special");
        System.out.println("1) Biryani-349");
        System.out.println("2) Chicken Masala-249");
        int spl=sc.nextInt();
        if(spl==1){
            o=new Order("Biryani",349);
            ao.add(o);
        } else if (spl==2) {
            o=new Order("Chicken Masala",249);
            ao.add(o);
        }else {
            System.out.println("Invalid Choice");
        }
    }

    void veg(){
        System.out.println("Today's Special");
        System.out.println("1) Paner Sundarei-175");
        System.out.println("2) Dal Tadka -99");
        int v=sc.nextInt();
        if(v==1){
            o=new Order("Paner Sundari",175);
            ao.add(o);
        } else if (v==2) {
            o=new Order("Dal Tadka",99);
            ao.add(o);
        }else {
            System.out.println("Invalid Choice");
        }
    }

    void nonVeg(){
        System.out.println("Today's Special");
        System.out.println("1) Mutan Tanduri-499");
        System.out.println("2) Fish Fry-449");
        int nv=sc.nextInt();
        if(nv==1){
            o=new Order("Mutan Tanduri",499);
            ao.add(o);
        } else if (nv==2) {
            o=new Order("Fish Fry",449);
            ao.add(o);
        }else {
            System.out.println("Invalid Choice");
        }
    }

    public void displayBill() {
        Iterator<Order> lit=ao.iterator();
        if(!lit.hasNext()){
            System.out.println("First Place Order");
            return;
        }
        int bill=0;

        for(Order io:ao){
            System.out.println(io.itemName+"\t"+io.price);
            bill+=io.price;
        }

        System.out.println("Select Payment Option\n1:Pay By Cash\n2:UPI Payment\ndefault:Main Menu");
        int payment=0;
        try{
            payment=sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println(e);
            return;
        }
        PaymentDone p=new PaymentDone();
        if(payment==1){
            bill=p.cash(bill);
            System.out.println("Final Bill Amount="+bill);
            paymentMode="cash";
        } else if (payment==2) {
            bill=p.upi(bill);
            System.out.println("Final Bill Amount="+bill);
            paymentMode="upi";
        }else {
            System.out.println("Invalid Choice");
        }
    }

    public void cancelOrder(){
        System.out.println("Select item you want to delete");
        int no=1;
        for(Order io:ao){
            System.out.println(no+")"+io.itemName+"\t"+io.price);
            no++;
        }
        int num=sc.nextInt()-1;
        ao.remove(num);
        System.out.println("Item Removed!");
    }
}
