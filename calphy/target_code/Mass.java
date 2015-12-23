public class Mass extends PhysicsScalarType {

	public Mass(double value){
		this.value = value;
		this.units = "kg";
	}
	
	public Mass(double value, String units){
		switch(units){
		
			case "_ng": this.value = (double) (value * Math.pow(10, -12));
			break;
			
			case "_ug": this.value = (double) (value * Math.pow(10, -9));
			break;			
			
			case "_mg": this.value = (double) (value * Math.pow(10, -6));
			break;			
			
			case "_g": this.value = (double) (value * Math.pow(10, -3));
			break;			
			
			case "_kg": this.value = value;
			break;		

			default: System.out.println("Error. Invalid unit. Exiting."); System.exit(0);	
								
		}
		this.units = "kg";
	}

	public Mass(Mass m) {
		this.value = m.value;
		this.units = m.units;
	}	

	Mass add(Mass rhs) {
		return (new Mass(this.value + rhs.value));
	}

}
