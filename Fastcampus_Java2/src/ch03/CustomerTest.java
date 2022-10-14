package ch03;

public class CustomerTest {

    public static void main(String[] args) {

        /*Customer customerLee = new Customer();
        customerLee.setCustomerName("이동현");
        customerLee.setCustomerID(10001);
        customerLee.bonuspoint = 1000;
        System.out.println(customerLee.showCustomerInfo());
        */

        VIPCustomer customerKim = new VIPCustomer(10002, "김유정");
        customerKim.setCustomerName("김유정");
        customerKim.setCustomerID(10002);
        customerKim.bonuspoint = 10000;
        System.out.println(customerKim.showCustomerInfo());
    }
}
