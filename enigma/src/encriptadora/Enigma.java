package encriptadora;

public class Enigma {
	static String frase="Caminoalazardurantehoras";
	static String fraseenc="LDXIBJDTDZDUOGUDBCSEJUDY";
	static int a=4;
	static int b=3;
	static Cesar cesar= new Cesar();
	public static void main(String[] args) {
		System.out.println(cesar.encriptacionAfin(a,b,frase.toUpperCase()));
		System.out.println(cesar.desencriptacionAfin(a,b,fraseenc.toUpperCase()));
	}

}
