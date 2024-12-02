 package enumeration.ex0;

public class StringGradeEx0_2 {
	public static void main(String[] args) {

		int	price = 10000;

		DiscountService discountService = new DiscountService();


		//존재하지 않는 등급
		int vip = discountService.discount("VIP", price);
		System.out.println("VIP 할인 금액 : " + vip);

		//오타
		int basicc = discountService.discount("BASICC", price);
		System.out.println("BASICC 할인 금액 : " + basicc);


		//소문자 입력
		int gole = discountService.discount("gole", price);
		System.out.println("gole 할인 금액 : " + gole);

	}
}
