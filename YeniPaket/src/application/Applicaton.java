package application;

import odev1.InsanSinifi;
import odev1.MumineTayan;

public class Applicaton {
	
	public static void main(String[] args) {

		MumineTayan ref = new MumineTayan();
		
		int multi = ref.multi(3, 5);
		int sub = ref.sub(multi, 4);
		int sum = ref.sum(sub, 10);
		int div = ref.div(sum, 3);
		
		InsanSinifi bulent = new InsanSinifi("Bulent","Coskun");
		bulent.Yuru("Kuzey");
		
		InsanSinifi mumine = new InsanSinifi("Mumine","Tayan");
		mumine.Yuru("Bati");
		mumine.Yuru("Dogu");
		mumine.KacKereYurudun();
		mumine.Yuru("Kuzey");
		mumine.KacKereYurudun();
	
		bulent.KacKereYurudun();
	}
}
