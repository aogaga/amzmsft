package questions;

import java.util.HashMap;

public class App {

    public static void main(String [] args){
        System.out.println(fib(3, 4));
    }
    public static int fib(int n, int k){
        if(k <= n){
            return 1;
        }
         int result  = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i <= k; i++){
            int total = 0;
            if(i < n){
                total = 1;
            }else{



                for(int z = n; z > 0; z--){

                    total = total + map.get(i-z);
                }


            }

            map.put(i, total);
        }


//        for(int i = 0; i <= k; i++){
//            System.out.println(i);
//           System.out.println(map.get(i));
//        }
        return map.get(k);
    }
}
