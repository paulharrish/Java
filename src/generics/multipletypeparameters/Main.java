package generics.multipletypeparameters;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eva");
        ArrayList<Orderedpair<Integer,String>> op = new ArrayList<>();
        for(int i = 0; i< names.size(); i++){
            Orderedpair<Integer,String> pair = new Orderedpair<>(i,names.get(i));
            System.out.print("The key is "+ pair.getKey());
            System.out.println(". The value of the key is "+ pair.getValue());
            op.add(pair);
        } 

        
        

    }
}
