package encapsulamento;

public class MainTest {

	public static void main(String[] args) {
		Composite validation = FactoryComposite.factory();
		String field1 = (validation.validate("nome", "lazaro")==null)?"passou":validation.validate("nome", "lazaro");
		String field2 = (validation.validate("senha", "123456")==null)?"passou":validation.validate("senha", "123456");
		System.out.println(field1);
		System.out.println(field2);
	}

}
