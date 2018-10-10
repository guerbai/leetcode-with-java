package guerbai.f501_550;

import guerbai.util.TreeNode;

public class DetectCapitalUse{

    private static boolean detectCapitalUse(String word) {
        if (word.length() == 0) return true;
        boolean allBig = true;
        boolean allSmall = true;
        boolean capital = Character.isUpperCase(word.charAt(0));
        for (int i=0; i<word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i))) {
                allBig = false;
                break;
            }
        }
        for (int i=0; i<word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                allSmall = false;
                break;
            }
        }
        if (capital) {
            for (int i=1; i<word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    capital = false;
                    break;
                }
            }
        }
        return allBig || allSmall || capital;
    }
}
