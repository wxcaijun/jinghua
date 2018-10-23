package com.EurekaJdbc;

public class User {
	private Long id;
    private String name;
    private Integer age;	
    
      public Long getUserById() {
        return this.id;
      }

      public void setId(Long id) {
        this.id = id;
      }

      public String getname() {
        return this.name;
      }

      public void setUsername(String name) {
        this.name = name;
      }

      public String getName() {
        return this.name;
      }

      public void setName(String name) {
        this.name = name;
      }

      public Integer getAge() {
        return this.age;
      }

      public void setAge(Integer age) {
        this.age = age;
      }

}
