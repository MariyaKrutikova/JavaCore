import exceptions.CustomerNotExistException;
import exceptions.ProductNotExistException;
import exceptions.QuantityException;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Main {
//    static LocalDate today = LocalDate.now();
    public static void main(String[] args) throws CustomerNotExistException, ProductNotExistException, QuantityException {
        System.out.println("online shop");

        OnlineShop.getCustomerList().add(new Customer("Ivanov Ivan", LocalDate.of(1987, 12, 9), "+9867566473", Customer.Sex.MALE));
        OnlineShop.getCustomerList().add(new Customer("Petrov Petr", LocalDate.of(1988, 12, 20), "+9867566475", Customer.Sex.MALE));
        OnlineShop.getCustomerList().add(new Customer("Smirnova Dasha", LocalDate.of(1986, 10, 17), "+9867566411", Customer.Sex.FEMALE));
        OnlineShop.getCustomerList().add(new Customer("Drozdova Katya", LocalDate.of(1990, 7, 21), "+9867566422", Customer.Sex.FEMALE));

        OnlineShop.getProductList().add(new Product("apple", BigDecimal.valueOf(10L)));
        OnlineShop.getProductList().add(new Product("pineapple", BigDecimal.valueOf(50L)));

        congratulate (OnlineShop.getCustomerList());

//        try {
//
//            Order order = null;
//            order = OnlineShop.buyProduct("Ivanov Ivan", "apple", "20");
//
//            OnlineShop.getOrderList().add(order);
//            System.out.println(OnlineShop.getOrderList());
//
//            Order order2 = OnlineShop.buyProduct("Ivanov Ivan", "apple", "20");
//            OnlineShop.getOrderList().add(order2);
//            System.out.println(OnlineShop.getOrderList());
//
//            Order order3 = OnlineShop.buyProduct("Petrov Petr", "pineapple", "300");
//            OnlineShop.getOrderList().add(order3);
//
//
//        } catch (QuantityException e) {
//            OnlineShop.getOrderList().add(OnlineShop.buyProduct(e.getCustomer(), e.getProduct(), "1"));
//        } catch (ProductNotExistException e) {
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            throw e;
//        }
//
//        System.out.println(OnlineShop.getOrderList());
//        System.out.println(OnlineShop.getOrderList().size() + " orders received");
    }

    enum Holiday {NEW_YEAR, MARCH8, FEBRUARY23, ORDINARY_DAY}
    private static final Holiday today = Holiday.ORDINARY_DAY;

    public static void congratulate (List<Customer> customers) {

        for (Customer customer : customers) {
            switch (today) {
                case ORDINARY_DAY:
                    System.out.println(customer.getFIO() + " хорошего дня!");
                    break;
                case NEW_YEAR:
                    System.out.println(customer.getFIO() + " с Новым Годом!");
                    break;
                case MARCH8:
                    if (customer.getSex() == Customer.Sex.FEMALE) System.out.println(customer.getFIO() + " с 8 марта!");
                    break;
                case FEBRUARY23:
                    if (customer.getSex() == Customer.Sex.MALE)
                        System.out.println(customer.getFIO() + " с 23 февраля!");
                    break;
//                default:
//                    System.out.println("Привет!");
            }
        }








    }

}