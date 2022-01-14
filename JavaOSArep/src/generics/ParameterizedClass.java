package generics;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<String> i1 = new Info<>("Hi");
        System.out.println(i1);
        Info<Integer> i2 = new Info<>(122);
        System.out.println(i2);
        Info2<String,Integer> i3 = new Info2<>("Hi",21);
        System.out.print("key " + i3.getKey() + " ");
        System.out.println("val " + i3.getVal());
        i3.setVal(1);
        System.out.println("val " + i3.getVal());

    }
}
class Info<T>{
    private T val;

    public Info(T v1){
        this.val= v1;
    }
    public String toString(){
        return "(" + val + ")" ;
    }
    public T getVal(){
        return this.val;
    }
}

class Info2<K,V>{
    private K key;
    private V val;

    public Info2(K key, V val) {
        this.key = key;
        this.val = val;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getVal() {
        return val;
    }

    public void setVal(V val) {
        this.val = val;
    }
}