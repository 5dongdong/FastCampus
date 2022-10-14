package ch04;

public class VIPCustomer extends Customer {


    double salesRatio;
    private String agentID;



    /*public VIPCustomer(){

        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";

        System.out.println("VipCustomer() call");
    }*/

    public VIPCustomer(int customerID, String customerName){
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    @Override //메소드를 재정의했다는 의미
    public int calCPrice(int price) {
        bonuspoint += price * bonusRatio;
        price -= (int)(price * salesRatio);
        return price;
    }

    public String getAgentID(){
        return agentID;
    }
}
