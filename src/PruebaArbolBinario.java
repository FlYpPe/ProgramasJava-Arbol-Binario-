
public class PruebaArbolBinario {

	public static void main(String[] args) {
		
		ArbolBinario ab =  new ArbolBinario();
		
		ab.agergarElemnto(7);
		ab.agergarElemnto(14);
		ab.agergarElemnto(3);
		ab.agergarElemnto(9);
		ab.agergarElemnto(37);
		ab.agergarElemnto(1);
		ab.agergarElemnto(100);
		ab.recorridoPreorden(ab.nodoRaiz);//R-I-D  7-3-1-14-9-37
		System.out.println();
		ab.recorridoEnorden(ab.nodoRaiz);//I-R-D  1-3-7-9-14-37
		System.out.println();
		ab.recorridoPostorden(ab.nodoRaiz); //I-D-R => 1-3-9-37-14-7
		
		System.out.println();
		System.out.println(ab.mostrarDatoMayor());
		System.out.println(ab.mostrarDatoMenor());
		
		
		System.out.println(ab.buscarDato(100));
		
		System.out.println(ab.eliminarNodo(14));
		ab.recorridoPreorden(ab.nodoRaiz);
	}

}
