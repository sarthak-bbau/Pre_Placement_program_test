class Person {
    private String name;
    private int age;
    private String address;

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

public class Code3 {
    public static void main(String[] args) {
        Person person = new Person();

        // Set values using setter methods
        person.setName("Sarthak");
        person.setAge(25);
        person.setAddress("City");

        // Display values using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
    }
}

