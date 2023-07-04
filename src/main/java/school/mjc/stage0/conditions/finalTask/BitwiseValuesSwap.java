package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
        System.out.println("Before swap:");
        System.out.println("First: " + first);
        System.out.println("Second: " + second);

        first = first ^ second;
        second = first ^ second;
        first = first ^ second;

        System.out.println("After swap:");
        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }
}
