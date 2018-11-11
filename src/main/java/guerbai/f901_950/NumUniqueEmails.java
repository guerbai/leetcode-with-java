package guerbai.f901_950;

public class NumUniqueEmails {

    public int numUniqueEmails(String[] emails) {
        Set<String> s = new HashSet<>();
        for (String email: emails) {
            StringBuilder sb = new StringBuilder();
            boolean metAt = false;
            boolean metAdd = false;
            for (int i=0; i<email.length(); i++) {
                if (metAt) {
                    sb.append(email.charAt(i));
                }
                if (email.charAt(i) == '+') {
                    metAdd = true;
                }
                if (email.charAt(i) == '@'){
                    metAt = true;
                }
                if (!(email.charAt(i) == '.' || metAdd || !metAt)) {
                    sb.append(email.charAt(i));
                }
            }
            s.add(sb.toString());
        }
        return s.size();
    }

}