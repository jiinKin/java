package com.min.lotto;

public class LottoRow {
	
	private LottoOne[] obj;
	
	public LottoRow() {
		obj = new LottoOne[6];
	}
	

	public LottoOne[] getObj() {
		return obj;
	}


	public void lotto() { // array크기
		
		int idx = 0;
		while (true) { // 최종적으로 완성된  array
			LottoOne one = new LottoOne();
			
			if(!isCheck(one)) {
				obj[idx++] = one;
			}
			
			if(idx == obj.length) { // 전체 array 채워 졌다
				break;
			}
		}
	}
	
	private boolean isCheck(LottoOne one) {
		boolean isc = false;
		for (int i = 0; i < obj.length; i++) {
			if(obj[i]!=null &&obj[i].equals(one)) { //중복
				isc = true;
				break;
			}
		}
		return isc;
	}
	
}





