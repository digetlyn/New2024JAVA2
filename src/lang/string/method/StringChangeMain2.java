package lang.string.method;

public class StringChangeMain2 {

	public static void main(String[] args) {
		
		String strWithSpace = "           Java Programming    ";

		System.out.println("소문자로 변환: " + strWithSpace.toLowerCase());
		//이렇게되면 strWithSpace = "           Java Programming    ";   => "           java programming    "로 변경된다.

		System.out.println("소문자로 변환: " + strWithSpace.toUpperCase());
		//이렇게 되면 strWithSpace = "           Java Programming    ";   => "           JAVA PROGRAMMING    "로 변경된다.

		System.out.println("공백 제거(trim): '" + strWithSpace.trim() + "'");
		//이렇게 되면 strWithSpace = "           Java Programming    ";   => 'Java Programming' 로 출력된다..

		System.out.println("공백 제거(strip): '" + strWithSpace.strip() + "'");
		//이렇게 되면 strWithSpace = "           Java Programming    ";   => 'Java Programming' 로 출력된다.

		System.out.println("앞 공백 제거(strip): '" + strWithSpace.stripLeading() + "'");
		//이렇게 되면 strWithSpace = "           Java Programming    ";   => 'Java Programming    ' 로 출력된다.


		System.out.println("뒤 공백 제거(strip): '" + strWithSpace.stripTrailing() + "'");
		//이렇게 되면 strWithSpace = "           Java Programming    ";   => '           Java Programming' 로 출력된다.





	}
}
