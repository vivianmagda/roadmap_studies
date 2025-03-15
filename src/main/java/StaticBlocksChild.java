public class StaticBlocksChild extends StaticBlocks {

    {
        System.out.println("Init block child 1");
    }

    public static void main(String[] args) {
        System.out.println("Inside the main method");
        StaticBlocksChild obj1 = new StaticBlocksChild();
        
    }

    static{
        System.out.println("Static block child 1");
    }
}
