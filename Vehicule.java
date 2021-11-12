
public class Vehicule {
	
	private String brand;
	private long value;
	
	
	public Vehicule(String b,long v) {
		this.brand=b;
		if(v<0)System.out.println("Pas de valeur négative");
		else this.value=v;
	}
	public Vehicule() {}
	
	public String getBrand() {
		return brand;
	}
	public long getValue() {
		return value;
	}
	
	public boolean equals(Vehicule v) {
		if(this.brand != v.brand || this.value != v.value ) return false;
		return true;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
