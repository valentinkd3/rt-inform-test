import java.util.HashMap
import java.util.Map

class Solution {

    static void main(String[] args) {
      int[] myArray = [1, 3, 4, 5, 1, 5, 4]
      Map<Integer, Integer> solution = getSolution(myArray)
      println(solution)
    }


    static Map<Integer, Integer> getSolution(int[] array) {
        Map<Integer, Integer> result = new HashMap<>()
        for (int i = 0; i < array.length; i++) {
            if (!result.containsKey(array[i])) {
                result.put(array[i], 1)
            } else {
                int value = result.get(array[i])
                result.put(array[i], ++value)
            }
        }
        return result
    }
}