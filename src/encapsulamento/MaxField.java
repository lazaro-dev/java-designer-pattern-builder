package encapsulamento;

public class MaxField implements FieldValidation {

	public String field;
	private int max;
	public MaxField(String field, int max) {
		this.field = field;
		this.max = max;
	}

	@Override
	public Error valid(String val) {
//		System.out.println((val.length()<=this.max));
		return ((val.length()<=this.max)? null : new MaxError());
	}

	@Override
	public String getField() {
		return this.field;
	}
}
