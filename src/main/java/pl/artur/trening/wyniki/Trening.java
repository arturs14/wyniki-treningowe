package pl.artur.trening.wyniki;

import java.util.ArrayList;
import java.util.List;

public class Trening {
	private String typTreningu;

	//dodać datę - klasa Date

	private List<Cwiczenie> listaCwiczen;

	public Trening(final String typTreningu) {
		this.typTreningu = typTreningu;
		listaCwiczen = new ArrayList<Cwiczenie>();
	}

	public Trening() {
		listaCwiczen = new ArrayList<Cwiczenie>();
	}

	public String getTypTreningu() {
		return typTreningu;
	}

	public void setTypTreningu(final String typTreningu) {
		this.typTreningu = typTreningu;
	}

	public List<Cwiczenie> getListaCwiczen() {
		return listaCwiczen;
	}

	public void setListaCwiczen(final List<Cwiczenie> listaCwiczen) {
		this.listaCwiczen = listaCwiczen;
	}
}
