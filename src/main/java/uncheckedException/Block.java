package uncheckedException;

public abstract class Block {
	public abstract void body() throws Exception;
	public Thread toThread() {
		return new Thread() {
			public void run() {
				try {
					body();
				} catch (Throwable t) {
					Block.<RuntimeException> throwAs(t);
				}

			}
		};
	}
	@SuppressWarnings("unchecked")
	public static <T extends Throwable> void throwAs(Throwable e) throws T {
		throw (T) e;
	}

}
