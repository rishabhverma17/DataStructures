/*
INTERVIEW BIT STRING QUESTION 

Given an array of strings, return all groups of strings that are anagrams. Represent a group by a list of integers representing 
the index in the original list. Look at the sample case for clarification.

Anagram : a word, phrase, or name formed by rearranging the letters of another, such as 'spar', formed from 'rasp' 
Note: All inputs will be in lower-case. 

Example :
Input : cat dog god tca
Output : [[1, 4], [2, 3]]

cat and tca are anagrams which correspond to index 1 and 4. dog and god are another set of anagrams which correspond to index 2 and 3. 
The indices are 1 based ( the first element has index 1 instead of index 0).
Ordering of the result : You should not change the relative ordering of the words / phrases within the group. 
Within a group containing A[i] and A[j], A[i] comes before A[j] if i < j.


 */
 
 public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Map<String,ArrayList<Integer>> map = new HashMap<>();
        int index = 0;
        for(String str : A){
            index++;
	        char tempArray[] = str.toCharArray();
            Arrays.sort(tempArray);
            String sortedString = new String(tempArray); 
            if(!map.containsKey(sortedString)){
                ArrayList<Integer> tmpAl = new ArrayList<Integer>();
                tmpAl.add(index);
                map.put(sortedString,tmpAl);
            }
            else{
                ArrayList<Integer> value = map.get(sortedString);
                value.add(index);
                map.put(sortedString,value);
            }
        }
        
        for(String s : map.keySet()){
            ArrayList<Integer> tmp = map.get(s);
            /*if(tmp.size() > 1){
                result.add(tmp);
            }*/
            result.add(tmp);
        }
        
        return result;
    }
}
