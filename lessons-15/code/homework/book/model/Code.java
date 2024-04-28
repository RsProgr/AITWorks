package homework.book.model;

public class Code {
    public int lengthCode(long code) {
        return String.valueOf(code).length();
    }

    public int controlSum(long code) {
        int sum = 0;
        String codeStr = String.valueOf(code);
        for (int i = 0; i < codeStr.length(); i++) {
            sum += Character.getNumericValue(codeStr.charAt(i));
        }
        return sum;
    }

    public boolean isValid(long code) {
        int length = lengthCode(code);
        return length == 8 || length == 13;
    }
}


