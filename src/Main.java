import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Формирование товаров");
        // создаю товары (обозначаю их явно, без замен с использованием переменных)
            Product product1 = new Product(10,"Boll1",12,"Sport");
            Product product2 = new Product(11,"boxing gloves",12,"Denger sport");
            Product product3 = new Product(12,"running shoes",12,"Low sport");
            Product product4 = new Product(13,"green tent",12,"Live");
            Product product5 = new Product(13,"yellow tent",12,"Live");

        //собираю инфотрацию о товаре для вывода в терминал, затем вывожу результат сравнения
        //без использования переменных, которые ранее были использованы для теста
        //по условию - товары равны при совпадении id и category (было ошибочно добавлено product.name)
        System.out.println("Сравнение product1 и product2");
        System.out.println("product1 id = " + product1.id + ", категория " + product1.category +
                " / product2 id = " + product2.id  + ", категория " + product2.category +
                ", результат сравнения = " + product1.equals(product2));

        System.out.println("Сравнение product3 и product4");
        System.out.println("product3 id = " + product3.id + ", категория " + product3.category +
                " / product4 id = " + product4.id  + ", категория " + product4.category +
                ", результат сравнения = " + product3.equals(product4));

        System.out.println("Сравнение product4 и product5");
        System.out.println("product4 id = " + product4.id + ", категория " + product4.category +
                " / product5 id = " + product5.id  + ", категория " + product5.category +
                ", результат сравнения = " + product4.equals(product5));



        System.out.println("Часть 2");

        Product[] basket1 = {product1, product2};
        Order order1 = new Order("Ivan", basket1);
            Product[] basket2 = {product3, product4};
            Order order2 = new Order("Olga", basket2);
                Product[] basket3 = {product4};
                Order order3 = new Order("Anna", basket3);
                    Product[] basket4 = {product5};
                    Order order4 = new Order("Anna", basket4);

        System.out.println("Покупка 1 - " + order1);
        System.out.println("Сравнение basket1 и basket2, результат - " + Arrays.equals(basket1,basket2));

        System.out.println("Покупка 2 - " + order2);
        System.out.println("Сравнение basket2 и basket3, результат - " + Arrays.equals(basket2,basket3));

        System.out.println("Покупка 3 - " + order3 + " + \nПокупка 4 - " + order4);
        System.out.println("Сравнение basket3 и basket4, результат - " + Arrays.equals(basket3,basket4));

    }
}