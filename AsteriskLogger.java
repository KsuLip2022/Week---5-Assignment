
public class AsteriskLogger implements Logger {

	@Override
	public void log(String info) {
		System.out.println(buildAsteriskLogger(info));
	}
//   ***Hello*** 
		private String buildAsteriskLogger(String info) {
		return "***" + info + "***";
	}
		
	
	
	@Override
	public void error(String info) {
//      *****************
//		***Error:Hello***
//		*****************	
	String astInfo = buildAsteriskLogger(info);
	String ast = "*".repeat(astInfo.length());
	
	System.out.println(ast);
	System.out.println(astInfo);
	System.out.println(ast);
	}

		


}