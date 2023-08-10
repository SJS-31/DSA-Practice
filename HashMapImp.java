import java.util.LinkedList;

public class HashMapImp {

    static class MyHashMap<K,V>{
        public static final int DEFAULT_CAPACITY=4;
        public static final float DEFAULT_LOAD_FACTOR=0.75f;

        private class Node{

            K key;
            V value;

            Node(K key, V value){
                this.key=key;
                this.value=value;
            }
        }

        private int n; //no. of entries in map
        private LinkedList<Node>[] buckets; //declaring

        private void initBuckets(int N){ // N - capacity/size of bucket array
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) { 
                buckets[i] = new LinkedList<>(); 
            }
        }

        private int HashFunc(K Key){ //Generates Hash
            int hc = key.hachCode(); //Inbuilt func to calculate hashvalue for any data type
            return (Math.abs(hc)) % buckets.length; //Abs- hachCode return negative value also, % so that it gives index less the the bucket size
        }

        //Traverse the ll and looks for the node with key, if found return its index else null
        private int searchInbucket(LinkedList<Node> ll, K key){
            for (int i = 0; i < ll.size(); i++) {
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }
        public MyHashMap(){ //Constructor
            initBuckets(DEFAULT_CAPACITY);
        }

        public int size(){ //return the no. of entries in map
            return n;
        }

        public void put(K key, V value){ //insert/update
            int bi=HashFunc(key);
            LinkedList<Node> curBucket = buckets[bi];
            int ei = searchInbucket(curBucket, key);
            if(ei == -1){ //key does not exists, we can insert new node
                Node node = new Node(key, value);
                curBucket.add(node);
                n++;
            }
            else{ //update case

                
                Node curNode = curBucket.get(ei);
                curNode.value = value;
            }
        }

        public V get(K key){ //get value

        }

        public V remove(K key){ //remove key from map

        }
    }
    public static void main(String[] args) {
        MyHashMap<String,Integer> mp= new MyHashMap<>();
    }
}
