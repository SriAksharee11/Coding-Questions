
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        
        int arr[] = {1, 0, -1, 2, 3, 0, 4, -2, 5, 6, -1, 7, 8};
        int chunk = 3;
        
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        
        // Filter out positive numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                list.add(arr[i]);
            }
        }
        
        // Create chunks of size 'chunk'
        for (int i = 0; i < list.size(); i += chunk) {
            List<Integer> l = new ArrayList<>();
            
            // Incorrect: inner loop starts from 0
            for (int j = 0; j < i + chunk && j < list.size(); j++) {
                l.add(list.get(j));
            }
            
            res.add(l);
        }
        
        System.out.println(res);
    }
}

//[[1, 2, 3], [4, 5, 6], [7, 8]]
