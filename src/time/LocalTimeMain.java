package time;

import java.time.LocalTime;

public class LocalTimeMain {

	public static void main(String[] args) {
		LocalTime nowTime = LocalTime.now();
		LocalTime ofTime = LocalTime.of(12, 40, 12);

		System.out.println("현재 시각은: " + nowTime);
		System.out.println("지정 시각은: " + ofTime);


		//계산(불변)
		LocalTime ofTimePlus = ofTime.plusSeconds(15);
		System.out.println("지정 시간+15s : " + ofTimePlus);

	}
}
