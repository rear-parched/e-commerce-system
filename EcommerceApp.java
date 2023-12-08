// EcommerceApp.java
public class EcommerceApp {
    public static void main(String[] args) {
        Product product1 = new Product(101, "Laptop", 999.99);
        Product product2 = new Product(102, "Smartphone", 599.99);

        Customer customer = new Customer(1, "John Doe", "john.doe@example.com");

        Order order = new Order(1, customer);
        order.addProduct(product1);
        order.addProduct(product2);

        System.out.println("Order Information:");
        order.displayInfo();
    }
}
