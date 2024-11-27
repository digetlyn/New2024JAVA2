package lang.string.method;

public class StringSplitJoinMain {

	public static void main(String[] args) {

		String str = "Apple,Banana,Orange";

		//split() 메소드는
		String[] splitStr = str.split(",");//이렇게 되면 문자열을 ","로 구분하여 배열로 만들어 준다.
		for (String s : splitStr) {
			System.out.println(s);
		}

		//join() 메소드는
		String joinedStr= String.join("-", "A", "B", "C");//이렇게 되면 문자열을 "-"로 구분하여 합쳐준다.
		System.out.println("연결된 문자열 = " + joinedStr);


		//문자열 배열 연결
		String result = String.join("-", splitStr);
		System.out.println("result = " + result);

	}
}
