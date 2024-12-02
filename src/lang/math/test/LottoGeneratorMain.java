package lang.math.test;

public class LottoGeneratorMain {

	public static void main(String[] args) {
		LottoGenerator generator = new LottoGenerator();
		int[] lottoNumbers = generator.generate();

		//생성된 로또번호 출력하기.
		System.out.print("로또번호 : ");
		for (int lottoNumber : lottoNumbers) {
			System.out.print(lottoNumber + " ");
		}


	}
}
