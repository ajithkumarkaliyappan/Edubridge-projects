
public class Email<T,E> {
	T a;
	E b;
	
	public Email(T a, E b) {
		super();
		this.a = a;
		this.b = b;
	}

	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

	public E getB() {
		return b;
	}

	public void setB(E b) {
		this.b = b;
	}
	
	
}
