import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Order {
    private int id ;
    private String name;
    private Address address ;
    private ArrayList<items> itemsInTheOrder ;
    private String orderCustomer;
    private Payment payment ;
    private LocalDate orderDate;





    public Order(int id, String name, Address address, ArrayList<items> itemsInTheOrder, String orderCustomer, Payment payment, LocalDate orderDate ) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.itemsInTheOrder = itemsInTheOrder;
        this.orderCustomer = orderCustomer;
        this.payment = payment;
        this.orderDate = orderDate;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<items> getItemsInTheOrder() {
        return itemsInTheOrder;
    }

    public void setItemsInTheOrder(ArrayList<items> itemsInTheOrder) {
        this.itemsInTheOrder = itemsInTheOrder;
    }

    public String getOrderCustomer() {
        return orderCustomer;
    }

    public void setOrderCustomer(String orderCustomer) {
        this.orderCustomer = orderCustomer;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }


        public double calculateOrderItems() {
            double totalOrderItems = 0.0;
            for (items item : itemsInTheOrder) {
                totalOrderItems += item.getPrice();
            }
            return totalOrderItems;
        }

    protected abstract double calculateOrderTotalPrice();

//    private void updateCostumorFavoraiteItemList(
//            ArrayList<items> favoriteitems =Costumor.getfavoriteItems()
//for(items item : items ){
//
//    }

}

