public class Main {
    public static void main(String[] args) {

        long[] sales = {100, 200, 250, 300, 400, 200};

        SalesManager salesManaged = new SalesManager(sales);

        System.out.println(salesManaged.max());
        System.out.println(salesManaged.min());
        System.out.println(salesManaged.averageSum());
    }
}
