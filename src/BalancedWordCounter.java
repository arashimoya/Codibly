import java.util.*;
import java.util.stream.Collectors;

public class BalancedWordCounter {
    public int count(String input) {

        if (input == null) {
            throw new RuntimeException();
        }
        if (input.matches("")) {
            return 0;
        }
        if (!input.matches("[a-zA-Z]+")) {
            throw new RuntimeException();
        }

        char[] str = input.toCharArray();
        int n = str.length;
        List<String> list = new ArrayList<>();

        for (int len = 1; len <= n; len++) {
            // Pick ending point
            for (int i = 0; i <= n - len; i++) {
                //  Print characters from current
                // starting point to current ending
                // point.
                int j = i + len - 1;
                String newStr = "";
                for (int k = i; k <= j; k++) {

                    newStr += str[k];
                }

                list.add(newStr);
            }
        }

        List<String> filteredList = new ArrayList<>();

        for (String string : list) {
            if (isBalanced(string)) {
                filteredList.add(string);
            }
        }

        return filteredList.size();
    }


    public boolean isBalanced(String s) {
        Map<Character,Integer> occurring=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            occurring.put(ch,occurring.getOrDefault(ch,0)+1);
        }
        int temp=-1;
        for(Map.Entry<Character,Integer> i:occurring.entrySet()){
            if(temp==-1){
                temp=i.getValue();
            }

            if(temp!=i.getValue())
                return false;
        }
        return true;
    }
}