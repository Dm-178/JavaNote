package ArrayLearn;

public class Box<T> {
    //泛型类，可以理解为自定义的【集合】,也常用？来代替T，而且可以直接使用extends 或 imp...s，这样可以限制存入的类型
    private T t;

    public void setT(T t)
    {
        this.t = t;
    }

    public T getT()
    {
        return t;
    }

    public static void main(String[] args) {

        Box<Integer> boxInt = new Box<>();
        boxInt.setT(5);
        System.out.println(boxInt.getT());

    }
}
