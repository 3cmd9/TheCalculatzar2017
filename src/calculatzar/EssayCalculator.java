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
    public String repeatingWords (){
        ArrayList<String> writing = splitEssay(' ');
        for (int i=0; i<)
    }

}
