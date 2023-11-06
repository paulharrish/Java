package EnumExamples;

public class Basic {
    enum Week implements A {
        Monday("mon"), Tuesday("tue");

        String str;

        // these are enum constants.
        // they are public static and final.

        Week(String shortform) {

            System.out.println("constructor called for " + this);
            this.str = shortform;
        }

        @Override
        public void hello() {
            System.out.println("Hii! How are you?");
        }
    }

    public static void main(String[] args) {
        Week week = Week.Monday;

        System.out.println(week.getDeclaringClass());
        week.hello();
        System.out.println(week.valueOf("Monday"));

        for (Week day : Week.values()) {
            System.out.println(day);
        }

        System.out.println(week.ordinal());
        System.out.println(week.str);

    }

}
