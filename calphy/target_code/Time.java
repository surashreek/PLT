public class Time extends PhysicsScalarType {

	public Time(double value){
		this.value = value;
		this.units = "s";
	}
	
	public Time(double value, String units){
		switch(units){
			
			case "_ns": this.value = (double) (value * Math.pow(10, -9));
			break;			
			
			case "_um": this.value = (double) (value * Math.pow(10, -6));
			break;			
			
			case "_ms": this.value = (double) (value * Math.pow(10, -3));
			break;			
			
			case "_min": this.value = (double) (value * 60);
			break;

			case "_hr": this.value = (double) (value * 3600);
			break;
	
			case "_s": this.value = value;
			break;

			default: System.out.println("Error. Invalid unit. Exiting."); System.exit(0);	
		}
		this.units = "s";
	}
	
	public Time(Time t) {
		this.value = t.value;
		this.units = t.units;
	}

}
