package lang.object;

//부모가 없으면 묵시적으로 Object 클래스를 상속 받는다.
public class Parent {

	public void parentMethod(){
		System.out.println("Parent.parentMethod");
	}
}


/*
묵시적 : 개발자가 코드에 직접 기술하지 않아도 시스템 또는 컴파일러에 의해 자동으로 수행되는것을 의미
명시적 : 개발자가 코드에 직접 기술해서 작동하는 것을 의미

클래스에 상속 받을 부모 클래스가 없으면 묵시적으로 Object 클래스를 상속 받는다.
쉽게 이야기해서 자바가 extends Object를 자동으로 붙여준다고 생각하면 된다.
따라서 extends Object를 생략하는 것을 권장한다.

*/