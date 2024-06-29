public class Customer
{
    private long contactNumber;
    private String name;
    private String address;
    private int pinCode;
    private String password;

    public Customer(long contactNumber, String name, String address, int pinCode, String password) {
        this.contactNumber = contactNumber;
        this.name = name;
        this.address = address;
        this.pinCode = pinCode;
        this.password = password;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
