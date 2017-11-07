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
        for (int i=0; i<writing.size();i++){
            
        }
        return "fghc";
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
