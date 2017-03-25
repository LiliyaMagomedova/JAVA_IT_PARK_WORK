public class RationalNumber {
	int numerator;
	int denominator;

	RationalNumber() {
		numerator = 1;
		denominator = 1;			
	}

	RationalNumber(int num, int denom) {
		numerator = num;
		denominator = denom;
	}

	double Normalize() {
		return double(numerator)/double(denominator);
	}

}