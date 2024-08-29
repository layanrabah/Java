
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
                Address address1 = new Address("USA", "Main St", 123);
                Address address2 = new Address("Israel", "King St", 456);

                items item1 = new items(1, 99.99);
                items item2 = new items(2, 499.99);


                Gift gift = new Gift();

        Costumor regularCustomer = new Costumor(
                        1,
                        "Layan",
                        "Rabah",
                        "Layan@gmail.com",
                        address1,
                        Costumor.CustomerType.REGULAR,
                        null, (List<items>) item1,null
                );
        Costumor vipCustomer = new Costumor(
                        2,
                        "Danny",
                        "Habaka",
                        "Danny@gmail.com",
                        address2,
                        Costumor.CustomerType.VIP,
                        0.10,
                        item2 , Gift gift
                );

                // Create Orders
                ArrayList<items> itemsList = new ArrayList<>();
                itemsList.add(item1);
                itemsList.add(item2);



        VipOrder vipOrder = new VipOrder(
                102,
                "VIP Order",
                address2,
                itemsList,
                "vipCustomer",
                Payment.CASH,
                LocalDate.now()
        );

        System.out.println("VIP Order created successfully.");
    }

                // Test total price calculation with discount
                System.out.println("Regular Order total price: $" + RegularOrder.getTotalPrice());
                System.out.println("VIP Order total price: $" + VipOrder.calculateOrderItems());

                // Test favorite items functionality
                regularCustomer.updateFavoriteItemsFromOrder(regularOrder);
                vipCustomer.updateFavoriteItemsFromOrder(vipOrder);

                System.out.println("Regular Customer's favorite items:");
                for (items item : regularCustomer.getFavoriteItems()) {
                    System.out.println(item.itemName());
                }

                System.out.println("VIP Customer's favorite items:");
                for (items item : Costumor.CustomerType.VIP.getFavoriteItems()) {
                    System.out.println(item.itemName());
                }

                // Test gift functionality
                System.out.println("Opening gifts:");
                RegularOrder.openGift();
                Gift.openGift();
}
        }

