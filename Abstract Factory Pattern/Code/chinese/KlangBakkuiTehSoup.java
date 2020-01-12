package chinese;
//BARLA PETER 521 bpim1789
import Interfaces.MainDish;
import Interfaces.Soup;

public class KlangBakkuiTehSoup implements Soup {
	public void associateMainDish(MainDish m) {
		System.out.println("To " + this + " soup I associated the " + m + " maindish!");
	}

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}

}
