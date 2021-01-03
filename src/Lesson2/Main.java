package Lesson2;

public class Main {

    private static void testAnonClass () {
        // TestAnon testAnon = new TestAnon();
        // new TestAnon().Fly();
    //    testFlyAnon(new TestAnon());
        testFlyAnon(() -> System.out.println("New Fly"));
    }

   private static void testFlyAnon(Fly o){
        o.Fly();
    }

    public static void main(String[] args) {
        testAnonClass();
       // new testFlyAnon().Fly();
        // new testAnon(new TestAnon());
    }
/* static  void  testA(new Fly(){
    @Override
            public void Fly(){
        System.out.println("new fly");
    }
})*/

}
