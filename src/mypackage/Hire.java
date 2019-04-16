package mypackage;

public class Hire {
    private int bookId;
    private int customerId;
    private String date;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Hire(int bookId, int customerId, String date) {
        this.bookId = bookId;
        this.customerId = customerId;
        this.date = date;
    }
}
