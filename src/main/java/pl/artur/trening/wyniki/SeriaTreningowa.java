package pl.artur.trening.wyniki;

public class SeriaTreningowa {
	private int powtorzenia;
	private double obciazenie;

	public SeriaTreningowa() {
	}

	public SeriaTreningowa(final int powtorzenia, final double obciazenie) {
		this.powtorzenia = powtorzenia;
		this.obciazenie = obciazenie;
	}

	public int getPowtorzenia() {
		return powtorzenia;
	}

	public void setPowtorzenia(final int powtorzenia) {
		this.powtorzenia = powtorzenia;
	}

	public double getObciazenie() {
		return obciazenie;
	}

	public void setObciazenie(final double obciazenie) {
		this.obciazenie = obciazenie;
	}
}
