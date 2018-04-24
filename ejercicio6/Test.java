package ejercicio6;


public class Test {
	public static void main(String[] args){
		ArbolBinario a1=new ArbolBinario();
		a1.insert(new Nodo(90));
		a1.insert(new Nodo(10));
		a1.insert(new Nodo(1));
		a1.insert(new Nodo(3));
		a1.insert(new Nodo(110));
		a1.insert(new Nodo(94));
		a1.insert(new Nodo(150));
		a1.imprimirInOrder(a1.getRaiz());
		System.out.println(a1.hasElement(4));
		//La complejidad del insert y el hasElement del ArbolBinario depende de la altura 
		//del mismo, su complejidad seria O(h) donde h es la altura del arbol 
		
		
	}
	
}
