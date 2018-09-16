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

	public void dodajTreningA(){
		final Trening treningA = new Trening("treningA");
		final Cwiczenie plaska = new Cwiczenie("plaska");
		final SeriaTreningowa seriaNaPlaskiej = new SeriaTreningowa();

		uzupelnijSerie(seriaNaPlaskiej);

		plaska.getSerie().add(seriaNaPlaskiej);
		treningA.getListaCwiczen().add(plaska);
		listaTreningów.add(treningA);
	}

	public void dodajTreningB(){

	}

	private void uzupelnijSerie(final SeriaTreningowa seria){
		System.out.println("Wprowadz obciazenie: ");
		final int obciazenie = scanner.nextInt();
		System.out.println("Wprowadz ilosc powtorzen");
		final int iloscPowtorzen = scanner.nextInt();
		seria.setPowtorzenia(iloscPowtorzen);
		seria.setObciazenie(obciazenie);
	}

}
