import java.util.ArrayList;
import java.util.List;

public class Costumor {
    public static CustomerType CostumerType;
    private static int idCounter = 0;
//    to be fair this is from chatGPT
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private Address deliveryAddress ;
    private CustomerType customerType;
    private Double customerDiscount;
    private List<items> favoriteItems;
    private final Gift customerGift ;



    public enum CustomerType {
        REGULAR,
        VIP
    }

    public Costumor(int id, String firstName, String lastName, String email, Address deliveryAddress, CustomerType customerType, Double customerDiscount, List<items> favoriteItems, Gift customerGift)  {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.deliveryAddress = deliveryAddress;
        this.customerType = customerType;
        this.customerDiscount = customerDiscount;
        this.favoriteItems = favoriteItems;
        this.customerGift = customerGift;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Costumor.idCounter = idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Double getCustomerDiscount() {
        return customerDiscount;
    }

    public void setCustomerDiscount(Double customerDiscount) {
        this.customerDiscount = customerDiscount;
    }

    public List<items> getFavoriteItems() {
        return favoriteItems;
    }

    public void setFavoriteItems(List<items> favoriteItems) {
        this.favoriteItems = favoriteItems;
    }


    public Gift getCostumerGift() {
        return customerGift;
    }

    public void addToFavoriteItems(items item) {
        if (!favoriteItems.contains(item)) {
            favoriteItems.add(item);
        }
    }

    public void removeFromFavoriteItems(items item) {
        favoriteItems.remove(item);
    }

    public void updateFavoriteItemsFromOrder(Order order) {
        for (items item : order.getItemsInTheOrder()) {
            addToFavoriteItems(item);
        }
    }

    public static CustomerType getCostumerType() {
        return CostumerType;
    }

    public void openGift() {
        if (customerGift != null) {
            customerGift.openGift();
        } else {
            System.out.println("No gift to open.");
        }
    }}

