package lang.math;

import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {

		Random random = new Random();
		// Random random = new Random(1);  //seed가 같으면 Random 결과가 같다.

		int randomInt = random.nextInt();
		System.out.println("randomInt: " + randomInt);

		double randomDouble = random.nextDouble(); // 0.0d ~ 1.0d
		System.out.println("randomDouble: " + randomDouble);

		boolean randBoolean = random.nextBoolean();
		System.out.println("randBoolean: " + randBoolean);

		//범위조

		int randomRange1 = random.nextInt(10);// 0 ~ 9 까지 출력
		System.out.println("0 ~ 9 : "+ randomRange1);

		int randomRange2 = random.nextInt(10)+1;// 0 ~ 10 까지 출력
		System.out.println("1 ~ 10 : "+ randomRange2);

	}
}
