import javax.lang.model.type.ArrayType;
import java.util.Arrays;
import java.util.Objects;

public class Order {

    // инициализирую поля класса, с внутренней областью видимости
    private String customer;
    private Product[] basket;

    //создаю контруктор со строкой и массивом из класса продукт
    public Order (String customer, Product[] basket){
        this.customer = customer;
        this.basket = basket;
    }

    // инициализация геттеров и сеттеров для чтения и записи данных
    public String getCustomer(){
        return customer;
    }
    public void setCustomer(String customer){
        this.customer = customer;
    }
    public Product[] getBasket(){
        return  basket;
    }
    public void setBasket(Product[] basket) {
        this.basket = basket;
    }
    @Override
    public String toString(){
        return "Покупатель = " + customer + ", корзина = " + Arrays.toString(basket);
    }
    @Override
    public boolean equals (Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Order order = (Order) obj;

        if (Objects.equals(customer, order.customer)) return false;
        if (this.basket.length != order.basket.length) return false;
        if (this.basket == null || order.basket == null) return false;

        for (int i = 0; i < this.basket.length; i++){
            if (!this.basket[i].equals(order.basket[i])){
                break;
            }
        }
        return true;
    }
}
