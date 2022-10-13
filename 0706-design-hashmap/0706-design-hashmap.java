class MyHashMap {

    List<Integer> list1;
    List<Integer> list2;
    
    public MyHashMap() {
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        if(list1.contains(key)) {
            int idx = list1.indexOf(key);
            list2.set(idx, value);
        }
        else {
            list1.add(key);
            list2.add(value);
        }
    }
    
    public int get(int key) {
        if(list1.contains(key)) {
            int idx = list1.indexOf(key);
            return list2.get(idx);
        }
        return -1;
    }
    
    public void remove(int key) {
        if(list1.contains(key)) {
            int idx = list1.indexOf(key);
            list1.remove(idx);
            list2.remove(idx);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */