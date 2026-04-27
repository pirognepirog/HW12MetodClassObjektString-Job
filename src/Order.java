import javax.lang.model.type.ArrayType;
import java.util.Arrays;
import java.util.Objects;

public class Order {
    //создаю контруктор со строкой и массивом из класса продукт
    public Order (String customer, Product[] basket){
        this.customer = customer;
        this.basket = basket;
    }

// инициализирую поля класса, с внутренней областью видимости
    private String customer;
    private Product[] basket;

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

        if (Objects.equals(customer, order.customer)){
            return false;
        }
        if (Arrays.equals(basket, order.basket)){
            return false;
        }
            return true;
        //return Objects.equals(customer,order.customer) && Arrays.equals(basket,order.basket);

    }
}
