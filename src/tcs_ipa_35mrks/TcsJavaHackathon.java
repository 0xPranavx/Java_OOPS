package tcs_ipa_35mrks;

import java.util.*;

class Author {
    private int authorId;
    private String authorName;

    Author(int authorId, String authorName) {
        this.authorId = authorId;
        this.authorName = authorName;
    }

    public void setAuthorId(final int authorId) {
        this.authorId = authorId;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorName(final String authorName) {
        this.authorName = authorName;

    }

    public String getAuthorName() {
        return authorName;
    }

}

class Book {
    private int bookId;
    private String title;
    private String genre;
    private double price;
    private Author author;

    Book( String title, String genre, Author author, int bookId, double price) {
        this.bookId = bookId;
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.author = author;
    }

    public void setbookId(final int bookId) {
        this.bookId = bookId;
    }

    public int getbookId() {
        return bookId;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setGenre(final String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setAuthor(final Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

}

public class TcsJavaHackathon {
    public static ArrayList<Book> getBooksBelongingToAGenre(ArrayList<Book> bookObj, String genre) {

        ArrayList<Book> bookGenreObj = new ArrayList<>();
        for (int b = 0; b < bookObj.size(); b++) {
            if (bookObj.get(b).getGenre().equals(genre)) {
                bookGenreObj.add(bookObj.get(b));
            }
        }
        return bookGenreObj;
    }

    public static ArrayList<Book> calculateDiscountedPrice(ArrayList<Book> bookObj, String genre, Double percent) {
        ArrayList<Book> bookDiscountObj = new ArrayList<>();
        for (int c = 0; c < bookObj.size(); c++) {
            if (bookObj.get(c).getGenre().equals(genre)) {

                double price = bookObj.get(c).getPrice();
                double discountAmount = price * (percent / 100);
                double discountPrice = price - discountAmount;
                bookObj.get(c).setPrice(discountPrice);
                bookDiscountObj.add(bookObj.get(c));

            }

        }
        return bookDiscountObj;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */

        ArrayList<Book> bookObj = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int numberOfBookObj = sc.nextInt();
        for (int a = 0; a < numberOfBookObj; a++) {
            int authorId = sc.nextInt();
            sc.nextLine();
            String authorName = sc.nextLine();
            int bookId = sc.nextInt();
            sc.nextLine();
            String title = sc.nextLine();
            String genre = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();

            Author authorObj = new Author(authorId, authorName);
            bookObj.add(new Book( title, genre, authorObj ,bookId, price));
        }

        String Genre_1 = sc.nextLine();
        String DiscountGenre = sc.nextLine();
        Double percent = sc.nextDouble();
        sc.nextLine();
        System.out.println(bookObj);

        ArrayList<Book> genreObjAns = getBooksBelongingToAGenre(bookObj, Genre_1);
        ArrayList<Book> discountAns = calculateDiscountedPrice(bookObj, DiscountGenre, percent);

        for (int y = 0; y < genreObjAns.size(); y++) {
            if (genreObjAns.size() != 0) {
                System.out.println("AuthorName:" + genreObjAns.get(y).getAuthor().getAuthorName() + ", Title:"
                        + genreObjAns.get(y).getTitle());
            } else {
                System.out.println("Genre is not available in the list");
            }

        }

        for (int z = 0; z < discountAns.size(); z++) {
            if (discountAns.size() != 0) {
                System.out.println("Discounted " + DiscountGenre + " Books:");
                System.out.println("AuthorName:" + discountAns.get(z).getAuthor().getAuthorName() + ", Title:"
                        + discountAns.get(z).getTitle() + ", Updated Price:" + discountAns.get(z).getPrice());
            } else {
                System.out.println("Discounted books are unavailable in the given genre");
            }
        }
    }
}
