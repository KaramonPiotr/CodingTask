package org.example.balancedwords;

public class BalancedWordsCounter {
    //i created a monster, but it works... ;)
    public int count(String input){
        //initial condition
        if(input.length() == 0) return 0;

        int answer = 0;

        for(int i = 0;i<input.length();i++){
            //checks if input does not contain non-letters
            if(!Character.isLetter(input.charAt(i))) throw new RuntimeException();

            for(int j = i;j<=input.length();j++){
                if(isBalanced(input.substring(i,j))) answer++;
            }
        }
        return answer;
    }
    private boolean isBalanced(String input){
        //initial condition
        if(input.length() == 0) return false;

        int temp = charCounter(input, input.charAt(0));
        for (int i = 1; i < input.length(); i++) {
            if (charCounter(input, input.charAt(i)) != temp) {
                return false;
            }
        }
        return true;

    }
    private int charCounter(String input,char currentChar){
        int output = 0;
        for(int i = 0;i<input.length();i++){
            if(input.charAt(i)==currentChar){
                output++;
            }
        }
        return output;
    }
}
