public class items {
    private int id;
    private String itemName;
    private double price;

        public items(double price, double v) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        items item = (items) obj;
        return itemName.equals(item.itemName);
    }

    @Override
    public int hashCode() {
        return itemName.hashCode();
    }

}



