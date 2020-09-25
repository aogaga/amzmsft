package questions;

public class RemoveComment {
      public static void main(String [] args){
        String s =   "// hello simple comment. \\n"
          +"public static string name(){\\n"
          +"}";
         s    =  s.replace("\\n", "^");
       
        System.out.println(removeAllComments(s));
      }
    public static String removeAllComments(String s){
        StringBuilder result = new StringBuilder();
        result.append("o") ;
           boolean keepRunning = false;
        for(int i = 0; i < s.length(); i++){
            String x = String.valueOf(s.charAt(i));
           
            if(x.equals("/") && (i+1) < s.length() && s.charAt(i+1) == '*' || s.charAt(i+1) == '/' ) {
                String secondChar = String.valueOf(s.charAt(i+1));

                    i++;

                 keepRunning = true;

                while(i < s.length() && keepRunning){
                    String z  = String.valueOf( s.charAt(i));
                    String y  = String.valueOf( s.charAt(i-1));
                    if(z.equals("/") && y.equals("*")){
                        keepRunning = false;
                    }
                    
                    if (z.equals("^")){

                       System.out.println("found end of line");
                        keepRunning = false;
                    }

                    i++;
                }

            }else{
               
                result.append(x);
            }
        }
        return result.toString();
    }
}
