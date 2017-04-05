package ejercicio;

public class MainOrdenamiento {
	public static void main(String[] args){
		int cantElementos=20;
		int[] arre=new int[cantElementos];
		for (int i = 0; i < arre.length; i++) {
			arre[i]=((int)(Math.random()*999));
		}
		int[] arre2=arre.clone();
		OrdenamientoPorQuickSort algoritmo1=new OrdenamientoPorQuickSort();
		OrdenamientoPorSeleccion algoritmo2=new OrdenamientoPorSeleccion();
		
		long testIni=System.nanoTime();
		algoritmo1.ordenar(arre,0,arre.length-1);
		long test1Fin=System.nanoTime()-testIni;
		
		testIni=System.nanoTime();
		algoritmo2.ordenar(arre2);
		long test2Fin=System.nanoTime()-testIni;
		
		System.out.println("El tiempo transcurrido en ordenar el arreglo usando el algoritmo QuickSort: "+test1Fin);
		System.out.println();
		System.out.println("El tiempo transcurrido en ordenar el arreglo usando el algoritmo de ordenamiento por Seleccion: "+test2Fin);
		//Despues de hacer las pruebas con diferente cantidad de elementos, se puede notar que el algoritmo mas eficiente a la hora de
		//ordenar una gran cantidad de elementos es el QuickSort, mientras que para una cantidad de elementos menor a 20 , el algoritmo
		//de ordenamiento por seleccion es mas rapido. Tambien note que a medida que agregamos elementos de a cientos o miles, el tiempo
		//que tarda el algoritmo de ordenamiento por seleccion crece mas rapido que el tiempo que tarda el algoritmo Quicksort, con lo 
		//que se nota la diferencia entre la eficacia de ambos. 
	}
}
