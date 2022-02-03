
public class modifica {
	
	private StringBuilder msg;
	
	public modifica(String msg) {
		this.msg = new StringBuilder(msg);
	}
	
	//vai modificar o caractere para maiusulo
	public void LetraMaiuscula() {
		
		for (int i = 0; i < msg.length(); i++) {

			char letra = msg.charAt(i); // passa pra proxima letra
			if(Character.isLowerCase(letra)) { // se a proxima for letra minuscula modifica

				this.msg.setCharAt(i, Character.toUpperCase(letra));					
				break;
			}
		}
	}
	
	// retorna mensagem modificada
	public String getMsg() {
		return msg.toString();
	}
}