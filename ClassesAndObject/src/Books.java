public class Books {
    String name;
    String author;
    String year;
    int personal_rating;
    String genre;
    String pages;
    String language;
    String names;


    public Books(String name, String author, String genre,
                 String year, int personal_rating){
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.personal_rating= personal_rating;
    }
    public Books(String name, String author, String genre,
                 String year, int personal_rating, int pages){
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.personal_rating= personal_rating;
        this.pages = ", the total pages for all books is " + pages;
    }
    public Books(String name, String genre,
                 String year, int personal_rating, String language){
        this.name = name;
        this.author= " are multiple since book has been translated multiple time for the past years, ";
        this.genre = genre;
        this.year = year;
        this.personal_rating= personal_rating;
        this.language = language;
    }
//    public Books(String names){
//        this.names = names;
//    }

    @Override
    public String toString(){
        String returnValue = "";

        returnValue += "The name of the book is " + this.name;
        returnValue += "\nwritten by " + this.author;
        returnValue += "\nthe genre of the book is " + this.genre;
        returnValue += "\nthe book was publish in " + this.year;
        returnValue += "\nmy personal rating for this book is " + this.personal_rating + "/10";
//        returnValue += "\nthe book was originally written in  " + this.language;
        returnValue += "\nand" + this.pages;
//        returnValue += "\nBooks I recommend to read: " + this.names;
        return returnValue;
    }

    @Override
    public boolean equals(Object book){
        Books other = (Books) book;
        if(!(this.author.equals(other.author))) return false;
        return true;
    }
    void language(){
        System.out.println(this.language);
    }



}
