package Aufgabe4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.validation.SchemaFactory;

import org.jdom2.Document;
import org.jdom2.contrib.schema.Schema;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import Aufgabe4.Rezeptsammlung.Rezept;
import Aufgabe4.Rezeptsammlung.Rezept.Kommentare;
import Aufgabe4.Rezeptsammlung.Rezept.Zutaten;

public class Main {
  
	public static void main(String[] args) throws JAXBException, IOException {


		//Datei einlesen
		JAXBContext context = JAXBContext.newInstance(ObjectFactory.class);
		Unmarshaller um = context.createUnmarshaller();
		Scanner in = new Scanner(System.in);

		Rezeptsammlung rs = (Rezeptsammlung) um.unmarshal(new File("src/Aufgabe3c_data.xml"));

		//Funktion Menü (siehe weiter unten)
		menue(in, rs, context);
	}
	
	
	
		//Funktion Menü
		public static void menue(Scanner in, Rezeptsammlung rs, JAXBContext context) throws JAXBException {
			int anz_rezepte = rs.getRezept().size();
			System.out.println("Bitte waehlen Sie einen Menüpunkt:");
			System.out.println("Rezept auswaehlen:\t1");
			System.out.println("Kommentar verfassen:\t2");
			System.out.println("Schließen:\t3");
			System.out.printf("Geben Sie die Menünummer ein: ");
			int menuwahl = in.nextInt();
			
			//Menüpunkt 3: Programm versassen
			if (menuwahl == 3)
			System.out.println("Auf Wiedersehen!");
			//Rezeptabfrage
			else {
				System.out.printf("Bitte Rezept waehlen: ");
			int rezeptwahl = in.nextInt();

			if (rezeptwahl > anz_rezepte || rezeptwahl < 1) {
				System.out.println("Es existiert kein Rezept zu der von Ihnen gewählten Nummmer!\n");
				menue(in, rs, context);
				} 
			else {
				Rezept r = rs.getRezept().get(0);
				for(int i = 0; i < anz_rezepte; i++) {
					if ((i+1) == rezeptwahl) {
						r = rs.getRezept().get(i);

						//Funktionsaufruf nach gewählter Nummer
						switch (menuwahl) {
						case 1: ausgabe(r, in, rs, context); break;
						case 2: kommentar(r, in, rs, context); break;
						default: System.out.printf("Bitte erneut eingeben: "); menue(in, rs, context); break;
						}
					}
					System.out.println("\n");					
				}
			}
		}
	}
		//Funktion ausgab(): Rezept ausgeben
		public static void ausgabe(Rezept r, Scanner in, Rezeptsammlung rs, JAXBContext context) throws JAXBException {
			
			//Titel ausgeben
			System.out.println(r.getTitel());
			
			//Zutaten ausgeben
			System.out.println("Zutaten:\n");
			for (Zutaten zutat : r.getZutaten()) {
				System.out.println(zutat.getMenge() + " " + zutat.getEinheit() + "\t" + zutat.getZutat());
		   	}
			
			//Zubereitung und co ausgeben
	    	System.out.println("\nZubereitung:\n" + r.getZubereitung().beschreibung);
		   	System.out.println("Zubereitungszeit:\t" + r.getZubereitung().getArbeitszeit() + " Minuten");
		   	System.out.println("Schwierigkeitsgrad:\t" + r.getZubereitung().level);


		   	//Kommentare ausgeben
		   	System.out.println("\nKommentare: ");
		   	List<Kommentare> kommentare = r.getKommentare();
		   	if (kommentare.isEmpty())
		   		System.out.println("Zur Zeit gibt es keine Kommentare zu diesem Rezept");
		   	else {
		   		for (Kommentare k : r.kommentare) {
		   			System.out.println("Autor: " + k.autor);
		   			System.out.println(k.text);
		   		}
		   	}
		}
		
		
		//Kommentar hinzufügen
		public static void kommentar(Rezept r, Scanner in, Rezeptsammlung rs, JAXBContext context) throws JAXBException {
			if (r.kommentare == null) {
				List<Kommentar> kommentare = new ArrayList<Kommentar>();
				r.kommentare = kommentare;
			}
			//Kommentar einlesen
			System.out.println("Name: ");
			String autor = in.next();
			in.nextLine();
			System.out.println("Ihr Kommentar: ");
			String text = in.nextLine();

			//Daten einfuegen
			Kommentar comment = new Kommentar();
			comment.setAutor(autor);
			comment.setNachricht(text);

			r.kommentare.add(comment);

			//marshalling, Speicherung in XML
		    Marshaller ma = context.createMarshaller();
		    ma.marshal(rs, new File("src/Aufgabe3c_data.xml"));	
		
		}
}
