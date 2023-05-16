package com.min.edu;

import java.util.ArrayList;
import java.util.List;

public class DTOCase {

	private List<DTO> dtoCase;
	
	public DTOCase() {
		 dtoCase = new ArrayList<DTO>();
	}
	
	public void inCase() {
		DTO d = new DTO();
		for (int i = 0; i < 5; i++) {
			d.setNum(i);
			
			dtoCase.add(d);
		}
		System.out.println(dtoCase);
	} // 
	
	
}






