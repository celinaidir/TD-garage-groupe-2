public class Car extends Vehicule{
	//private long value;
	private int vetuste;
	
	public Car(String b,long val,int vet){
			super(b,val);
			this.vetuste = vet;	
	}
	
	public Car(String b,long val){
		super(b,val);
	}
	
	public int getVetuste() {
		return vetuste;
	}

	public String toString(){
		String s;
		s = "La voiture a les caractéristiques suivantes: \n brand: "+super.getBrand() + "\n value : "+super.getValue();
		return s;
	}
	
	public boolean equals(Car c) {
		if(!super.equals(c) || this.vetuste != c.vetuste) return false;
		return true;
	}
	

	
	

	public static void main(String[] args){
		// TODO Auto-generated method stub
		//Question 1 exo 2 /*
	/*	Car a = new Car("Audi",10000);
		Car b = new Car("BMW",9000);
		Car c = new Car("BMW",9000);
		Car d = a;
		System.out.println(a==b); 
		System.out.println(b==c);
		System.out.println(a==d); 
		System.out.println(a.equals(b)); 
		System.out.println(b.equals(c)); 
		System.out.println(a.equals(d)); 
		
		// Question 2 exo 2
		ArrayList<Car> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		System.out.println(list.indexOf(a));
		System.out.println(list.indexOf(b));
		System.out.println(list.indexOf(c));
		System.out.println(b.equals(c)); */
	}

}
