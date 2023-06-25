package odev1;

public class InsanSinifi {
	
	String isim = "";
	String soyisim = "";
	private int yurumeSayisi = 0;
	
	public InsanSinifi(String adi, String soyadi) {
		isim= adi;
		soyisim = soyadi;
	}
	
 	

	public void TamAdinNe() {
		System.out.println("Benim ilk adim" + isim + "soyadim " + soyisim);
	}
	
	public void KacKereYurudun( ) {
		System.out.println("Omrum Boyunca " + yurumeSayisi + " kere yurudum! ");		
	}
	

	public void Yuru(String yon) {
		yurumeSayisi +=1;
		
		System.out.println("Ben " + isim + " " + yon + " yonunde yuruyorum");
	}
}
