package ch03;

public class Customer {

    protected  int customerID; //private은 외부 클래스에서 접근이 불가능하지만 protected는 하위 클래스에서 접근 가능
    protected String customerName;
    protected String customerGrade;
    int bonuspoint;
    double bonusRatio;




    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;

        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calCPrice(int price){
        bonuspoint += price * bonusRatio;
        return price;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public String showCustomerInfo(){
        return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonuspoint + "입니다.";
    }
}
