import java.io.Serializable;

public class User implements Serializable {
String login;
String password;

public void sayHello () {
	System.out.println("Hello, "+ login);
}

}
