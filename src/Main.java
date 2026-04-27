//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int addId = 0;
        String addCategory = "";

        System.out.println("Пара 1 - результат");
            Product product1 = new Product(10,"Boll1",12,"sport");
            Product product2 = new Product(10,"Boll1",12,"Denger sport");

            System.out.println(product1.equals(product2));
        System.out.println("idP1 = " + product1.id + ", idP2 = " + product2.id +
                " / cat1 = " + product1.category + "cat2 = " + product2.category);

        System.out.println("Пара 2 - результат");
        addId = 11;
        product1.id = addId;
        System.out.println(product1.equals(product2));
        System.out.println("idP1 = " + product1.id + ", idP2 = " + product2.id +
                " / cat1 = " + product1.category + ", cat2 = " + product2.category);

        System.out.println("Пара 3 - результат");
        addId = 10;
        addCategory = "sport";
        product1.id = addId;
        product2.category = addCategory;
        System.out.println(product1.equals(product2));
        System.out.println("idP1 = " + product1.id + ", idP2 = " + product2.id +
                " / cat1 = " + product1.category + ", cat2 = " + product2.category);

        System.out.println("Пара 4 - результат");
        addId = 10;
        addCategory = "Low sport";
        product1.id = addId;
        product2.category = addCategory;
        System.out.println(product1.equals(product2));
        System.out.println("idP1 = " + product1.id + ", idP2 = " + product2.id +
                " / cat1 = " + product1.category + ", cat2 = " + product2.category);

        System.out.println("Часть 2");

        Product[] basket1 = {product1, product2};
        Order order1 = new Order("Ivan", basket1);
        System.out.println("Покупка 1 - " + order1);

        Product[] basket2 = {product2, product1};
        Order order2 = new Order("Olga", basket2);
        System.out.println("Покупка 2 - " +order2);


    }
}