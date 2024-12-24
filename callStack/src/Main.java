public class Main {
    public static void main(String[] args)  {
        System.out.println("main started");
        try{
        m1();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("main ended");
    }

    public static void m1() throws Exception {
        System.out.println("m1 started");
        m2();
        System.out.println("m1 ended");
    }

    public static void m2() throws Exception {
        System.out.println("m2 started");

            m3();

        System.out.println("m2 ended");
    }

    public static void m3() throws Exception {
        System.out.println("m3 started");

            String str = null;
            System.out.println(str.length());

            int array[]=new int[2];

        System.out.println("m3 ended");
    }
}