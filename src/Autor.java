import java.util.Objects;

public class Autor {
    private String nameAutor;
    private String surnameAutor;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return nameAutor.equals(autor.nameAutor) && surnameAutor.equals(autor.surnameAutor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAutor, surnameAutor);
    }
}

