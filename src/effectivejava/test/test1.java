package effectivejava.test;

public class test1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        //long sum=0;//1s钟
        Long sum=0L;//10.185s钟
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum+=i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        m();
    }

    private static void m() {
    }

}
