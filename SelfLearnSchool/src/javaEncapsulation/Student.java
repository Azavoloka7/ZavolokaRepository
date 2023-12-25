package javaEncapsulation;

import java.util.Objects;

// En Capsul ation

public class Student implements Cloneable
{
	private String name;
	private int age;
	private String address;

	public Student(String name, int age, String address)
	{
		this.setName(name);
		this.setAge(age);
		this.setAddress(address);

	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString () {
		return ("\n Student's name: "+this.getName()+"\n age: "+this.getAge()+" \n address: "+this.getAddress());
	}
	@Override
	public int hashCode() 
	{
		return Objects.hash(name, age, address);
	}	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Student student = (Student) obj;
		return age == student.age &&
				Objects.equals(name, student.name) &&
				Objects.equals(address, student.address);
	}
	@Override
    public Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            // This should never happen, as Student implements Cloneable
            throw new InternalError(e);
        }
    }
}
