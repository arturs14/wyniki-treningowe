package pl.artur.trening.wyniki;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreningManager {

	private List<Trening> listaTreningów;
	private final Scanner scanner = new Scanner(System.in);

	public TreningManager() {
		listaTreningów = new ArrayList<Trening>();
	}

	public List<Trening> getListaTreningów() {
		return listaTreningów;
	}

	public void setListaTreningów(final List<Trening> listaTreningów) {
		this.listaTreningów = listaTreningów;
	}

	public Trening dodajTreningA() {
		final Trening treningA = new Trening("treningA");

		final Cwiczenie plaska = new Cwiczenie("Plaska");
		final Cwiczenie martwy = new Cwiczenie("Martwy");
		final Cwiczenie dipy = new Cwiczenie("Dipy");
		final Cwiczenie barkiBokiem = new Cwiczenie("Barki bokiem");
		final Cwiczenie bicSztanga = new Cwiczenie("Bic sztanga");

		dodajSerieDoCwiczenia(2, plaska);
		dodajSerieDoCwiczenia(1, martwy);
		dodajSerieDoCwiczenia(1, dipy);
		dodajSerieDoCwiczenia(1, barkiBokiem);
		dodajSerieDoCwiczenia(1, bicSztanga);

		treningA.getListaCwiczen().add(plaska);
		treningA.getListaCwiczen().add(martwy);
		treningA.getListaCwiczen().add(dipy);
		treningA.getListaCwiczen().add(barkiBokiem);
		treningA.getListaCwiczen().add(bicSztanga);

		listaTreningów.add(treningA);

		wyswietlTrening(treningA);

		return treningA;

	}

	public Trening dodajTreningB() {
		final Trening treningB = new Trening("treningB");

		final Cwiczenie plaskaSila = new Cwiczenie("Plaska Sila");
		final Cwiczenie drazek = new Cwiczenie("Drazek");
		final Cwiczenie ohp = new Cwiczenie("OHP");
		final Cwiczenie tricLinka = new Cwiczenie("Tric linka");
		final Cwiczenie bicHantle = new Cwiczenie("Bic hantle");

		dodajSerieDoCwiczenia(2, plaskaSila);
		dodajSerieDoCwiczenia(1, drazek);
		dodajSerieDoCwiczenia(1, ohp);
		dodajSerieDoCwiczenia(1, tricLinka);
		dodajSerieDoCwiczenia(1, bicHantle);

		treningB.getListaCwiczen().add(plaskaSila);
		treningB.getListaCwiczen().add(drazek);
		treningB.getListaCwiczen().add(ohp);
		treningB.getListaCwiczen().add(tricLinka);
		treningB.getListaCwiczen().add(bicHantle);

		listaTreningów.add(treningB);

		wyswietlTrening(treningB);

		return treningB;

	}

	public void dodajSerieDoCwiczenia(final int iloscSerii, final Cwiczenie cwiczenie) {
		for (int i = 0; i < iloscSerii; i++) {
			final SeriaTreningowa seria = new SeriaTreningowa();
			uzupelnijSerie(seria, cwiczenie.getNazwa(), iloscSerii, i + 1);
			cwiczenie.getSerie().add(seria);
		}
	}

	private void uzupelnijSerie(final SeriaTreningowa seria, final String nazwaCwiczenia, final int iloscSerii,
					final int aktualnaSeria) {
		System.out.println(nazwaCwiczenia + " - seria " + aktualnaSeria + " z " + iloscSerii + ":");
		System.out.println("Wprowadz obciazenie: ");
		final int obciazenie = scanner.nextInt();
		System.out.println("Wprowadz ilosc powtorzen");
		final int iloscPowtorzen = scanner.nextInt();
		System.out.println("-----------------------");
		seria.setPowtorzenia(iloscPowtorzen);
		seria.setObciazenie(obciazenie);
	}

	private void wyswietlTrening(final Trening trening) {

		for (final Cwiczenie cwiczenie : trening.getListaCwiczen()) {
			System.out.println(cwiczenie.getNazwa());
			for (final SeriaTreningowa seria : cwiczenie.getSerie()) {
				System.out.println(seria.getPowtorzenia() + " " + "*" + " " + seria.getObciazenie());
			}
		}
	}

	public double obliczObjetoscTreningu(final Trening trening) {
		double objetosc = 0;
		for (final Cwiczenie cwiczenie : trening.getListaCwiczen()) {
			for (final SeriaTreningowa seria : cwiczenie.getSerie()) {
				objetosc = objetosc + seria.getObciazenie() * seria.getPowtorzenia();
			}
		}
		return objetosc;
	}

	public double obliczObjetoscCwiczenie(final Trening trening) {
		double objetoscCwiczenia = 0;
		final String nazwaCwiczenia = scanner.next();
		for (final Cwiczenie cwiczenie : trening.getListaCwiczen()) {
			if (nazwaCwiczenia.equals(cwiczenie.getNazwa())) {
				for (final SeriaTreningowa seria : cwiczenie.getSerie()) {
					objetoscCwiczenia = objetoscCwiczenia + seria.getPowtorzenia() * seria.getObciazenie();
				}
			}
		}
			return objetoscCwiczenia;}

	}
