package encapsulamento;

public class RequiredError extends Error {

	public RequiredError() {
		super("Campo é obrigatório");
	}

}
