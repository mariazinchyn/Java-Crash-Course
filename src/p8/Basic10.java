package p8;

public class Basic10 {
    public static String datingRange(int age) {
        //return min-max
        double min, max;

        if (age < 15) {
            min = age - 0.1 * age;
            max = age + 0.1 * age;
        } else {
            min = (age / 2) + 7;
            max = (age - 7) * 2;
        }

        return (int) min + "-" + (int) max;
    }
}
