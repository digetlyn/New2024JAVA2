package lang.immutable.address;

public class ImmutableAddress {

	private final String value;   //String value는 서울, 부산 등 불변의 값을 가지고 있다.

	public ImmutableAddress(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}



	@Override
	public String toString() {
		return "Address{" +
			"value='" + value + '\'' +
			'}';
	}
}
