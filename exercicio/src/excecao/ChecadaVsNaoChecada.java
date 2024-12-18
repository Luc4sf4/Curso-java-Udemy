package excecao;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) throws Exception{
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
		geraErro2();
		}catch(Throwable e){
			System.out.println(e.getMessage());
		}
		System.out.println("Fim :)");

	}

	//Não checada ou não verificada
	static void geraErro1() throws RuntimeException {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");//RunTime não é nescessário tratar 
	}

	//Execeção checada  ou verificada
	static void geraErro2() throws Exception  { //throws é a assinatura do método ja que ela é checada
		throw new Exception("Ocorreu um erro bem legal #02 !");
	}
}
