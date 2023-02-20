import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        // write your code here
        OnlineShop shop = new OnlineShop("Emag", "logo.jpg", new ArrayList<Product>());

        Product laptop = new Product("Laptop", 3200.5, 1,1, 1123, "");
        Product fridge = new Product("Frigider", 207.95, 1,2, 1245, "");

        Product bread = new Product(laptop);

        bread.setQty(5);
        bread.setName("Bread");

        shop.modifyProductsList(1,laptop);
        shop.modifyProductsList(1,fridge);

        shop.modifyProductsList(2, laptop);
        System.out.println(laptop.equals(fridge));
    }
}

class OnlineShop {
    private String name;
    private String image;
    private ArrayList<Product> products;

    OnlineShop(String name, String image, ArrayList<Product> products)
    {
        this.name = name;
        this.image = image;
        this.products = new ArrayList<>();
    }

    public void modifyProductsList(int action, Product product)
    {
        if(action == 1)
        {
            this.products.add(product);
        }
        else {
            this.products.remove(product);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

class Product
{
    private int id;
    private String name;
    private double price;
    private int type;
    private int category;
    private int qty;
    private String expDate; //expiry date - only for goods
    private String details; // ex.: processor, memory, power, volume (for refrigerators etc)

    public Product(String name, double price, int type, int category, int id, String expDate)
    {
        this.name = name;
        this.price = price;
        this.type = type;
        this.id = id;
        this.expDate = expDate;
    }

    public Product(Product product)
    {
        this.name = product.name;
        this.price = product.price;
        this.type = product.type;
        this.id = product.id;
        this.expDate = product.expDate;
        this.details = product.details;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean equals(Product product)
    {
        if (product == null) return false;
        if (this == product) return true;
        if (!(product instanceof Product)) return false;
        return id == product.id &&
                Double.compare(product.price, price) == 0 &&
                type == product.type &&
                Objects.equals(name, product.name) &&
                Objects.equals(expDate, product.expDate);
    }

    public void modify(boolean isIncrease, double percent)
    {
        if (isIncrease) {
            this.price += this.price * percent;
        } else {
            this.price -= this.price * percent / 100;
        }
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

class User
{
    private String userName;
    private String userId;
    private ArrayList<Order> orders;
    private ArrayList<Order> completedOrders;

    public User(String userName, String userId)
    {
        this.userName = userName;
        this.userId = userId;
        orders=new ArrayList<Order>();
        completedOrders=new ArrayList<Order>();
    }

    public void addO1(Order order)
    {
        this.orders.add(order);
    }

    public void addO2(Order order)
    {
        this.completedOrders.add(order);
    }
}

class Order
{
    private ArrayList<Product> products;
    private String address;

    public Order()
    {
        products = new ArrayList<Product>();
    }
    public void addProduct(Product product)
    {
        if(products.size() > 99)
            return;

        products.add(product);
    }

    public void removeProduct(Product product)
    {
        products.remove(product);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class InventoryProducts
{
    private Product product;
    private int quantity;

    public InventoryProducts(Product product, int quantity)
    {
        this.product = new Product(product);
        this.quantity = quantity;
    }
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}



