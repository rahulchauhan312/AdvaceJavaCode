package Functional_Interface;

public class A {
	public static void main(String[] args) {
		MyProgram p=(a,b) ->System.out.println(a+b);
		p.add(10, 20);
	}
}
