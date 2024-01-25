package burgers;

public class BurgerMain {
    public static void main(String[] args) {
        Burger burger1 = new Burger(
                "bun", "meat", "cheese", "greens", "mayonnaise"
        );

        Burger burger2 = new Burger("bun", "meat", "cheese", "greens");

        Burger burger3 = new Burger(
                "bun", "meat", "meat", "cheese", "greens", "mayonnaise"
        );

        System.out.println("burger1 = " + burger1);
        System.out.println("burger2 = " + burger2);
        System.out.println("burger3 = " + burger3);
    }
}
