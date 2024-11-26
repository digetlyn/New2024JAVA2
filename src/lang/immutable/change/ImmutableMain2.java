package lang.immutable.change;

public class ImmutableMain2 {

	public static void main(String[] args) {
		ImmutableObj immutableObj1 = new ImmutableObj(10);
		immutableObj1.add(20);

		//계산이후에도 기존값과 이후값이 확인 가능하다.
		System.out.println("immutableObj1 = " + immutableObj1.getValue());


	}
}
