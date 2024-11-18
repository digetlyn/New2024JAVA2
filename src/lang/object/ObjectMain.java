package lang.object;

public class ObjectMain {

	public static void main(String[] args) {
		Child child = new Child();
		child.childMethod();
		child.parentMethod();


		//toString() 메소드는 Object 클래스에 정의되어 있다.
		String string = child.toString();
		System.out.println(string);
	}
}
