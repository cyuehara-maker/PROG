package enumtest;

public class Test {
	public static void main(String[] args) {
		E e = new E(Value.ONE);
		System.out.println(e.getValue().equals("ONE"));
	}
}
