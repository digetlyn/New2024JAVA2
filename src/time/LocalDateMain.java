package time;

import java.time.LocalDate;

public class LocalDateMain {

	public static void main(String[] args) {

		LocalDate nowDate = LocalDate.now();   //현재 날짜를 가져다 준다.
		LocalDate ofDate = LocalDate.of(2024, 12, 31);  // 지정날짜에서 정확한 날짜를 입력하지 않으면 오류가 발생한다.

		System.out.println("오늘 날짜는 : " + nowDate);
		System.out.println("지정날짜는 : " + ofDate);

/*
		//계산(불변)
		ofDate.plusDays(20);
		System.out.println("지정 날짜 + 20d 는 : " + ofDate);   // 아무런 변화가 없다.
*/
		//계산(불변)
		ofDate = ofDate.plusDays(20);
		System.out.println("지정 날짜 + 20d 는 : " + ofDate);   // 20일이 더 해진 정상적인 날짜가 출력된다.

	}
}
