package guerbai.f1_50;

public class IntToRoman {

    private static String intToRoman(int num) {
        int qianWei = num / 1000;
        int baiWei = (num - qianWei*1000) / 100;
        int shiWei = (num - qianWei*1000 - baiWei*100) / 10;
        int geWei = num - qianWei*1000 - baiWei*100 - shiWei*10;
        StringBuilder roman = new StringBuilder();
        if (qianWei>=1 && qianWei<=3) {
            for (int i=0; i<qianWei; i++) {
                roman.append('M');
            }
        }
        if (baiWei>=1 && baiWei<=3) {
            for (int i=0; i<baiWei; i++) {
                roman.append('C');
            }
        } else if (baiWei==4) {
            roman.append('C');
            roman.append('D');
        } else if (baiWei>=5 && baiWei<=8) {
            roman.append('D');
            for (int i=5; i<baiWei; i++) {
                roman.append('C');
            }
        } else if (baiWei==9) {
            roman.append('C');
            roman.append('M');
        }
        if (shiWei>=1 && shiWei<=3) {
            for (int i=0; i<shiWei; i++) {
                roman.append('X');
            }
        } else if (shiWei==4) {
            roman.append('X');
            roman.append('L');
        } else if (shiWei>=5 && shiWei<=8) {
            roman.append('L');
            for (int i=5; i<shiWei; i++) {
                roman.append('X');
            }
        } else if (shiWei==9) {
            roman.append('X');
            roman.append('C');
        }
        if (geWei>=1 && geWei<=3) {
            for (int i=0; i<geWei; i++) {
                roman.append('I');
            }
        } else if (geWei==4) {
            roman.append('I');
            roman.append('V');
        } else if (geWei>=5 && geWei<=8) {
            roman.append('V');
            for (int i=5; i<geWei; i++) {
                roman.append('I');
            }
        } else if (geWei==9) {
            roman.append('I');
            roman.append('X');
        }
        return roman.toString();
    }

    public static void main(String[] args) {
        int num = 4;
        System.out.println(intToRoman(num));
    }
}
