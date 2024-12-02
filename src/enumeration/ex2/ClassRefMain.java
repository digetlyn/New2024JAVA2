package enumeration.ex2;

import enumeration.ex1.StringGrade;

public class ClassRefMain {

	public static void main(String[] args) {
		System.out.println("class BASIC : " + StringGrade.BASIC.getClass());
		System.out.println("class GOLD : " + StringGrade.GOLD.getClass());
		System.out.println("class DIAMOND : " + StringGrade.DIAMOND.getClass());

		System.out.println("class Ref BASIC : " + ClassGrade.BASIC);
		System.out.println("class Ref GOLD : " + ClassGrade.GOLD);
		System.out.println("class Ref DIAMOND : " + ClassGrade.DIAMOND);
	}
}
