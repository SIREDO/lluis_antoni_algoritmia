package encriptadora;

public class Enigma {
	static String frase="Camino al azar durante horas";;
	static int a=4;
	static int b=3;
	static Cesar cesar= new Cesar();
	public static void main(String[] args) {
		System.out.println(cesar.encriptacionAfin(a,b,frase.toUpperCase()));
	}

}
