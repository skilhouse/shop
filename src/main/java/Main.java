import model.Apple;
import model.Meat;
import model.Food;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100); // мясо 5 кг * 100 руб
        Food redApple = new Apple(10, 50, Colour.RED);   // красные яблоки 10 кг * 50 руб
        Food greenApple = new Apple(8, 60, Colour.GREEN); // зелёные яблоки 8 кг * 60 руб

        Food[] products = {meat, redApple, greenApple};
        ShoppingCart cart = new ShoppingCart(products);

        System.out.println("Общая сумма без скидки: " + cart.getTotalPriceWithoutDiscount());
        System.out.println("Общая сумма со скидкой: " + cart.getTotalPriceWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.getVegetarianTotalPriceWithoutDiscount());
    }
}
