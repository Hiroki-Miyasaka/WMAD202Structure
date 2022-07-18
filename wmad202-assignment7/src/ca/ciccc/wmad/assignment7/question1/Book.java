package ca.ciccc.wmad.assignment7.question1;

public class Book implements CheckValid{

    @Override
    public boolean test() {
        if (this.bookPrice > 200) {
            return true;
        }else{
            return false;
        }
    }

    private String bookName;
    private Integer bookPrice;
    private Integer bookId;

    public Book(String bookName, Integer bookPrice, Integer bookId){
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookId = bookId;
    }

    public String getBookName(){return bookName;}

    public void setBookName(String bookName){
        this.bookName = bookName;
    }

    public Integer getBookPrice(){return bookPrice;}

    public void setBookPrice(Integer bookPrice){
        this.bookPrice = bookPrice;
    }

    public Integer getBookId(){return bookId;}

    public void setBookId(Integer bookId){
        this.bookId = bookId;
    }
}
