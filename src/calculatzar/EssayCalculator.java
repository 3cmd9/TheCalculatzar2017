package calculatzar;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 072584980
 */
public class EssayCalculator {

    private String essay;

    public EssayCalculator(String ess) {
        essay = ess;
    }
    
    public ArrayList<String> noPuncSplitWords(){
    String tempEssay= essay;
    String lowercase=tempEssay.toLowerCase();
        ArrayList<String> words=new ArrayList<>();
    for (int i=0; i<tempEssay.length(); i++){
            if (lowercase.charAt(i)>=97&&lowercase.charAt(i)<=122){
            essay+=tempEssay.charAt(i);
            }
        words = splitEssay(' ');
        essay = tempEssay;
    }
        return words;
    }
    
    public double avgWordLength(){
        ArrayList<String> words = splitEssay(' ');
        double totalChar = 0;
        for (int i= 0; i<words.size(); i++){
            totalChar+=words.get(i).length();
        }
        return totalChar/words.size();
    }

    public ArrayList<String> splitEssay(char c) {
        ArrayList<String> ess = new ArrayList<>();
        String piece = "";
        for (int i = 0; i < essay.length(); i++) {
            if (essay.charAt(i) != c) {
                piece += essay.charAt(i);
            } 
            else if (!piece.equals("")) {
                ess.add(piece);
                piece = "";
            }
        }
        return ess;
    }
    public String repeatingWord (){//returns the most repetetive word
        ArrayList<String> writing = noPuncSplitWords();
        ArrayList<String> unique = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();
        for (int i=0; i<writing.size();i++){
            //check if the item in the array list equals any previous terms in the array unique 
            for (int j=0;j<unique.size();j++){
                //if yes, add one to the count array with the same index of the repeating word in unique array
                if (writing.get(i)==unique.get(j)){
                    count.add(j, 1);
                }
                //if not add the word in a new index in the array unique, and add one to the count array with the same index
                if(writing.get(i)!=unique.get(j)){
                    unique.add(writing.get(i));
                    count.add(unique.size()-1, 1);
                }
            }
        }
        //loop through the count arraylist and find the index of the one with the highest count
        int tempCount=0;
        int index=0;
        for(int i=0;i<count.size();i++){
            if(count.get(i)>tempCount){
                tempCount=count.get(i);//store the currect largest value in tempCount to compare in the next round
                index=i;//stores the index of the largest current count
            }
        }
        return(unique.get(index));
    }
    public int wordCount(){
        String[] wSplit =essay.split(" ");
        return wSplit.length;
    }
    public int sentCount(){
        String[] sSplit = essay.split(".\\?\\!");
        return sSplit.length;
    }
    public int charCountSpaces(){
        return essay.length();
    }
    public int charCountNoSpaces(){
        int cCount=0;
        for(int i=0; i<essay.length();i++){
            if(essay.charAt(i)!=' ')
                cCount++;        
        }
        return cCount;
    }
    public int parCount(){
        String[] pSplit = essay.split("\n");
        return pSplit.length;
    }

}
