package pl.artur.trening.wyniki;

import java.util.ArrayList;
import java.util.List;

public class Cwiczenie {
	private String nazwa;
	private List<SeriaTreningowa> serie;

	public Cwiczenie() {
		serie = new ArrayList<SeriaTreningowa>();
	}

	public Cwiczenie(final String nazwa) {
		this.nazwa = nazwa;
		serie = new ArrayList<SeriaTreningowa>();
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(final String nazwa) {
		this.nazwa = nazwa;
	}

	public List<SeriaTreningowa> getSerie() {
		return serie;
	}

	public void setSerie(final List<SeriaTreningowa> serie) {
		this.serie = serie;
	}
}
