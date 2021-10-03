package Week06.Revision;

public class Book {

        String title;
        double price;
        String ISBN;
        int pages;

    public Book() {
        title = "Not available";
        price = 0;
        ISBN = "Not available";
        pages = 0;

    }

    public Book(String title, double price, String ISBN, int pages) {
        setTitle(title);
        setPrice(price);
        setISBN(ISBN);
        setPages(pages);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.equals("")) {
            title = "Invalid Input detected";
        }
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <=0 || price > 5000){
            price = 0;
        }
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        if(ISBN ==  null || ISBN.equals("")){
            ISBN = "Invalid ISBM detected";
        }
        this.ISBN = ISBN;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if(pages <= 0 || pages > 5000){
            pages = 0;
        }
        this.pages = pages;
    }

    @Override
    public String toString() {
        return  "\nBook " +
                "\nTitle " +getTitle() +
                "\nPrice " + getPrice() +
                "\nISBN " + getISBN()  +
                "\nPages " + getPages();
    }
}