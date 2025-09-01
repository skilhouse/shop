import model.Apple;
import model.Meat;
import model.Food;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100);
        Food redApple = new Apple(10, 50, Colour.RED);
        Food greenApple = new Apple(8, 60, Colour.GREEN);

        Food[] products = {meat, redApple, greenApple};
        ShoppingCart cart = new ShoppingCart(products);

        System.out.println("Общая сумма без скидки: " + cart.getTotalPriceWithoutDiscount());
        System.out.println("Общая сумма со скидкой: " + cart.getTotalPriceWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.getVegetarianTotalPriceWithoutDiscount());
    }
}
