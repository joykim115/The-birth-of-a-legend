package 스태틱;

public class Bankuser {

	public static void main(String[] args) {
		bank c1 = new bank("청약저축", "김아무개", 500);
		bank c2 = new bank("내비상품", "김김아무개", 30);
		bank c3 = new bank("자유적금", "박아무개", 100);
		
		System.out.println("상품명  "+ "예금주  "+ "예금액  ");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(c2.custom+"통장에는"+c2.money+"만원이 있음");
		System.out.println(c3.custom+"통장에는"+c3.money+"만원이 있음");
		
		
//		int total = bank.total;
		System.out.println("내 머니 총합은 "+bank.total+"만원이에요");  // 계산된 값만 불러오기
		System.out.println("내 통장 총합은 "+bank.count+"개에요");
		
		
	}

}
