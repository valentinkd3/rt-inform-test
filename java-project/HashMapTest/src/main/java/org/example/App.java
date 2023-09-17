package org.example;


import java.util.HashMap;
import java.util.Map;

public class App
{
    public Map<Integer, Integer> getSolution(int[] array){
        Map<Integer, Integer> result = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            if (!result.containsKey(array[i])){
                result.put(array[i],1);
            }
            else {
                int value = result.get(array[i]);
                result.put(array[i], ++value);
            }
        }
        return result;
    }
}
