
public class App {

	public static void main(String[] args) {
		
	   AsteriskLogger ast = new AsteriskLogger();
	   SpacedLogger spac = new SpacedLogger();
	  
	   ast.log("Hello");
	   ast.error("Error: Hello");
	 
	   spac.log("Hello");
	   spac.error("Error: Hello");  
	  
	}
}
