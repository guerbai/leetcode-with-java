package guerbai.f901_f950;

public class IsLongPressedName {

    public boolean isLongPressedName(String name, String typed) {
        int in = 0;
        for (int i=0; i<typed.length(); i++) {
            if (typed.charAt(i) == name.charAt(in)) {
                if (in < name.length() - 1 && name.charAt(in+1) == typed.charAt(i)) {
                    in++;
                } else if (i < typed.length() - 1 && typed.charAt(i+1) != typed.charAt(i)) {
                    in++;
                }
            } else {
                return false;
            }
        }
        return in == name.length() - 1;
    }
}