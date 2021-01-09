package JavaCore.level4.lecture8.task1;

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());

        WaterBridge waterBridge = new WaterBridge();
        System.out.println(waterBridge.getCarsCount());

        WaterBridge waterBridge1 = new WaterBridge();
        System.out.println(waterBridge1.getCarsCount());

        SuspensionBridge suspensionBridge = new SuspensionBridge();
        System.out.println(suspensionBridge.getCarsCount());

        SuspensionBridge suspensionBridge1 = new SuspensionBridge();
        System.out.println(suspensionBridge1.getCarsCount());
    }

    public static void println(Bridge bridge) {
        System.out.println(bridge.getCarsCount());
    }
}
