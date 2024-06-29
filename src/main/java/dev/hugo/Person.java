package dev.hugo;

public class Person {
    
    private String name;    
    private String lastName;
    private String idNumber;
    private int birthYear;
    private String birthCountry;
    private String gender;




public Person(String name, String lastName, String idNumber, int birthYear, String birthCountry, String gender) {
    this.name = name;
    this.lastName = lastName;
    this.idNumber = idNumber;
    this.birthYear = birthYear;
    this.birthCountry = birthCountry;
    this.gender = gender;
}   


public String getName() {
    return name;
}

public String getLastName() {
    return lastName;
}

public String getIdNumber() {
    return idNumber;
}

public int getBirthYear() {
    return birthYear;
} 
public void print() {
    System.out.println(this.toString());
}
public String getBirthCountry() {
    return birthCountry;
}
public String getGender() {
    return gender;
}

@Override
public String toString() {
    return "Person [name=" + name 
    + ",lastName=" + lastName
    + ",idNumber= " + idNumber
    + ",birthYear= " + birthYear 
    +",birthCountry=" + birthCountry
    +",gender=" + gender
    + "]";
}
}






