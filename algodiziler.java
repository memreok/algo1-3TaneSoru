package algo1dersdiziler;

import java.util.Scanner;

public class algodiziler {

	public static void main(String[] args) {

		// girilen sayı kadar içi boş kare

		int size = 5;
		for (int satir = 1; satir <= size; satir++) {
			for (int sutun = 1; sutun <= size; sutun++) {
				if (satir == 1 || satir == size || sutun == 1 || sutun == size) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	

	/* girilen saayı kadar pascal */

	size = 5 ;
	for(int satir = 0;satir<size;satir++)
	{
		int toplam = 1;
		for (int sutun = 0; sutun <= satir; sutun++) {
			System.out.print(toplam + " ");
			toplam = toplam * (satir - sutun) / (sutun + 1);

		}
		System.out.println();
	}

//	verilen diziden
//	ikinci en
//	büyük sayıyı
//	bulan

	Scanner scanner = new Scanner(System.in);System.out.print("Dizinin uzunluğunu giriniz: ");
	int dizinin_uzunlugu = scanner.nextInt();
	int enBuyuk1 = Integer.MIN_VALUE;
	int enBuyuk2 = Integer.MAX_VALUE;
	int sayilar[] = new int[dizinin_uzunlugu];

	for(int i = 0;i<sayilar.length;i++)
	{
		System.out.print("Dizinin " + i + " ninci indeks değerini giriniz: ");
		sayilar[i] = scanner.nextInt();
	}

	for(int index = 0;index<sayilar.length;index++)
	{

		if (sayilar[index] > enBuyuk1) {
			enBuyuk2 = enBuyuk1;
			enBuyuk1 = sayilar[index];
		} else if (sayilar[index] > enBuyuk2 && sayilar[index] != enBuyuk1) {
			enBuyuk2 = sayilar[index];
		}
	}
	System.out.println(enBuyuk1);System.out.println(enBuyuk2);

}
}