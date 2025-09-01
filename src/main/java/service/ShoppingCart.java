package service;

import model.Food;
import model.Discountable;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    // Общая сумма без скидки
    public double getTotalPriceWithoutDiscount() {
        double sum = 0;
        for (Food item : items) {
            sum += item.getTotalPrice();
        }
        return sum;
    }

    // Общая сумма со скидкой
    public double getTotalPriceWithDiscount() {
        double sum = 0;
        for (Food item : items) {
            double price = item.getTotalPrice();
            double discount = 0;
            if (item instanceof Discountable) {
                discount = ((Discountable) item).getDiscount();
            }
            price = price * (1 - discount / 100);
            sum += price;
        }
        return sum;
    }

    public double getVegetarianTotalPriceWithoutDiscount() {
        double sum = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                sum += item.getTotalPrice();
            }
        }
        return sum;
    }
}
