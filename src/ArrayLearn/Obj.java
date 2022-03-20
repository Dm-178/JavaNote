package ArrayLearn;

import org.jetbrains.annotations.NotNull;

public class Obj implements Comparable<Obj>{
    public int id;
    public int name;


    @Override
    public int compareTo(@NotNull Obj o) {
        if(name >= o.name) return 1;
        else               return -1;
    }

    @Override
    public String toString() {
        return "Obj{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Obj(int id, int name) {
        this.id = id;
        this.name = name;
    }
}
