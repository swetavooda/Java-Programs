public class Solution {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        int l[] = new int[queries.length];
        HashMap<String,Integer> map = new HashMap<String,Integer>(strings.length);
        for(String key : strings)
        {        
                
            if(map.containsKey(key)==false)
            {
                map.put(key,1);
            }
            else
            {
                
                    map.put(key, map.get(key) + 1);
            }
        }
        
        int c=0;
        for(String i:queries)
        {
            if(map.containsKey(i)==true)
            {
                l[c++]=(map.get(i));   
            }
            else
            {
                l[c++]=0;
            }
        }

        return l;
    }