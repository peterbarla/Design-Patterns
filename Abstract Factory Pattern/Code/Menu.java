import Interfaces.Chef;
import Interfaces.MainDish;
import Interfaces.Soup;
import chinese.ChineseChef;
import indian.IndianChef;

//BARLA PETER 521 bpim1789
public class Menu {
	private Soup soup;
	private MainDish mainDish;

	public void createMenu(Chef C) {

		soup = C.prepareSoup();
		mainDish = C.prepareMainDish();
		soup.associateMainDish(mainDish);
	}

	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.createMenu(new ChineseChef());
		menu.createMenu(new IndianChef());
	}

}
