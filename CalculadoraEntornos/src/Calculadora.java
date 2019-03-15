public class Calculadora {

	private int num1;
	private int num2;

	public Calculadora(int a, int b) {
		num1 = a;
		num2 = b;
	}

	public int suma() {
		int res = num1 + num2;
		return res;
	}

	public boolean esMayor() {
		if (num1 > num2) {
			return true;
		} else {
			return false;
		}
	}

	public int resta() {
		if (esMayor()) {
			int res = num1 - num2;
			return res;
		} else {
			return (Integer)null;
		}
	}

	public int multiplica() {
		int res = num1 * num2;
		return res;
	}

	public int divide() {
		int res = num1 / num2;
		return res;
	}
}