
public class BinaryTree {
    public static void main(String[] args) {


        String[] input1 = {"(2,4)", "(3,4)", "(5,2)", "(6,3)", "(8,4)"};
        String[] input2 = {"(2,4)", "(3,4)", "(5,2)", "(6,3)"};

        boolean isValid1 = isValidTree(input1);
        boolean isValid2 = isValidTree(input2);

        System.out.println("Input 1 is a valid tree: " + isValid1);
        System.out.println("Input 2 is a valid tree: " + isValid2);
    }

    public static boolean isValidTree(String[] relationships) {
        int childCount = 0;
        int parentCount = 0;

        for (String relationship : relationships) {
            int child, parent;
            String[] parts = relationship.substring(1, relationship.length() - 1).split(",");
            child = Integer.parseInt(parts[0]);
            parent = Integer.parseInt(parts[1]);

            childCount++;
            parentCount++;


            if (childCount - parentCount > 1) {
                return false;
            }
        }
        return childCount - parentCount == 1;
    }
}
