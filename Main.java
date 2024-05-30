package com.mt.arel.temelstringalistirma;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		PangramKontrol pk = new PangramKontrol();
		boolean pangram = pk.kontrolEt("jübile, hepsi eğitim gönüllüleri vakfı içindi, coşuyoruz.");
		System.out.println(pangram);
		pangram = pk.kontrolEt("bahçede acı jambonlu zayıf tavuk göğsü pişir.");
		System.out.println(pangram);
		pangram = pk.kontrolEt("bu pangram değil.");
		System.out.println(pangram);
	}

	    
	


    
    
    
    
    
}


