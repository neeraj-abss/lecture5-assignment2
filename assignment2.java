
abstract class building{

abstract void rowhouse(float interest);
abstract void tower(float interest);
}


class TypeBuilding extends building{

	void rowhouse(float interest){
System.out.println("Calling rowhouse");
	}
	void tower(float interest){
System.out.println("Calling tower");
	}

}

class assignment2{
	public static void main(String[] args){
		TypeBuilding type= new TypeBuilding();
		type.rowhouse(2);
		type.tower(7);
	}
}