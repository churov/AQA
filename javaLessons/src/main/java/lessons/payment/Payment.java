package main.java.lessons.payment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import static main.java.lessons.payment.DataUtilProduct.*;
public class Payment {
    public int amountMoneyPay(Map<Product, Integer> shoppingList) {
        int sum = 0;
        for (Map.Entry<Product, Integer> pair : shoppingList.entrySet()) {
            sum += pair.getKey().getPrice() * pair.getValue();
        }
        return sum;
    }

    //вывод в консоль списка покупок и суммы к оплате
    public void printShoppingList(Map<Product, Integer> shoppingList) {
        System.out.println("Список покупок:");
        for (Map.Entry<Product, Integer> pair : shoppingList.entrySet()) {
            System.out.println(pair.getKey().toString() + " - " + pair.getValue() + " шт.");
        }
        System.out.println("Сумма к оплате: " + amountMoneyPay(shoppingList) + " у.е.");
    }

    public class Order {
        private Map<Product, Integer> orderList;

        public Map<Product, Integer> getOrderList() {
            return orderList;
        }

        //Создание списка покупок
        public void createShoppingList() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Map shoppingList = new HashMap<Product, Integer>();
            boolean search = true;
            while (search) {
                Product product = searchProduct(reader);
                Integer quantity = readQuantity(reader);
                shoppingList.put(product, quantity);
                while (true) {
                    System.out.print("Продолжить выбор товара (Y/N)? - ");
                    String continued = reader.readLine();
                    if (continued.equalsIgnoreCase("Y")) {
                        search = true;
                        break;
                    } else if (continued.equalsIgnoreCase("N")) {
                        search = false;
                        break;
                    } else {
                        System.out.println("Попробуйте еще раз.");
                    }
                }
            }
            this.orderList = shoppingList;
        }
    }
}
