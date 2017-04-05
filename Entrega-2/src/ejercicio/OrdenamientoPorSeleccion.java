package ejercicio;

public class OrdenamientoPorSeleccion {
	public void ordenar(int[] arre){
		int i, j, menor, pos, tmp;
        for (i = 0; i < arre.length - 1; i++) {
              menor = arre[i]; 
              pos = i;
              for (j = i + 1; j < arre.length; j++){
                    if (arre[j] < menor) { 
                        menor = arre[j]; 
                        pos = j;
                    }
              }
              if (pos != i){
                  tmp = arre[i];
                  arre[i] = arre[pos];
                  arre[pos] = tmp;
              }
        }
	}
}
