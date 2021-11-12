import java.util.ArrayList;

public class Garage {
	//private ArrayList<Car>();
	private ArrayList<Vehicule> listV;
	private int id;
	private static int nbInstance = 0;
	
	public Garage() {
		this.listV = new ArrayList<Vehicule>();
		nbInstance += 1;
		this.id = nbInstance;
	}
	
	public void addCar(Vehicule v){
		if (v == null)
	        throw new NullPointerException();
	    this.listV.add(v);
	}
	
	public int getId() {
		return id;
	}
	
	public String toString() {
		 StringBuilder builder = new StringBuilder("Les véhicules du garages");
		 for(int i =0; i < this.listV.size(); i++) {
			 builder.append(this.listV.get(i));
		 }	
	     return builder.toString();
	}
	
	public int valueGarage() {
		int valueGarage = 0;
		 for(int i =0; i < this.listV.size(); i++) {
			 valueGarage += this.listV.get(i).getValue();
		 }
		return valueGarage;
	}
	
	//Ici, s’il n’y a pas de voiture de la marque b, la méthode return null
	public Vehicule firstCarByBrand(String b) {
			for(int i =0; i < this.listV.size(); i++) {
				if (this.listV.get(i).getBrand() == b) {
					return this.listV.get(i);
				}
			}	
		return null;
	}
	
	public void removeVehicule(Vehicule v) {
		for(int i =0; i < this.listV.size(); i++) {
			if(this.listV.get(i).equals(v)) {
				this.listV.remove(v);
			}
		}
	}
	
	public boolean equals(ArrayList<Vehicule> l) {
		return this.listV.equals(l);
	}
	
	
	public void protectionism(String brand) {
		for(int i =0; i < this.listV.size(); i++) {
			if(this.listV.get(i).getBrand() == brand) {
				this.listV.remove(this.listV.get(i));
			}
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
