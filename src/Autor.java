public class Autor {
    String nameAutor;
    String surnameAutor;

    public Autor(String nameAutor, String surnameAutor) {
        this.nameAutor = nameAutor;
        this.surnameAutor = surnameAutor;
    }

    public String getNameAutor() {
        return this.nameAutor;
    }

    public String getSurnameAutor() {
        return this.surnameAutor;
    }

    public String toString() {
        return getNameAutor() + " " + getSurnameAutor();
    }
}

