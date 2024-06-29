public class PaymentDone implements PaymentMethod
{
    @Override
    public int cash(int bill) {
        System.out.println("2% Discount");
        bill*=0.98;
        System.out.println("After Discount bill:"+bill);
        System.out.println("18% GST");
        bill*=1.18;
        System.out.println("Delivery Chargers:50 Rs");
        bill+=50;
        return bill;
    }

    @Override
    public int upi(int bill) {
        System.out.println("18% GST");
        bill*=1.18;
        System.out.println("Delivery Chargers:50 Rs");
        bill+=50;
        return bill;
    }
}
