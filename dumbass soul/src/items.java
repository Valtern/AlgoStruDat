public class items {
    itemData items;
    public itemData item () {
        String name = "Sword";
        int dmg = 15;
        String desc = "A basic sword used by all commoners";
        int price = 50;
        items = new itemData(name, desc, price, dmg);
        return item();
    }
}
