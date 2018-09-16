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
        
        
        public void dodajSerieDoCwiczenia(int iloscSerii, Cwiczenie cwiczenie){
            
        }
                

	public void dodajTreningA(){
		final Trening treningA = new Trening("treningA");
		final Cwiczenie plaska = new Cwiczenie("plaska");
                
                dodajSerieDoCwiczenia(5, plaska);
		final Cwiczenie martwy = new Cwiczenie("martwy");
                dodajSerieDoCwiczenia(5, martwy);
		final SeriaTreningowa seriaNaPlaskiej = new SeriaTreningowa();
                final SeriaTreningowa seriaNaMartwym = new SeriaTreningowa();
		uzupelnijSerie(seriaNaPlaskiej);
                uzupelnijSerie(seriaNaMartwym);
                
                
                
                
		plaska.getSerie().add(seriaNaPlaskiej);
                martwy.getSerie().add(seriaNaMartwym);
		treningA.getListaCwiczen().add(plaska);
		treningA.getListaCwiczen().add(martwy);
		
                listaTreningów.add(treningA);
	}

	public void dodajTreningB(){

	}

	private void uzupelnijSerie(final SeriaTreningowa seria){
		System.out.println("Podaj nazwe cwiczenia");
                final String nazwaCwiczenia = scanner.next();
                System.out.println("Wprowadz obciazenie: ");
		final int obciazenie = scanner.nextInt();
		System.out.println("Wprowadz ilosc powtorzen");
		final int iloscPowtorzen = scanner.nextInt();
                System.out.println("-----------------------");
                seria.setNazwaCwiczenia(nazwaCwiczenia);
                seria.setPowtorzenia(iloscPowtorzen);
		seria.setObciazenie(obciazenie);
                
                
	}

}
