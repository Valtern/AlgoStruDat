public class aBook {
    String title, authorName;
    int pubYear, pageAmount, price;

    public aBook (int publishyear, int pageamount, int price, String title, String authorName) {
        this.authorName = authorName;
        this.title = title;
        pubYear = publishyear;
        pageAmount = pageamount;
        this.price = price;
    }
}
