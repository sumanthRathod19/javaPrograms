
// immutable means are whose state doesnt change after
//it has been intialize

// and immutable class is good for caching purpose becoz you dont
//need to worry about the value changes

//it is thread safety in mutli threaded enviornment

//jdk lot of immutable classes such as
//string  wrapper class  java.lang.StackraceElement  
//Collections.singletonMap()

package Immutable;

public final class Employee {
private final String name;
private final int id;
private final Address address;
public String getName() {
	return name;
}
public int getId() {
	return id;
}
public Address getAddress() throws Exception {
	return new Address(address.getId(), address.getName());
}
public Employee(String name, int id, Address address) {
	super();
	this.name = name;
	this.id = id;
	this.address =new Address(address.getId(), address.getName());
}
@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", address=" + address + "]";
}





}
