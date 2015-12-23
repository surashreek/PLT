public class Energy extends PhysicsScalarType {

	public Energy(double value){
		this.value = value;
		this.units = "J";
	}
	
	public Energy(double value, String units){
		switch(units){
			case "_nJ": this.value = (double) (value * Math.pow(10, -9));
			break;
			
			case "_uJ": this.value = (double) (value * Math.pow(10, -6));
			break;			
			
			case "_mJ": this.value = (double) (value * Math.pow(10, -3));
			break;					
			
			case "_J": this.value = value;
			break;			
			
			case "_kJ": this.value = (double) (value * Math.pow(10, 3));
			break;			
			
			case "_MJ": this.value = (double) (value * Math.pow(10, 6));
			break;
			
			case "_GJ": this.value = (double) (value * Math.pow(10, 9));
			break;

			default: System.out.println("Error. Invalid unit. Exiting."); System.exit(0);
		}
		this.units = "J";
	}
	
	public Energy(Energy e) {
		this.value = e.value;
		this.units = e.units;
	}

}
