package pl.gobio.Student.student;

import java.time.LocalDate;

public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dataOfBirth;
    private Integer age;
    private String email;

    public Student(Long id, String firstName, String lastName,
                   LocalDate dataOfBirth, Integer age, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;

        this.dataOfBirth = dataOfBirth;
        this.age = age;
        this.email = email;
    }

    public Student(String firstName, String lastName,
                   LocalDate dataOfBirth, Integer age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.dataOfBirth = dataOfBirth;
        this.age = age;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDate getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(LocalDate dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "String{" + "id=" + id +
                ", firstname" + firstName + '\'' +
                ", lastname" + lastName + '\'' +
                ", data of birth" + dataOfBirth + '\'' +
                ", age" + age + '\'' +
                ", email" + email + '\'' +
                '}';
    }
}
