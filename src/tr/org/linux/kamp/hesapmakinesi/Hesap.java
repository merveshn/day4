package tr.org.linux.kamp.hesapmakinesi;

public enum Hesap {

	topla,cıkar,carp;

	
	
	public int hesapla(int x,int y) {
		switch(this) {
		case topla:
			return x+y;
		case cıkar:
			return x-y;
		case carp:
			return x*y;
		default:
			return -1;
		
		}
		
		
	}
}

