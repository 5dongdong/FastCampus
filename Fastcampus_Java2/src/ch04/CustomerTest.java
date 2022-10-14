package ch04;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customerLee = new Customer(10001, "이동현");
        customerLee.bonuspoint = 1000;
        int price = customerLee.calCPrice(1000);
        System.out.println(customerLee.showCustomerInfo() + price);
        

        VIPCustomer customerKim = new VIPCustomer(10002, "김유정");
        customerKim.bonuspoint = 10000;
        price = customerKim.calCPrice(1000);
        System.out.println(customerKim.showCustomerInfo() + price);
    }
}
