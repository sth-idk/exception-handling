public class Book {
    private String title;
    private int pageCount;

    public Book(String title, int pageCount) {
        if (title == null || title == "")
            throw new IllegalArgumentException("Title cannot be empty.");
        else
            this.title = title;
        if (pageCount < 0)
            throw new IllegalArgumentException("Page count must be positive.");
        else
            this.pageCount = pageCount;
    }

    public void setTitle(String title) throws IllegalArgumentException {
            this.title = title;
    }

    public void setPageCount(int pageCount) throws IllegalArgumentException {
            this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String toString(String sampleBook){

        return sampleBook+"(pageCount)";
    }
}

