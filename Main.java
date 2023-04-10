public class Main {
    public static void main(String[] args) {
        new Item(1000, "potion", "S", 3);
        new Item(5000, "Sword", "A", 1);
        new Item(10000, "Armor", "A", 1);
        Item.seeAllItem();
        System.out.println(new Item(1000, "potion", "S", 3));
        System.out.println(new Item(5000, "Sword", "A", 1));
        System.out.println(new Item(10000, "Armor", "A", 1));
    }
}
