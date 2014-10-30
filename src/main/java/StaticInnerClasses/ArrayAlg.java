package StaticInnerClasses;

public class ArrayAlg {

	/*
	 * A pair of Floating-point numbers
	 */

	public static class Pair {

		private double first;
		private double second;

		/**
		 * Constructs the pair from two floating-point numbers
		 * 
		 * @param f
		 *            is the first number
		 * @param s
		 *            is the second number
		 */
		public Pair(double f, double s) {

			first = f;
			second = s;

		}

		public double getFirst() {
			return first;
		}

		public double getSecond() {
			return second;
		}

	}

	public static Pair minmax(double[] values) {
		double max = Double.MAX_VALUE;
		double min = Double.MIN_VALUE;

		for (double v : values) {

			if (min > v)
				min = v;
			if (max < v)
				max = v;

		}
		return new Pair(min, max);

	}

}
