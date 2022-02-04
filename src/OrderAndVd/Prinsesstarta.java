package OrderAndVd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Prinsesstarta extends Order{
	
	public Prinsesstarta(String orderName , int id) {
		super(orderName,id);
		
	}

	private List<String> ingredient = new ArrayList<>(Arrays.asList("tårtbotten","visbyGrädde",
			"vaniljkräm","hallonsylt","marsipanlock","marsipanros","florsocker"));
	@Override
	public void prepareOrder() {
		System.out.println("we preparing Prinsesstarta now.");
//	1.Vispa grädden hård.
//	2.Ta fram en tårtbotten.
//	3.Applicera ett tunt lager hallonsylt.
//	4.Lägg på en tårtbotten.
//	5.Bred på ett lager vaniljkräm.
//	6.Fördela grädde på tårtan så den får en kupolform.
//	7.Lägg marsipanlocket på tårtan.
//	8.Garnera med marsipanros och florsocker.
//
	}
	public void printIngrdient() {
		for (String item: ingredient) {
			System.out.println(item);
			
		}
	}
}
