package ar.edu.unju.fi.ejercicio16;

public class CalculoMatematico {
	public int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public CalculoMatematico(int n) {
		super();
		this.n = n;
	}
	
	public static int calcularSumatoria(int n) {
		double sumat=0;
		int s=0;
		
		for (int i=n;i > 0;i--) {
			sumat = CalcularPotencia(((i*(i+1))/2),2);
			s=(int) (s+sumat);
		}
		System.out.println("La sumatoria de " + n + " es " + s);
		return s;
	}
	
	public static int calcularProductoria(int n) {
		double produc=1;
		int p=1;
		for (int i=n;i > 0;i--) {
			produc = i*(i+4);
			p=(int) (p*produc);
		}
		System.out.println("La productoria de " + n + " es " + p);
		return p;
	}
	
	
	static double CalcularPotencia (int num, int pow){
        return Math.pow(num,pow);
    }
}
