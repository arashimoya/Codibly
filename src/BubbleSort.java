import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BubbleSort {
    public List<Comparable> sort(List<Comparable> input) {
        if(input==null){
            throw new RuntimeException();
        }

        for (Comparable object: input) {
            if(object == null){
                input.remove(object);
            }
        }

        for(int i = 0; i < input.size(); i++){
            for(int j = 0; j<input.size() - 1; j++){
                if (input.get(j).compareTo(input.get(j + 1)) > 0){
                    Collections.swap(input,j,j+1);
                }
            }
        }
        return input;
    }




}
