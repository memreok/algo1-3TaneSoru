package algo1dersdiziler;

public class kumsaati {

	public static void main(String[] args) {
		
		int size = 13;
		int ortaKisim = (size/2) + 1;
		for(int satir = 1 ; satir <= ortaKisim ; satir++) {
			for(int sutun = 1 ; sutun <= size ; sutun++ ) {
				int satirSonu = size - satir;
				if (sutun == size || sutun == 1 || sutun <= satir || sutun > satirSonu || satir == ortaKisim) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}				
			System.out.println();	
		}
		
		
		
		
		
		
		for(int satir = (ortaKisim + 1) ; satir <= size ; satir++)
			while (satir <= size ) {
				for(int sutun = 1 ; sutun <= size ; sutun++ ) {
					int satirSonu = satir - ortaKisim;
					if (sutun == 1 ||  sutun == size || sutun < ortaKisim || satir <= sutun ) {
						System.out.print("* ");
					}else {
						System.out.print("  ");
					}
			}
			System.out.println();
			ortaKisim--;
			satir++;
			
		}

		
		
		
		
		
		
		
		
		
		
		
	}

}
