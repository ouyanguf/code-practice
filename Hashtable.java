import java.util.ArrayList;
import java.util.LinkedList;

public class Hashtable<K,V>{
    private static class KVWrapper<K,V>{
        K key;
        V value;

        KVWrapper(K key,V value){
            this.key= key;
            this.value = value;
        }

        public String print(){
            System.out.println("["+key.toString()+" "+value.toString()+"]");
            return ("["+key.toString()+" "+value.toString()+"]");
        }
    }
    
    private ArrayList<LinkedList<Hashtable.KVWrapper<K,V>>> table;
    private int size; 

    public Hashtable(){
        size = 10000;
        table = new ArrayList<LinkedList<Hashtable.KVWrapper<K,V>>>(size);
        for(int i=0;i<size;i++)
            table.add(new LinkedList<Hashtable.KVWrapper<K,V>>());
//        System.out.println(table.size());
    }


    private int hash(K key){
        return key.hashCode()%size;
    }

    public V put(K key,V value){
        int index = hash(key);
        
        for(int i=0;i<table.get(index).size();i++){
            Hashtable.KVWrapper wrap = table.get(index).get(i);
            if(wrap.key.equals(key))
                table.get(index).remove(i);
        }
        table.get(index).add(new Hashtable.KVWrapper<K,V>(key,value));
        return value;
    }

    public V get(K key){
        int index = hash(key);
    //    System.out.println(table.get(index).get(1).print());
        for(int i=0;i<table.get(index).size();i++){
            if(table.get(index).get(i).key.equals(key))
                return table.get(index).get(i).value;
        }
        return null;
    }

    public static void main(String[] args){
        Hashtable<Integer,String> table = new Hashtable<Integer,String>();
        table.put(1,"One");
        table.put(2,"Two");
        table.put(10001,"One0001");
        table.put(1,"newOne");
        System.out.println(table.get(1) + " " + table.get(10001));

    }
}
