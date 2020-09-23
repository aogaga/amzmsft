package questions;

import java.util.HashMap;

public class App {

    public static int fib(int n, int k){
        if(k < n){
            return 1;
        }
         int result  = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < k; i++){

            if(i < n){
                map.put(i, i);
            }

            int total = 0;

            for(int z = 1; z < n; z++){
                
            }
        }

        return result;
    }
}
