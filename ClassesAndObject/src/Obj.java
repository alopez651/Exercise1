import java.awt.print.Book;

public class Obj {
    public static void main(String[] args){
        Books book1 = new Books("Crime and Punishment", "Literary Fiction",
                "1866", 9, "Russian");
        Books book2 = new Books("Little Women", "Louisa May Alcott","Novel",
                "1868", 8 );
        Books book3 = new Books("Harry Potter", "J.K Rowling","Fantasy",
                "1997 - 2007", 10, 4100 );
        Books book4 = new Books("Tender is the Night", "F. Scott Fitzgerald",
                "Tragedy", "1934", 9 );
        Books book5 = new Books("Cold Blood", "Trueman Capote", "Nonfiction/Literacy",
                "1965", 8);
        Books book6 = new Books("The Great Gatsby", "F. Scott Fitzgerald", "Historical Fiction",
                "1925", 7);




        System.out.println(book3.toString());
        book3.language();
        System.out.println("Cold blood to Crime and punishment: " + book1.equals(book5));
        System.out.println("Tender is the Night and The Great Gatsby: " + book4.equals(book6));

    }
}
