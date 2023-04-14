package pl.javabasics.theorytesting.iterable;

import java.util.Objects;

public class MyCustomObject {

    private final long id;
    private String name;

    public MyCustomObject(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyCustomObject)) return false;

        MyCustomObject that = (MyCustomObject) o;

        if (id != that.id) return false;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MyCustomObject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
