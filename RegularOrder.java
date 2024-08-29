import java.util.ArrayList;

public class RegularOrder extends Order {

    public RegularOrder(int id, String name, Address address, ArrayList<items> itemsInTheOrder, Customer orderCustomer, Payment payment, LocalDate orderDate) {
        super(id, name, address, itemsInTheOrder, orderCustomer, payment, orderDate);
    }

    @Override
    protected double calculateOrderTotalPrice() {
        return calculateOrderItems(); // Regular orders have no discount, just return the total items price
}
}

