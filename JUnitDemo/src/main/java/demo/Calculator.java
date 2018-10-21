package demo;

import exception.InvalidNumberException;
import exception.NegativeNumberException;
import exception.ZeroException;

public class Calculator {
	public int addDigits(int number) {
		if (number == 0)
			throw new ZeroException();
		if (number < 0)
			throw new NegativeNumberException();
		if (number < 100 || number > 999)
			throw new InvalidNumberException();
		int total = 0;
		total = number % 10;
		number /= 10;
		total += (number % 10);
		number /= 10;
		total += number;
		return total;
	}
}
