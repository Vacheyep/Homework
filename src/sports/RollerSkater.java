package sports;

public class RollerSkater {
    static int wheels = 1;
    int tracks = 5;
    //private static boolean i = false;
    private static boolean numLock = true;
    static boolean capLock = false;

    public static void main(String... shortcuts) {
        RollerSkater s = new RollerSkater();
        boolean i = true;
        int feet = 4, tracks = 15;
        int wheels = 4;


        System.out.println(i);
        System.out.println(wheels);
        System.out.print(numLock + " " + capLock);
    }
}
