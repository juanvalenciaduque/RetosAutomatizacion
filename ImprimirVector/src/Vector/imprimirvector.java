package Vector;

public class imprimirvector {
	static int i = 0;
	static inicializar j = new inicializar();

	public static void main(String[] args) {
		if (i == 0) {
			i = 1;
			j.inicializarvector();
		} else {
			for (int k = 0; k < args.length; k++) {
				System.out.print("  " + args[k]);
			}
		}
	}
}
