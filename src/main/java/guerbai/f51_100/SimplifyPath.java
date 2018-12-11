package guerbai.f51_100;

import java.util.ArrayList;
import java.util.List;

public class SimplifyPath {

    public String simplifyPath(String path) {
        String[] paths = path.split("/");
        List<String> validList = new ArrayList<>();
        for (String p: paths) {
            if (p.equals(".") || p.equals("")) {
                continue;
            } else if (p.equals("..")) {
                if (validList.size() > 0) {
                    validList.remove(validList.size()-1);
                }
            } else {
                validList.add(p);
            }
        }
        String[] validArray = new String[validList.size()];
        validArray = validList.toArray(validArray);
        return "/" + String.join("/", validArray);
    }

}