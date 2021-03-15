package encapsulamento;

import java.util.ArrayList;

public class FactoryComposite {
	public static ArrayList<FieldValidation> fieldValidations = new ArrayList<>(5);
	public static Composite factory() {
		destructuring(Validation.field("nome").required().build());
		destructuring(Validation.field("senha").required().max(5).build());
//		fieldValidation.add(Validation.field("nome").required().build().get(0));
//		fieldValidation.add(Validation.field("senha").required().max(5).build().get(0));

		return Composite.build(fieldValidations);
	}
	
	public static void destructuring(ArrayList<FieldValidation> fields) {
		for (FieldValidation field : fields) {
			fieldValidations.add(field);
		}
	}
}
