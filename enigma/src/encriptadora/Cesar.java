package encriptadora;

public class Cesar {
	public Cesar() {
		
	}

	private char[] ab= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','S','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	
	public String encriptacionAfin(int a, int b, String frase){
		
		String codificat = "";
		
		char[] desordenat=new char[ab.length];
		
		for(int x=0;x<ab.length;x++){
			int c;
			c=((a*x)+ b)%27;
			desordenat[x]=ab[c];
		}
		for(int f=0;f<frase.length();f++){
			for(int d=0;d<ab.length;d++){
				if(frase.charAt(f)==ab[d]){
					codificat+=desordenat[d];
				}
			}
		}
		return codificat;
	}
	
	public String desencriptacionAfin(int a, int b, String fraseenc){
			
			String descodificat = "";
			
			char[] desordenat=new char[ab.length];
			
			for(int x=0;x<ab.length;x++){
				int c;
				c=((a*x)+ b)%27;
				desordenat[x]=ab[c];
			}
			for(int f=0;f<fraseenc.length();f++){
				for(int d=0;d<desordenat.length;d++){
					if(fraseenc.charAt(f)==desordenat[d]){
						descodificat+=ab[d];
					}
				}
			}
			return descodificat;
		}
}
