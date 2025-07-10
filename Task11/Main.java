package Task11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {

  public static void main(String[] args) {

    Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
    Book book2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
    Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);

    Collection<Book> books = new ArrayList<>(Arrays.asList(book1, book2, book3));

    for (Book book : books) {
      System.out.println(book.toString());
    }

  }

}
