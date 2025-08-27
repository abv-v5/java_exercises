class Book{
    String title;
    String author;
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
}

public class Demo{
    public static void main(String args[]){

        Book[] books = new Book[3];

        books[0] = new Book("Galvin", "Those Were the Days");
        books[1] = new Book("Tim Ferris", "Author 2");
        books[2] = new Book("James Clear", "Author 3");
        for(int i=0; i<books.length; i++){
            System.out.println( books[i].title);
        }
    }
}
