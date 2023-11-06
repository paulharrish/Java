package EnumExamples;

public class Basic {
    enum Week implements A {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        // these are enum constants.
        // they are public static and final.

        Week() {
            System.out.println("constructor called for " + this);
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
        System.out.println(week.valueOf("Tuesday"));

        for (Week day : Week.values()) {
            System.out.println(day);
        }

        System.out.println(week.ordinal());

    }

}
