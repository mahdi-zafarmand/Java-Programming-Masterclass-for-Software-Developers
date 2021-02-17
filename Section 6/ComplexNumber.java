
public class ComplexNumber {

	private double real, imaginary;
	
	public ComplexNumber(double _real, double _imaginary) {
		real = _real;
		imaginary = _imaginary;
	}

	public double getReal() {
		return real;
	}
	
	public double getImaginary() {
		return imaginary;
	}
	
	public void add(double _real, double _imaginary) {
		real += _real;
		imaginary += _imaginary;
	}
	
	public void add(ComplexNumber c) {
		real += c.getReal();
		imaginary += c.getImaginary();
	}

	public void subtract(double _real, double _imaginary) {
		real -= _real;
		imaginary -= _imaginary;
	}
	
	public void subtract(ComplexNumber c) {
		real -= c.getReal();
		imaginary -= c.getImaginary();
	}
}
