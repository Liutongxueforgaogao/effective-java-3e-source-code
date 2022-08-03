package effectivejava.test;

import java.util.HashMap;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        Boolean aBoolean = new Boolean(true);
        String hello = new String("hello");
    }
    private static final void m(){

    }

}
class A{
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,1);
        Set<Integer> integers = map.keySet();
        integers.add(2);
        Set<Integer> integers1 = map.keySet();
        System.out.println(integers==integers1);
    }
}
