
public class Book implements Packable {
    
    String author;
    String bookTitle;
    double bookWeight;
    
    public Book(String author, String bookTitle, double bookWeight){
        this.author = author;
        this.bookTitle = bookTitle;
        this.bookWeight = bookWeight;
    }

    @Override
    public double weight() {
        return this.bookWeight;
    }
    
    @Override
    public String toString(){
        return author + ": " + bookTitle;
    }
    
}
