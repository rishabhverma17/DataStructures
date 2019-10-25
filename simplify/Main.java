import java.util.HashMap;

class Main{
    public static void main(String[] args){
        Map<String,Double> hm = new HashMap<String,Double>();
        hm.put("A", -5.0);
        hm.put("B", 25.0);
        hm.put("C", -20.0);
        hm.put("D", 25.0);
        hm.put("E", -20.0);
        hm.put("F", -5.0);

        //Passing values to findPath Method.
        findPath(hm);
    }
}