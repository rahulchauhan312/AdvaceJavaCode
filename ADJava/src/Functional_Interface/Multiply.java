package Functional_Interface;

public class Multiply {
	public static void main(String[] args) {
		MyProgram2 p=(a,b) ->System.out.println(a*b);
		p.Multiply(10, 20);
	}
}
