package EqualsHashCode;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    public Student(int id, String name) {
        this.name = name;
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    //O Java usa o método toString() toda vez que for
    // necessário converter um objeto em String, ou seja, para obter uma
    // representação textual do objeto.
    @Override
    public String toString() {
        return "Me chamo: " + this.name + ", meu: " + this.id + " id.";
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Student))
            return false;
        if (obj == this)
            return true;
        return this.getId() == ((Student) obj).getId();
    }
}
