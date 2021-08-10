import java.util.*;

public class Login {
    private String username;
    private String password;
    Scanner input = new Scanner(System.in);
    
    public Login(){
        username = "";
        password = "";
    }

    public void setUsername(){
        System.out.println("Enter Username: ");
        this.username = input.nextLine();
    }

    public void setPassword(){
        System.out.println("Enter Password: ");
        this.password = input.nextLine();
    }

    public void getUsername(){
        System.out.println(username);
    }
    
    public void getPassword(){
        System.out.println(password);
    }

    public void validate(String username, String password){
        if(this.username == username && this.password == password){
            System.out.println("Login Successful.");
        }
        else{
            System.out.println("Wrong username or password.");
        }
    }
}
