import java.time.LocalDate;
import java.util.ArrayList;

public class VipOrder extends Order {

    public VipOrder(int id, String name, Address address, ArrayList<items> itemsInTheOrder, Customer orderCustomer, Payment payment, LocalDate orderDate) {
        super(id, name, address, itemsInTheOrder, orderCustomer, payment, orderDate);
    }

    @Override
    protected double calculateOrderTotalPrice() {
        double total = calculateOrderItems();

        if (getOrderCustomer().getCostumorType() == Customer.CustomerType.VIP) {
            Double customerDiscount = getOrderCustomer().getCustomerDiscount();
            if (customerDiscount != null) {
                total = total * (1 - customerDiscount / 100);
            }
        }

        return total;
}
}
