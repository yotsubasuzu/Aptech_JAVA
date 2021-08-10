public class LoginTest {
    public static void main(String[] args) {
        Login loginA = new Login();
        loginA.setUsername();
        loginA.setPassword();
        loginA.getUsername();
        loginA.getPassword();
        loginA.validate("","");
    }
}
