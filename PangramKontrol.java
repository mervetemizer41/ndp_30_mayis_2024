package com.mt.arel.temelstringalistirma;

import java.util.*;


public class PangramKontrol{
   	
	public char[] alfabe = {'a','b','c','d','f','g','h','ı','i','j','k','l','m','n','o','ö','p','r','s','ş','t','u','ü','v','y','z'};
	
	public boolean kontrolEt(String cumle){
		boolean res = false;
		List<Character> lcAlfabe = new ArrayList<Character>();
		for(char c : alfabe){
			lcAlfabe.add(c);	
		}		
		char[] cumleDizi = cumle.toCharArray();
		StringBuilder sb = new StringBuilder(cumle);
		for(char c : cumleDizi){
			int yer = lcAlfabe.indexOf(c);
			if(yer > -1){
				lcAlfabe.remove(yer);
			}		
		}
		if(lcAlfabe.size() > 0){
			res = false;	
		}else{
			res = true;
		}
		return res;
	}
    
}

