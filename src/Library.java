import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks(){
        return books;
    }

    public void addBook(Book book) throws InvalidBookException{
        if(book == null)
            throw new InvalidBookException("Book should not be null.");
           else
               books.add(book);
    }

    private Book findBook(String title){
        for(Book someBook : books){
                if(someBook.getTitle().equals(title))
                    System.out.println(someBook.getTitle()+" , "+someBook.getPageCount());
        }
        return null;
    }

    public void borrowBook(String title) throws BookNotFoundException, EmptyLibraryException {
            if (books.isEmpty())
                throw new EmptyLibraryException("Library is empty, No book to borrow.");

            if (findBook(title) == null)
                throw new BookNotFoundException("Book with title " + title + " not found.");
            else
                System.out.println("You have borrowed the book " + title + " successfully.");
    }

        public void returnBook(String title) throws BookNotFoundException{
            if(findBook(title) == null)
                throw new BookNotFoundException("Cannot return. book with title "+title+" not found.");
            else
                System.out.println("You have returned the book "+title+" successfully.");
        }

        public void listBooks() throws EmptyLibraryException{
            if (books.isEmpty())
                throw new EmptyLibraryException("Library is empty.");
            else{
                System.out.println("Books in the library:");
                    for (Book allTheBooks : books) {
                        System.out.println(allTheBooks.getTitle()+" , "+allTheBooks.getPageCount());
                    }
                }
        }
}
