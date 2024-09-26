class Prob380
{
    private ArrayList<Integer> list;
    private Map<Integer, Integer> map;

    public RandomizedSet() 
    {
        //initialization of data structures
        list = new ArrayList<>();
         //list is used to store the actual values in the order they were inserted.
        map = new HashMap<>();
        //map allows constant-time lookups of values and their indices in the list.
    }

    public boolean search(int val) 
    {
        //check if value is present or not
        //here key=data value=index
        return map.containsKey(val);
    }

    public boolean insert(int val) 
    {
        //if value to be inserted is already present,return false
        if (search(val)) return false;

//else add value to list
        list.add(val);
        //update map to index value,as val is appended at last index of current list
        //size of list is dynamic
        map.put(val, list.size() - 1);

        //as element not present earlier,return true
        return true;
    }

    public boolean remove(int val) 
    {
        //if element to be removed doesnt exist,return false
        if (!search(val)) return false;

//get index of value parameter in current list
        int index = map.get(val);

        //place last element at index position of value parameter
        list.set(index, list.get(list.size() - 1));
        //update map as index=index of val parameter paired with value of last element
        map.put(list.get(index), index);

//remove duplicate last element as val is already replaced by another element
        list.remove(list.size() - 1);
        //remove val key and its index from map
        map.remove(val);

        return true;
    }

    public int getRandom() {
        //initialize object from random class
        Random rand = new Random();
        //generate random index from 0 to list.size()-1 using nextInt
        //retrieve element from that random index using list.get
        return list.get(rand.nextInt(list.size()));
    }
}

