package pl.artur.trening.wyniki;

public class Main {

	public static void main(final String[] args) {
		final TreningManager manager = new TreningManager();
		final Trening trening = manager.dodajTreningB();
		System.out.println();
		System.out.println(manager.obliczObjetoscTreningu(trening));
		System.out.println(manager.obliczObjetoscCwiczenie(trening));

                
               
                
	}
}
