package encapsulamento;

import java.util.ArrayList;

public class Composite {
	
	private ArrayList<FieldValidation> fieldValidations;
	
	public Composite(ArrayList<FieldValidation> fieldValidations) {
		this.fieldValidations = fieldValidations;
	}

	public static Composite build(ArrayList<FieldValidation> fieldValidations) {
		return new Composite(fieldValidations);
	}
	
	public String validate(String field, String val) {
		Error err=null;
		for (FieldValidation fieldValidation : this.fieldValidations) {
			
			if(fieldValidation.getField().equals(field)) {				
				err = fieldValidation.valid(val);
			}
			
			if(err !=null && err.getMsg()!=null) {				
				return err.getMsg();
			}
		}
		
		return null;
	}
}
