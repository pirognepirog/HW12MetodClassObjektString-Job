import java.util.Objects;

public class Product {

    //создаю конструктов
    public Product (int id, String name, double price, String category){
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // инициализирую поля класса
    public int id;
    public String name;
    public double price;
    public String category;


    @Override
    public String toString() {
        return name + " (id=" + id + ", цена=" + price + ", категория=" + category + ")";
    }
    @Override // переопределяю метод класса

        public boolean equals (Object o){
            if (this == o)return true;
            if (o == null || getClass() != o.getClass()){
                return false;
            }
        Product product = (Product) o;
            //товары равны при совпадении id и category
        return id == product.id &&
                Double.compare(product.price, price) == 0 &&
               // Objects.equals(name, product.name) &&
                Objects.equals(category, product.category);
    }


}
