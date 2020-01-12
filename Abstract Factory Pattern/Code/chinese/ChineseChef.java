package chinese;

import Interfaces.Chef;
import Interfaces.MainDish;
import Interfaces.Soup;

//BARLA PETER 521 bpim1789
public class ChineseChef implements Chef {
	public Soup prepareSoup() {

		return new KlangBakkuiTehSoup();
	}

	public MainDish prepareMainDish() {
		return new KungPaoChicken();
	}

}
