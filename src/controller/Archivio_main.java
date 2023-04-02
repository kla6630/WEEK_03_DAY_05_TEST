package controller;

import model.Dao;
import model.Libro;
import model.Rivista;
import model.TipoPeriodicita;

public class Archivio_main {

	public static void main(String[] args) {

		Libro lb = new Libro();
		lb.setTitolo("La fattoria degli animali");
		lb.setAutore("George Orwell");
		lb.setGenere("Distopico");
		lb.setAnnoDiPubblicazione(1945);
		lb.setNumeroPagine(144);

		Libro lb02 = new Libro();
		lb02.setTitolo("Harry Potter e la  pietra filosofale");
		lb02.setAutore("J.K. Rowling");
		lb02.setGenere("Fantasy");
		lb02.setAnnoDiPubblicazione(1997);
		lb.setNumeroPagine(600);

		Rivista rv = new Rivista();
		rv.setTitolo("Quattroruote");
		rv.setTipoPeriodicita(TipoPeriodicita.MENSILE);
		rv.setAnnoDiPubblicazione(2022);
		rv.setNumeroPagine(40);

		Rivista rv02 = new Rivista();
		rv02.setTitolo("La settimana enigmistica");
		rv02.setTipoPeriodicita(TipoPeriodicita.SETTIMANALE);
		rv02.setAnnoDiPubblicazione(2022);
		rv02.setNumeroPagine(33);

		Dao.save(lb);
		Dao.save(lb02);
		Dao.save(rv);
		Dao.save(rv02);

//		Dao.delete(3);

	}

}
