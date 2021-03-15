package encapsulamento;

import java.util.ArrayList;

public class Validation {

	private String field;
	private ArrayList<FieldValidation> fieldValidation;
	
	private Validation(String field) {
		this.field = field;
		this.fieldValidation = new ArrayList<>(5);
	}
	
	public static Validation field(String field) {
		return new Validation(field);
	}
	
	public Validation required () {
		this.fieldValidation.add(new RequiredField(this.field));
		return this;
	}
	
	public Validation max (int max) {
		this.fieldValidation.add(new MaxField(this.field, max));
		return this;
	}
	
	public ArrayList<FieldValidation> build () {
		return this.fieldValidation;
	}
	
	
}
