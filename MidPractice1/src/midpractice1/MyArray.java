
package midpractice1;

import java.util.ArrayList;


public class MyArray {
    private ArrayList<Integer> vals;

    public MyArray() {
    }

    public MyArray(ArrayList<Integer> vals) {
        this.vals = vals;
    }

    @Override
    public String toString() {
        String x ="";
        for(Integer i : vals){
            x+=i;
            x+=",";
        }
        return x;
    }
    

    public ArrayList<Integer> getVals() {
        return vals;
    }

    public void setVals(ArrayList<Integer> vals) {
        this.vals = vals;
    }
    
    //public static String merge(MyArray arr1, MyArray arr2){
        //return arr1.toString()+arr2.toString();
    //}
      public MyArray merge(MyArray arr3){
          return arr3;}
    
    
}
