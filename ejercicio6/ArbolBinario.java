package ejercicio6;

public class ArbolBinario {
	private Nodo raiz;
	public ArbolBinario(){
		this.raiz=null;
	}
	public Nodo getRaiz(){
		return this.raiz;
	}
	public boolean isEmpty(){
		return (raiz==null);
	}
	public void insert(Nodo n){
		if(this.raiz==null){
			this.raiz=n;
		}else{
			insert(this.raiz,n);
		}
	}
	private void insert(Nodo pos, Nodo n){
		if(pos.getInfo().equals(n.getInfo())){
			
		}
		if(pos.getInfo().compareTo(n.getInfo())>0){
			if(pos.getIzq()!=null){
				insert(pos.getIzq(),n);
			}else{
				pos.setIzq(n);
			}
		}else if(pos.getInfo().compareTo(n.getInfo())<0){
			if(pos.getDer()!=null){
				insert(pos.getDer(),n);
			}else{
				pos.setDer(n);
			}
		}
	}
	public void imprimirInOrder(Nodo n){
		if(n==null){
			return;
		}
		imprimirInOrder(n.getIzq());
		System.out.println(n.getInfo());
		imprimirInOrder(n.getDer());
	}
	public boolean hasElement(Integer n){
		if(this.raiz==null){
			return false;
		}
		
		
		return hasElement(this.raiz,n);
	}
	private boolean hasElement(Nodo pos,Integer n){
		if(pos!=null){
			if(pos.getInfo().equals(n)){
				return true;
			}else if(pos.getInfo().compareTo(n)<0){
				
				return hasElement(pos.getDer(),n);	
			}else if(pos.getInfo().compareTo(n)>0){
				
				return hasElement(pos.getIzq(),n);
				
			}
		}
		
		return false;
	}
}
