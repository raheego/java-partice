package day14.Io.file.random.quiz;

class User {
	protected String name;
	protected double weight;
	protected double height;
	
	
	public User(){
		
	}


	public User(String name, double weight, double height) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", weight=" + weight + ", height=" + height + "]";
	}



	
	
}
