public class funcao extends Thread{

	private modifica ms;

	public funcao(modifica ms) {
		this.ms = ms;
	}

	@Override
	public void run() {
		try {
			
			//irá imprimir a mensagem
			System.out.println(Thread.currentThread().getName() + ": " + ms.getMsg());
			
			//aqui vai tornar o proximo caractere que esta minusculo, em maisculo
			ms.LetraMaiuscula();
			
			// faz a thread dormir por 1 seg
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}