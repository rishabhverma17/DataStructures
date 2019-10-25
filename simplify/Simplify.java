import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Simplify{
    public void findPath(HashMap finalBill){
        // Step 1: Get the maximum and minimum amount users from finalBill
        Double maxCrediter = (double) Collections.max(finalBill.values());
        Double maxBorrower = (double) Collections.min(finalBill.values());

        if(maxCrediter != maxBorrower){
            String maxCreditUser = getKeyFromValue(finalBill, maxCrediter).toString();
            String maxBorowerUser = getKeyFromValue(finalBill, maxBorrower).toString();

            double result = maxCrediter+maxBorrower;
            result = round(result,1);

            if(result >= 0.0){
                System.out.println(maxBorowerUser + " needs to pay " + maxCreditUser + ":" + round(Math.abs(Min_Value), 2));
                finalBill.remove(maxCreditUser);
                finalBill.remove(maxBorowerUser);
                finalBill.put(maxCreditUser, result);
                finalBill.put(maxBorowerUser, 0.0);
            }
            else{
                System.out.println(maxBorowerUser + " needs to pay " + maxCreditUser + ":" + round(Math.abs(Max_Value), 2));
                details.remove(maxCreditUser);
                details.remove(maxBorowerUser);
                details.put(maxCreditUser, 0.0);
                details.put(maxBorowerUser, result);
            }
            findPath(finalBill);
        }
    }
    public static Object getKeyFromValue(HashMap hm, Double value) {
        for (Object o : hm.keySet()) {
            if (hm.get(o).equals(value)) {
                return o;
            }
        }
        return null;
    }

    public static double round(double value, int places) {
        if (places < 0)
            throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}