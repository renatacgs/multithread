import java.util.concurrent.*;

public class main {

	public static void main(String[] args) throws InterruptedException {
		
		// vai criar o threadPool com no maximo 30 threads
		ExecutorService es2 = new ThreadPoolExecutor(30, 30, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
		
		// mensagem de 80 caracteres
		String msg = "Quando uma thread receber uma mensagem, imprime e modifica o primeiro caractere!";
		// uma classe para modificar a mensagem que irá aparecer
		modifica ms = new modifica(msg);
		// instanciar o runnable
		funcao r = new funcao(ms);
		
		// vai iniciar as threads ate que seja feita a modificacao da mensagem toda.
		int cont = 0;
		while(cont < msg.length()) {

			es2.execute(r);
			cont++;
		}
		
		// aqui encerra o threadPool
		es2.shutdown();
		
		while(!es2.isTerminated()) {}
		System.out.println("Mensagem: "+ms.getMsg());
	}
}