package metodos;

public class Metodos {
	
	public static void ola() {
		System.out.println("Olá mundo!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ola();
		
		Metodos2.Victor();
		
		int resultadoMetodo = Metodos.somar(1,7);
		int resultado = resultadoMetodo * 2;
		System.out.println(resultado);
	}

	private static int somar(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}
	
		
	}


