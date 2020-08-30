/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    private Book[] availableBooks;

    public Library() {
        this.availableBooks = new Book[5];
        this.availableBooks[0] = new Book("Mitali", "Java -A beginner's guide", "Herbert Schildt", "1234567890123");
        this.availableBooks[1] = new Book("Megha", "The Lord of the Rings", "J.R.R.Tolkien", "2345678901234");
        this.availableBooks[2] = new Book("Aanya", "The Catcher in the Rye", "J.D.Salinger", "3456789012345");
        this.availableBooks[3] = new Book("Siddhi", "1984", "George", "4567890123456");
        this.availableBooks[4] = new Book("Aara", "Animal Farm", "Boris", "567890123456");

    }

    public Library(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }

}
