//group anagrams together
//if characters of anagrams are sorted,they result in a same string
//e.g sorting string eat,tea,ate gives us the same sorted string aet.
class Prob49
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        //create hashmap to map sorted string to corresponding anagrams
        //key=sorted string,value=list of mapped anagrams
        Map<String,List<String>> anagrams=new HashMap<>();
        for(String s:strs)
        {
          //convert string into character array
          char[] ch=s.toCharArray();
          Arrays.sort(ch);
          
          //convert sorted array back to string and store as key
          String key=String.valueOf(ch);
          //if sorted string doesnt exist,put it as key along with creating an arraylist to store values
          anagrams.putIfAbsent(key,new ArrayList<>());
          //if key is present, get the arraylist of values and add current string to it
          anagrams.get(key).add(s);

        }
        //store all values in new list
        List<List<String>> groups=new ArrayList<>();
        for(List<String> group:anagrams.values())
        {
            groups.add(group);
        }
        return groups;
    }
}
