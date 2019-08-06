package comp1406t5;


public class KeyValue implements Comparable<KeyValue>{
    public String key;
    public Integer value;

    public KeyValue(String k, Integer v){
      key = k;
      value = v;
    }

    @Override
    public int compareTo(KeyValue other){
      return value.compareTo(other.value);
    }
    @Override
		public String toString(){
			return key + ":" + value;
		}
}
