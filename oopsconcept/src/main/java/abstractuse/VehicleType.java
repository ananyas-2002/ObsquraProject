package abstractuse;

public class VehicleType implements Vehicle{
	
	public void vehicletype() {
		System.out.println("Inside Vehicle type child class type of vehicle is Car");
	}

	public static void main(String[] args) {
		
		VehicleType vt=new VehicleType();
		vt.vehicledetails();
		vt.vehicletype();
	}

	@Override
	public void vehicledetails() {
		System.out.println("Vehicle parent class Vehicle details method");
		
	}

}
