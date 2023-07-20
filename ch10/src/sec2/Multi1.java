package sec2;

import java.util.Map;

public class Multi1<K, V> implements Map.Entry<K, V> {
    private K key;
    private V value;

    @Override
    public K getKey() { return this.key; }
    @Override
    public V getValue() { return this.value; }
    @Override
    public V setValue(V value) { this.value = value; return value; }
}
