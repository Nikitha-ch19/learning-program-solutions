public class TestLibrary {
    public static void main(String[] args) {
        Book[] books = {
            new Book("B101", "Data Structures", "Narasimha Karumanchi"),
            new Book("B102", "Algorithms", "Robert Sedgewick"),
            new Book("B103", "Clean Code", "Robert C. Martin"),
            new Book("B104", "Operating Systems", "Galvin"),
            new Book("B105", "Java Programming", "E. Balagurusamy")
        };

        System.out.println("All Books:");
        LibrarySearch.displayBooks(books);

        System.out.println("\nSearching using Linear Search for 'Clean Code':");
        Book found1 = LibrarySearch.linearSearch(books, "Clean Code");
        System.out.println(found1 != null ? found1 : "Book not found");

        System.out.println("\nSearching using Binary Search for 'Operating Systems':");
        Book found2 = LibrarySearch.binarySearch(books, "Operating Systems");
        System.out.println(found2 != null ? found2 : "Book not found");
    }
}
