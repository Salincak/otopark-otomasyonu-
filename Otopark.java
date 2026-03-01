package ispark;
import java.util.Scanner;
public class Otopark {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	final int otomobilucret = 200, kamyonucret = 500, otobusucret = 800;
	final double otomobilkarorani = 0.25, kamyonkarorani = 0.30, otobuskarorani = 0.35;
	
	int toplamotomobil = 0, toplamkamyon = 0, toplamotobus = 0;
	int toplamgelir = 0, toplamkar = 0;
	int cirootomobil = 0, cirokamyon = 0, cirootobus = 0;
	int karotomobil = 0, karkamyon = 0, karotobus = 0;
	
	while (true) {
		System.out.print("Lütfen araç türünü giriniz (O, K, B, Çıkış için C): ");
		String aracturu = scanner.next().toUpperCase();
		if (aracturu.equals("C")) {
			break;
		}
	switch (aracturu) {
	case "O":
		toplamotomobil++;
		cirootomobil += otomobilucret;
		karotomobil += otomobilucret * otomobilkarorani;
		break;
	case "K":
		toplamkamyon++;
		cirokamyon += kamyonucret;
		karkamyon += kamyonucret * kamyonkarorani;
		break;
	case "B":
		toplamotobus++;
		cirootobus += otobusucret;
		karotobus += otobusucret * otobuskarorani;
		break;
		default:
			System.out.println("Geçersiz araç türü. Lütfen O,K,B veya C giriniz.");
 }
}
// genel toplamlar
	toplamgelir = cirootomobil + cirokamyon +cirootobus;
	toplamkar = karotomobil + karkamyon + karotobus;
	int toplamarac =toplamotomobil + toplamkamyon + toplamotobus;
	
	// yüzdelikler
	double otomobilciroyuzdesi = toplamgelir == 0 ? 0 : (cirootomobil * 100.0) / toplamgelir;
	double kamyonciroyuzdesi = toplamgelir == 0 ? 0 : (cirokamyon * 100.0) / toplamgelir;
	double otobusciroyuzdesi = toplamgelir == 0 ? 0 : (cirootobus * 100.0) / toplamgelir;
	
	double otomobilkaryuzdesi = toplamkar == 0 ? 0 : (karotomobil * 100.0) / toplamkar;
	double kamyonkaryuzdesi = toplamkar == 0 ? 0 : (karkamyon * 100.0) / toplamkar;
	double otobuskaryuzdesi = toplamkar == 0 ? 0 : (karotobus * 100.0) / toplamkar;
	
	// Sonuç
	System.out.println("\n--- Otopark Raporu ---");
	System.out.println("Toplam Otomobil Sayısı: " + toplamotomobil);
	System.out.println("Toplam Kamyon Sayısı: " + toplamkamyon);
	System.out.println("Toplam Otobus Sayısı: " + toplamotobus);
	System.out.println("Toplam Araç Sayısı: " + toplamarac);
	System.out.println("Toplam Gelir: " + toplamgelir + "TL ");
	System.out.println("Toplam Kar: " + toplamkar + "TL ");
	
	System.out.println("Otomobil Cirosu :" + cirootomobil + "TL " + String.format("%.2f", otomobilciroyuzdesi) + "%)");
	System.out.println("Kamyon Cirosu :" + cirokamyon + "TL " + String.format("%.2f", kamyonciroyuzdesi) + "%)");
	System.out.println("Otobus Cirosu :" + cirootomobil + "TL " + String.format("%.2f", otobusciroyuzdesi) + "%)");
	
	System.out.println("Otomobil Karı :" + karotomobil + "TL " + String.format("%.2f", otomobilkaryuzdesi) + "%)");
	System.out.println("Kamyon Karı :" + karkamyon + "TL " + String.format("%.2f", kamyonkaryuzdesi) + "%)");
	System.out.println("Otobus Karı :" + karotobus + "TL " + String.format("%.2f", otobuskaryuzdesi) + "%)");
	
}
}
