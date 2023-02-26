public class Book {
    //используемые поля
    private String nameBook;
    private Autor autorBook;
    private int yearBook;

    //rонструктор
    public Book(String nameBook, Autor autorBook, int yearBook) {
        this.nameBook = nameBook;
        this.autorBook = autorBook;
        this.yearBook = yearBook;
    }

    //геттер
    public String getNameBook() {
        return this.nameBook;
    }

    public Autor getAutorBook() {
        return this.autorBook;
    }

    public int getYearBook() {
        return this.yearBook;
    }

    //сеттер
    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }


    //для красивой печати
    public String toString() {
        return "Книга: " + getNameBook() + " Автор: " + autorBook.toString() + " Год: " + getYearBook();
    }
}
