package ejercicio6;

public class Nodo {
	private Integer info;
	private Nodo izq;
	private Nodo der;
	public Nodo(Integer a){
		this.info=a;
		this.der=null;
		this.izq=null;
	}
	public boolean hasElement(Integer n){
		if(this.info.equals(n)){
			return true;
		}if(this.info.compareTo(n)<0){
			if(this.izq!=null){
				this.izq.hasElement(n);	
			}else{
				return false;
			}
		}if(this.info.compareTo(n)>0){
			if(this.der!=null){
				this.der.hasElement(n);	
			}else{
				return false;
			}
		}
		return false;
	}
	public Integer getInfo(){
		return this.info;
	}
	public void insert(Nodo n){
		
		if(this.info.equals(n.getInfo())){
			
		}
		if(this.info.compareTo(n.getInfo())>0){
			if(this.izq!=null){
				this.izq.insert(n);
			}else{
				this.izq=new Nodo(n.getInfo());
			}
		}else if(this.info.compareTo(n.getInfo())<0){
			if(this.der!=null){
				this.der.insert(n);
			}else{
				this.der=new Nodo(n.getInfo());
			}
		}
	}
	
	public Nodo getIzq(){
		return this.izq;
	}
	public void setIzq(Nodo n){
		this.izq=n;
	}
	public void setDer(Nodo n){
		this.der=n;
	}
	public Nodo getDer(){
		return this.der;
	}
}
