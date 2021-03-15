package encapsulamento;

public class RequiredField implements FieldValidation {

	public String field;
	public RequiredField(String field) {
		this.field = field;
	}

	@Override
	public Error valid(String val) {
		return ((val != null) && !val.isEmpty())? null : new RequiredError();
	}

	@Override
	public String getField() {
		return this.field;
	}
}
