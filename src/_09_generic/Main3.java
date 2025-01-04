package _09_generic;

class Pair<K,V> {
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	/**
	 * @return the key
	 */
	public K getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 */
	public void setKey(K key) {
		this.key = key;
	}

	/**
	 * @return the value
	 */
	public V getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(V value) {
		this.value = value;
	}
	
}


public class Main3 {
	public static void main(String[] args) {
		
		Pair p1 = new Pair("One", 1);
		System.out.println("Key :" + p1.getKey() + " Value :" + p1.getValue());

		Pair p2 = new Pair(2, "Two");
		System.out.println("Key :" + p2.getKey() + " Value :" + p2.getValue());

	}

}
