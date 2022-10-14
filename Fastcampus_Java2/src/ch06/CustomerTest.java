package ch06;

import java.util.ArrayList;

public class CustomerTest {

    public static void main(String[] args) {

        ArrayList<Customer> customerList = new ArrayList<>();

        Customer customerT = new Customer(10001, "Tomas");
        Customer customerA = new Customer(10002, "Angel");
        Customer customerE = new GoldCustomer(10003, "Eric");
        Customer customerQ = new GoldCustomer(10004, "Que");
        Customer customerW = new VIPCustomer(10005, "What");

        customerList.add(customerT);
        customerList.add(customerA);
        customerList.add(customerE);
        customerList.add(customerQ);
        customerList.add(customerW);

//        for( Customer customer : customerList){
//            System.out.println(customer.showCustomerInfo());
//        }
//
//        int price = 10000;
//        for(Customer customer: customerList){
//
//            int cost = customer.calCPrice(price);
//            System.out.println(customer.getCustomerName() + "님이" + cost + "원 지불하셧습니다.");
//            System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는" + customer.bonuspoint + "입니다.");
//        }
//
//
//    }
        if( customerE instanceof GoldCustomer){
            GoldCustomer vc = (GoldCustomer)customerE;
            System.out.println(customerE.showCustomerInfo());
        }
    }
}
