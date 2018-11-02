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

	public void dodajTreningA() {
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

	}

	//	public void dodajTreningB() {
	//		final Trening treningB = new Trening("treningB");
	//
	//		final Cwiczenie plaskaSila = new Cwiczenie("Plaska Sila");
	//		final Cwiczenie drazek = new Cwiczenie("Drazek");
	//		final Cwiczenie ohp = new Cwiczenie("OHP");
	//		final Cwiczenie tricLinka = new Cwiczenie("Tric linka");
	//		final Cwiczenie bicHantle = new Cwiczenie("Bic hantle");
	//
	//		dodajSerieDoCwiczenia(5, plaskaSila);
	//		dodajSerieDoCwiczenia(5, drazek);
	//		dodajSerieDoCwiczenia(4, ohp);
	//		dodajSerieDoCwiczenia(4, tricLinka);
	//		dodajSerieDoCwiczenia(4, bicHantle);
	//
	//		final SeriaTreningowa seriaNaPlaskiejSila = new SeriaTreningowa();
	//		final SeriaTreningowa seriaNaDrazku = new SeriaTreningowa();
	//		final SeriaTreningowa seriaNaOHP = new SeriaTreningowa();
	//		final SeriaTreningowa seriaNaTricLinka = new SeriaTreningowa();
	//		final SeriaTreningowa seriaNaBicHantle = new SeriaTreningowa();
	//
	//		uzupelnijSerie(seriaNaPlaskiejSila);
	//		uzupelnijSerie(seriaNaDrazku);
	//		uzupelnijSerie(seriaNaOHP);
	//		uzupelnijSerie(seriaNaTricLinka);
	//		uzupelnijSerie(seriaNaBicHantle);
	//
	//		plaskaSila.getSerie().add(seriaNaPlaskiejSila);
	//		drazek.getSerie().add(seriaNaDrazku);
	//		ohp.getSerie().add(seriaNaOHP);
	//		tricLinka.getSerie().add(seriaNaTricLinka);
	//		bicHantle.getSerie().add(seriaNaBicHantle);
	//
	//		treningB.getListaCwiczen().add(plaskaSila);
	//		treningB.getListaCwiczen().add(drazek);
	//		treningB.getListaCwiczen().add(ohp);
	//		treningB.getListaCwiczen().add(tricLinka);
	//		treningB.getListaCwiczen().add(bicHantle);
	//
	//		listaTreningów.add(treningB);
	//
	//	}

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

		for (Cwiczenie cwiczenie : trening.getListaCwiczen()) {
			System.out.println(cwiczenie.getNazwa());
			for(SeriaTreningowa seria : cwiczenie.getSerie()){
				System.out.println(seria.getPowtorzenia()+" "+seria.getObciazenie());
			}

		}
	}

}
