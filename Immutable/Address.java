package Immutable;

public  final class Address {

	private final int id;
	private final String name;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Address(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", name=" + name + "]";
	}
	
}
