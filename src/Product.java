import java.util.Objects;

public class Product {

    // инициализирую поля класса
    private int id;
    private String name;
    private double price;
    private String category;

    //создаю конструктов
    public Product (int id, String name, double price, String category){
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }
    // инициализация геттеров и сеттеров для чтения и записи данных

    public Integer getid(){
        return id;
    }
        public void setid (Integer id){
            this.id = id;
        }
    public String getName(){
        return name;
    }
        public void setName (String name){
            this.name = name;
        }
    public Double getPrice(){
        return price;
    }
        public void setPrice (Double name){
            this.price = price;
        }
    public String getCategory(){
        return category;
    }
        public void setCategory (String category){
            this.category = category;
        }
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
