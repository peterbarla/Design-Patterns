package indian;

//BARLA PETER 521 bpim1789
import Interfaces.Chef;
import Interfaces.MainDish;
import Interfaces.Soup;

public class IndianChef implements Chef {

	public Soup prepareSoup() {

		return new AlmondSoup();
	}

	public MainDish prepareMainDish() {
		return new ChickpeaCurry();
	}

}
