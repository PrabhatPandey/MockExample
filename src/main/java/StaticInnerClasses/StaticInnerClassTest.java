package StaticInnerClasses;

public class StaticInnerClassTest {

	public static void main(String[] args) {

		double[] d = new double[20];
		for (int i = 0; i < d.length; i++) {
			d[i] = 100 * Math.random();
			ArrayAlg.Pair p = ArrayAlg.minmax(d);
			System.out.print("mn=" + p.getFirst());
			System.out.print("max=" + p.getSecond());
		}
	}
}
