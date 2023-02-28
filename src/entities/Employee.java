package entities;

import java.util.Objects;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private int id;

    public Employee() {
        setFirstName("plony");
        setLastName("almony");
        setId(0);
    }
    public Employee(String firstName, String lastName, int id) {
        setFirstName(firstName);
        setLastName(lastName);
        setId(id);
    }

    public abstract float earnings();

    @Override
    public String toString() {
        return "entities.Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, id);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
