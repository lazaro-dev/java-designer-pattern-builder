package encapsulamento;

public abstract class Error {
	
	private String msg;
	
	public Error(String msg) {
		this.msg = msg;
	}
	
	public String getMsg() {
		return msg;
	}
}
