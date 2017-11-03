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
    
    String tempEssay= essay
            for (int i=0; i<tempEssay.length(); i++){
    if (tempEssay.charAt(i)!=','){
        essay+=tempEssay.charAt(i);
    }
    ArrayList<String> words = splitEssay(' ')
            essay = tempEssay;
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
        if(!piece.equals("")){
            ess.add(piece);
        }
        return ess;
    }
    public int wordCount(){
        String[] wSplit =essay.split(" ");
        return wSplit.length;
    }
    public int sentenceCount(){
        String[] sSplit = essay.split(".\\?\\!");
        return sSplit.length;
    }
    public int charCountSpaces(){
        return essay.length();
    }
}
