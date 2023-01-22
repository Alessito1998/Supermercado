package extra;

import java.util.*;

public class DireccionesDeCorreo {

	public static void separar(String [] c, String [] d, List <String> ds) {
		
		for(int n = 0; n < c.length; n++) {
			
			d = c[n].split("@");
			
			if (d.length == 2) {
				
				ds.add(d[1]);
				
			}
				
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String correos = "alex@gmail.com;alex@hotmail.com;alex@yahoo.com;xela@gmail.com;alex@u-tad.live.com";
		
		String [] correOs = correos.split(";");
		
		String [] dominios = new String [2];
		
		List <String> dominiOs = new LinkedList <String>();
		
		separar(correOs, dominios, dominiOs);
		
		HashSet <String> dOminiOs = new HashSet <String> (dominiOs);
		
		System.out.println(dOminiOs);
		
	}

}
