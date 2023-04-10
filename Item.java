public class Item {
    int harga;
    String nama;
    String rank;
    int quantity;
    static int totHarga = 0;

    public Item(int harga, String nama, String rank, int quantity) {
        this.harga = harga;
        this.nama = nama;
        this.rank = rank;
        this.quantity = quantity;
        totHarga += harga * quantity;
    }

    public static void seeAllItem() {
        System.out.println("Your Item backpack worth: " + totHarga + " with item as listed below:");
    }

    @Override
    public String toString() {
        return quantity + " " + rank + " " + nama + " worth: " + harga * quantity;
    }
}

