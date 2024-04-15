package Assignment3;

public class Books {
    private int bookID;
    private String author;
    private String title;
    private int year;
    private String genre;

    //constructor
    public Books(int bookID, String author, String title, int year, String genre){
        this.bookID = bookID;
        this.author = author;
        this.title = title;
        this.year = year;
        this.genre = genre;
    }

    //accessor
    public String getTitle(){
        return title;
    }

    //mutator
    public void setBookID(int bookID){
        this.bookID = bookID;
    }

    //to string
    public String toString(){
        return "Book ID: "+bookID+"\nBook Author: "+author+"\nBook Title: "+title+"\nBook Year: "+year+"\nGenre: "+genre+"\n";
    }
}
