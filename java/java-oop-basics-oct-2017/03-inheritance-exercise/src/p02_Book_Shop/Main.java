package p02_Book_Shop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalClassFormatException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String author = reader.readLine();
            String title = reader.readLine();
            double price = Double.parseDouble(reader.readLine());

            Book book = new Book(author, title, price);

            GoldenEditionBook goldenEditionBook = new GoldenEditionBook(author, title, price);

            Method[] bookDeclaredMethods = Book.class.getDeclaredMethods();
            Method[] goldenBookDeclaredMethods = GoldenEditionBook.class.getDeclaredMethods();

            if (goldenBookDeclaredMethods.length > 1) {
                throw new IllegalClassFormatException(
                        "Code duplication in GoldenEditionBook!");
            }

            System.out.println(book.toString());
            System.out.println(goldenEditionBook.toString());

        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
