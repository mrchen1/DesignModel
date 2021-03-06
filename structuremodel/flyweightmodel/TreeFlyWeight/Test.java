package structuremodel.flyweightmodel.TreeFlyWeight;

public class Test {
    public static void main(String[] args){
        showMemInfo();
        TreeManager treeManager = new TreeManager();
        showMemInfo();
        treeManager.displayTree();
        showMemInfo();
    }
    public static void showMemInfo(){
        // 最大内存
        long max = Runtime.getRuntime().maxMemory();
        // 分配内存
        long total = Runtime.getRuntime().totalMemory();
        // 已分配内存中的剩余空间
        long free = Runtime.getRuntime().freeMemory();
        // 已占用的内存
        long used = total - free;
        System.out.println("最大内存="+max);
        System.out.println("分配内存="+total);
        System.out.println("已分配内存中的剩余空间="+free);
        System.out.println("已占用的内存="+used);
        System.out.println("时间="+System.currentTimeMillis());
        System.out.println("");

    }
}
