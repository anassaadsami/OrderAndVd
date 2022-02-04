package OrderAndVd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kladdkaka extends Order{
	public Kladdkaka(String orderName , int id) {
		super(orderName,id);
		
	}

	private List<String> ingredient = new ArrayList<>(Arrays.asList("smör","strösocker",
			"ägg","vetemjöl","kakao","vaniljsocker","salt"));
	@Override
	public void prepareOrder() {
		System.out.println("we preparing Kladdkaka now.");
		System.out.println("1.Smält smöret i kastrull."
				+ "2.Rör ihop socker, ägg, vetemjöl, kakao, vaniljsocker och salt."
				+"3.Tillsätt det smälta smöret."
				+"4.Häll smeten i en form"
				+"5.Grädda ca 20 min. Ugnstemperatur 17");

	}
	public void printIngrdient() {
		for (String item: ingredient) {
			System.out.println(item);
			
		}
	}
//	1.Smält smöret i kastrull
//	2.Rör ihop socker, ägg, vetemjöl, kakao, vaniljsocker och salt
//	3.Tillsätt det smälta smöret
//	4.Häll smeten i en form
//	5.Grädda ca 20 min. Ugnstemperatur 17
}
