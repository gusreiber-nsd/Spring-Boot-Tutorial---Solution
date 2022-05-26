package edu.bothellcs.myFirstSpring;

public class Person{

  private String name;
  
  public Person(String name){
    this.name = name;
  }

  public String tellMeLies(){
    return "my name is not " + this.name;
  }
  

  
}