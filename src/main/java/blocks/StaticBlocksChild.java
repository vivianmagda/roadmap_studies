package blocks;
public class StaticBlocksChild extends StaticBlocks {

    {
        System.out.println("Init block child 1");
    }

    static{
        System.out.println("Static block child 1");
    }
}
