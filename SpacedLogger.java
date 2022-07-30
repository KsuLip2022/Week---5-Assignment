
public class SpacedLogger implements Logger{

	@Override
	public void log(String info) {
//     H e l l o 
		System.out.println(buildAsteriskLogger(info));
	}

		
		private String buildAsteriskLogger(String info) {
		StringBuilder a = new StringBuilder();
		
		for (int i = 0; i < info.length(); i++) {
			char ch = info.charAt(i);
			a.append(ch).append(" ");
		}
		
		a.setLength(a.length()-1);
		return a.toString();
	}

	@Override
	public void error(String info) {
//     E r r o r : H e l l o
		
		System.out.println(buildAsteriskLogger(info));
		
	}
}
