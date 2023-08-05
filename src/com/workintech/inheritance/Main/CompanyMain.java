package com.workintech.inheritance.Main;

import com.workintech.inheritance.Company.*;

import java.util.Arrays;

public class CompanyMain {
    public static void main(String[] args) {
        Employee asci=new Employee(7,"Murat");
        asci.work();

        JuniorDeveloper juniorDeveloper1=new JuniorDeveloper(2,"Baha");
        juniorDeveloper1.work();
        JuniorDeveloper juniorDeveloper2=new JuniorDeveloper(3,"Serkan");
        juniorDeveloper2.work();
        JuniorDeveloper[] juniors= new JuniorDeveloper[] {juniorDeveloper1,juniorDeveloper2};

        MidDeveloper midDeveloper1=new MidDeveloper(4,"Ahmet");
        midDeveloper1.work();
        MidDeveloper midDeveloper2=new MidDeveloper(5,"Mehmet");
        midDeveloper2.work();
        // MidDeveloper[] mids= new MidDeveloper[] {midDeveloper1,midDeveloper2};


        SeniorDeveloper seniorDeveloper=new SeniorDeveloper(6,"Ays");
        seniorDeveloper.work();
        //SeniorDeveloper seniorDeveloper2=new SeniorDeveloper(3,"Serkan");
        //SeniorDeveloper[] seniors= new SeniorDeveloper[] {seniorDeveloper1,seniorDeveloper2};




        HRManager hrManager = new HRManager(1, "Mert",
                new JuniorDeveloper[3], new MidDeveloper[2], new SeniorDeveloper[1]);
        hrManager.work();

        System.out.println("Senior Developer Salary " + seniorDeveloper.getSalary());
        System.out.println("HR Manager Salary: " + hrManager.getSalary());

        System.out.println("Juniors: " + Arrays.toString(hrManager.getJuniors()));
        System.out.println("Mids: " + Arrays.toString(hrManager.getMids()));
        System.out.println("Seniors: " + Arrays.toString(hrManager.getSeniors()));

        hrManager.addEmployee(0, juniorDeveloper1);
        hrManager.addEmployee(0, midDeveloper1);
        hrManager.addEmployee(0, seniorDeveloper);
        hrManager.addEmployee(0,seniorDeveloper);

        System.out.println("*****************************");

        System.out.println("Juniors: " + Arrays.toString(hrManager.getJuniors()));
        System.out.println("Mids: " + Arrays.toString(hrManager.getMids()));
        System.out.println("Seniors: " + Arrays.toString(hrManager.getSeniors()));
    }

}
