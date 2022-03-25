class LRUCache {
    
    class Node{
        int key;
        int value;
        
        Node next;
        Node prev;
        
        public Node(){}
        public Node(int _key, int _value){
            key = _key;
            value = _value;
        }
    }
    
    HashMap<Integer, Node> cache;
    int cacheCap;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        cache = new HashMap<>();
        cacheCap = capacity;
        
        head = new Node();
        tail = new Node();
        
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            Node gotNode = cache.get(key);
            remove(gotNode);
            
            addFirst(gotNode);
            return gotNode.value;
        }else{
            //not found
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            Node seenCache = cache.get(key);
            
            remove(seenCache);
            seenCache.value = value;
            addFirst(seenCache);
            cache.put(key, seenCache);
        }else{
            
            if(cache.size() == cacheCap){
                //cahce is full
                Node LRU_cache = tail.prev;
                remove(LRU_cache);
                cache.remove(LRU_cache.key);
            }
            
            Node newNode = new Node(key, value);
            addFirst(newNode);
            cache.put(key, newNode);
        }
    }
    
    public void addFirst(Node node){
        Node fwd = head.next;
        
        node.next = fwd;
        node.prev = head;
        
        head.next = node;
        fwd.prev = node;
    }
    
    public void remove(Node node){
        Node bwdNode = node.prev;
        Node fwdNode = node.next;
        
        bwdNode.next = fwdNode;
        fwdNode.prev = bwdNode;
        
        node.next = null;
        node.prev = null;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */