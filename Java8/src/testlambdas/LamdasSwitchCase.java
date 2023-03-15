package testlambdas;

public class LamdasSwitchCase {
	
	static double calculate(String operator, double x, double y) {
		return switch(operator) {
		case "+" -> x+y;
		case "-" -> x-y;
		case "*" -> x*y;
		case "/" ->{
			if (y==0) {
				throw new IllegalArgumentException("Cant divide");
			}
		
		yield x/y;
		}
	
	default -> throw new IllegalArgumentException("Cant divide");
		};
		
	}
	
public static void main(String[] args) {
	LamdasSwitchCase l = new LamdasSwitchCase();
	l.calculate("/", 5, 6);
	System.out.println(l.calculate("-", 5, 6));
}

}

