package generics.multipletypeparameters;
public class Orderedpair<K,V> implements Pair<K,V> {

    private K key;
    private V value;

    public Orderedpair(K key,V value){
        this.key = key;
        this.value = value;

    }

    @Override
    public K getKey() {
        return key;
     
    }

    @Override
    public V getValue() {
        return value;
    }
}
