package com.workintech.inheritance.Company;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work(){
        setSalary(22000);
        System.out.println(getName()+" junior begins to work ");
    }

    public void work(double salary){
        setSalary(salary);
        System.out.println(getName()+" junior begins to work ");
    }
}
