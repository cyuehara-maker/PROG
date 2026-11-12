package enumtest;

public class E {
	
	Value value;
	
	public E(Value value) {
		this.value = value;
	}
	
	public String getValue() {
		return value.name();
	}
}

enum Value {
	ONE, TWO
}
