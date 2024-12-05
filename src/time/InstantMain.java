package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {

	public static void main(String[] args) {
		//생성
		Instant now = Instant.now();//UTC 기준
		System.out.println("now = " + now);

		ZonedDateTime zdt = ZonedDateTime.now();
		Instant from = Instant.from(zdt);
		System.out.println("from = " + from);

		Instant epochStart = Instant.ofEpochSecond(0);
		System.out.println("epochSecond = " + epochStart);  //UTC 처음 시간에서 100초 후의 시간을 출력한다.


		//계산
		Instant later = epochStart.plusSeconds(3600);
		System.out.println("later = " + later);


		//조회
		long laterEpochSecond = later.getEpochSecond();
		System.out.println("laterEpochSecond = " + laterEpochSecond);
	}
}
