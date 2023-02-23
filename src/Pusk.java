public class Pusk {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Лев", "Толстой");
        Autor autor2 = new Autor("Александр", "Пушкин");
        Book book1 = new Book("Война и мир", autor1, 1917);
        Book book2 = new Book("Евгений Онегин", autor2, 1956);
        System.out.println(book1);
        System.out.println(book2);
        book2.setYearBook(2023);
        System.out.println(book2);
    }

}
