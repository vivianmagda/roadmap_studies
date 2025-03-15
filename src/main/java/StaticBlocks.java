public class StaticBlocks {

    public void greet(){
        System.out.println("Hello World!");
    }

    {
        System.out.println("Init block 1");
    }

    {
        System.out.println("Init block 2");
    }

    static {
        System.out.println("Static parent block 1");
    }

    static {
        System.out.println("Static parent block 2");
    }

    static {
        System.out.println("Static parent block 3");
    }
}
