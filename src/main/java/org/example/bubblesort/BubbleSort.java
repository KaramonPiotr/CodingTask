package org.example.bubblesort;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    public <T extends Comparable> List<T> sort(List<T> input){
        if(input == null){
            throw new RuntimeException("Input can't be null");
        }

        List<T> answer = new ArrayList<>();
        answer.addAll(input);


        //removes all null values from list
        while(answer.remove(null)){};

        int size = answer.size();
        T temp;

        for(int i = 0;i<size;i++){
            for(int j = 1;j<size-1;j++){
                if(String.valueOf(answer.get(j - 1)).compareTo(String.valueOf(answer.get(j))) > 0){
                    //Swaps elements
                    temp = answer.get(j-1);
                    answer.set(j-1, answer.get(j));
                    answer.set(j,temp);
                }
            }
        }
        return answer;
    }

}
