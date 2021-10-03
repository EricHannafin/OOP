package Week02.Exercise03.Book;

public class Book {

    private String title;
    private double price;
    private String isbn;
    private int pages;

    public Book() {
        title = "Not available";
        price = 0;
        isbn = "Not available";
        pages = 0;

    }

    public Book(String title, double price, String isbn, int pages) {
        setTitle(title);
        setPrice(price);
        setISBN(isbn);
        setPages(pages);
    }

    public String getTitle() {

        return title;
    }

    public double getPrice() {

        return price;
    }

    public String getISBN() {

        return isbn;
    }

    public int getPages() {

        return pages;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    private void setISBN(String isbn) {
        this.isbn = isbn;
    }

    private void setPages(int pages) {
        this.pages = pages;
    }

    public String toString() {
        return  "Title: " + getTitle() + "   Price: " + getPrice() + "   ISBN: " + getISBN()
                + "   Pages: " + getPages();
    }


}
