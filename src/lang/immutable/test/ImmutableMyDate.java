package lang.immutable.test;

public class ImmutableMyDate {

	private final int year;
	private final int month;
	private final int day;


	//생성자
	public ImmutableMyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public ImmutableMyDate withYear(int Newyear) {
		return new ImmutableMyDate(Newyear, month, day);
	}

	public ImmutableMyDate withMonth(int Newmonth) {
		return new ImmutableMyDate(year,Newmonth,day);
	}

	public ImmutableMyDate withDay(int Newday) {
		return new ImmutableMyDate(year, month, Newday);
	}

	@Override
	public String toString() {
		return year + "-" + month + "-" + day;
	}
}
