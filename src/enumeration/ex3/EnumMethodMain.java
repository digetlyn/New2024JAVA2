package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

	public static void main(String[] args) {
		//모든 Enum을 반환.
		Grade[] values = Grade.values();
		System.out.println("values = " + Arrays.toString(values));
		for(Grade value : values){
			System.out.println("name= " + value.name() + ", ordinal= " + value.ordinal());
		}

		//String -> Enum으로 변환.  IllegalArgumentException 발생 가능.
		String input = "GOLD";
		Grade gold = Grade.valueOf(input);
		System.out.println("gold = " + gold);  //toString() 오버라이 가
	}
}
