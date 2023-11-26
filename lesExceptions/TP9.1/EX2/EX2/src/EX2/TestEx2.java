package EX2;
import java.util.Scanner;

class WrongLoginException extends Exception {
	public String login(String msg) {
		return ("votre login incorrect!");
	}
}

class WrongPwdException extends Exception {
	public String login(String msg) {
		return ("votre mot de passe est errone!");
	}
}

class WrongInputLength extends Exception {
	public String login(String msg) {
		return ("votre login où votre pwd saisi dépasse 10 caractères!");
	}
}

public class TestEx2 {
	//Authentification
	private final String LoginCorrect;
	private final String PwdCorrect;
	Scanner sc =new Scanner(System.in);
	//
	public TestEx2(String LoginCorrect,String PwdCorrect) {
		this.LoginCorrect="scott";
		this.PwdCorrect="tiger";
	}
	//
	public String getLoginCorrect() {
		return LoginCorrect;
	}
	public String getPwdCorrect() {
		return PwdCorrect;
	}
	//
	public String userInfo(String msg)throws 
	///Tu dois le faire dans une bouvle do while pour tous les catch ->dans chaque catch ok= true 
}
