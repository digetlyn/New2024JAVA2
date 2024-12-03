package enumeration.ref2;

import enumeration.ref1.ClassGrade;

public class DiscountService {


	public int discount (ClassGrade classGrade, int price) {
		int discountPercent = classGrade.getDiscountPercent();
		return  price * discountPercent / 100;

	}
}
