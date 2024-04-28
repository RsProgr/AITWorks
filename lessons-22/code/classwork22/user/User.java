package classwork22.user;

public class User {
    //fields
    private String email;
    private String password;


    public User(String email, String password) {
        setEmail(email);
        setPassword(password);

    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (validateemail(email)) {
            this.email = email;
        } else {
            System.out.println(email + " is wrong email.");
        }
    }
    /*
1) @ exists and only one

2) dot after @

3) after last dot minimum 2 symbols (.ru, .de, .com)

4) alphabetic, digits, _ , - , . , @
     */

    private boolean validateemail(String email) {
        //bad options - return false
        int indexAt = email.indexOf('@');
        if (indexAt <= 0 || indexAt != email.lastIndexOf('@')) {
            return false;
        }
        if (email.indexOf('.', indexAt) == -1) {
            return false;
        }
        if (email.indexOf('.') >= email.length() - 2) {
            return false;
        }
        for (int i = 0; i < email.length(); i++) { // проверка на допустимые символы
            char c = email.charAt(i);
            if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')
                    || c == '_' || c == '-' || c == '.' || c == '@')) {

                return false;
            }
        }
        //good options - return false
        return true;
    }

    private String setPassword(String password) {
        return null;
    }
}
