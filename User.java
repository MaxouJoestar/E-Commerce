import java.util.ArrayList;
import java.util.List;

public class User {
    protected String username;
    protected String email;
    protected String password;
    protected List<Order> orderHistory;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.orderHistory = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orderHistory.add(order);
    }    

    public void printOrderHistory() {
        for (Order order : orderHistory) {
            System.out.println(order);
        }
    }

    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }




}
