public class Login {

    public String username;
    public String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        if ("brian".equals(username)) {
            return username;
        }
        else {
            return "incorrect username";
        }
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        if ("spam".equals(password)) {
            return password;
        }
        else {
            return "incorrect password";
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isCorrect() {
        return "brian".equals(username) && "spam".equals(password);
    }


}
