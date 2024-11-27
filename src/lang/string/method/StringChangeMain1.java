package lang.string.method;

public class StringChangeMain1 {

	public static void main(String[] args) {

		String str = "Hello, Java! Welcome to Java";

		System.out.println("인덱스 7부터의 부분 문자열 : " + str.substring(7));
		//이렇게 되면 인덱스7부터 문자열은: "Java! Welcome to Java"가 된다.

		System.out.println("인덱스 7부터의 12까지 부분 문자열 : " + str.substring(7,12));
		//이렇게 되면 인덱스 7부터 ~ 12까지는 "Java!"가 된다.

		System.out.println("문자열 결합: " + str.concat("!!!"));
		//이렇게 되면 str = "Hello, Java! Welcome to Java";   => "Hello, Java! Welcome to Java!!!"로 변경된다.

		System.out.println("'Java'를 'World'로 변경: " + str.replace("Java", "World"));
		//이렇게 되면 str = "Hello, Java! Welcome to Java";   => "Hello, World! Welcome to World"로 변경된다.

		System.out.println("'첫번째 Java'를 'World'로 변경: " + str.replaceFirst("Java", "World"));
		//이렇게 되면 str = "Hello, Java! Welcome to Java";   => "Hello, World! Welcome to Java"로 변경된다.



	}
}
