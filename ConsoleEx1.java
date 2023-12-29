import java.io.Console;

public class ConsoleEx1 {

	public static void main(String[] args) throws Exception {
		Console c=System.console();
		
		String name=c.readLine("Enter your name:");
		char[] pwd=c.readPassword("Password:");
		String cpwd=new String(pwd);
		System.out.println("Your name is:"+name);
		System.out.println("The password is:"+cpwd);

	}

}

String  --> next()
int   --> nextInt()
float ---> nextFloat()
double-->  nextDouble()