package module2;

class Book {
    String title, author;

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Technical extends Book {
    String subject;

    void display() {
        System.out.println("Technical Book");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Subject: " + subject);
    }
}

class Story extends Technical {
    String genre;

    void display() {
        System.out.println("Story Book");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Subject: " + subject);
        System.out.println("Genre: " + genre);
    }
}

public class question1
{
    public static void main(String[] args) {

        Book b;

        Book book = new Book();
        book.title = "Wings of Fire";
        book.author = "A.P.J. Abdul Kalam";

        Technical technical = new Technical();
        technical.title = "Java Programming";
        technical.author = "Herbert Schildt";
        technical.subject = "Java";

        Story story = new Story();
        story.title = "The Alchemist";
        story.author = "Paulo Coelho";
        story.subject = "Fiction";
        story.genre = "Adventure";

        b = book;
        b.display();

        System.out.println();

        b = technical;
        b.display();

        System.out.println();

        b = story;
        b.display();
    }
}

