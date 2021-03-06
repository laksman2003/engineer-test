package com.test.engineer;

import java.util.List;
import java.util.Random;

/**
 * Engineer class
 * This will be super class of all types of Engineers
 */
public class Engineer {

    private  String firstName;
    private  String lastName;
    protected List<SkillSet> skillSet;

    protected Engineer()
    {
        this.firstName = "First"+new Random().nextInt(1000);
        this.lastName = "Last"+new Random().nextInt(1000);
    }


    protected Engineer(String firtstName, String lastName)
    {
        this.firstName = firtstName;
        this.lastName = lastName;
    }


    public List<SkillSet> getSkillSet() {
        return skillSet;
    }


    public void setSkillSet(List<SkillSet> skillSet) {
        this.skillSet = skillSet;
    }

    /**
     * This method will Say hello
     * with first and last name and skill set
     * @return
     */
    public String sayHello()
    {
        String greetingMessage = null;
        String skills = null;
        int counter = 0;
        for(SkillSet skill : this.getSkillSet())
        {
            if(counter == 0)
                skills = skill.toString();
            else
              skills =  skills+ ","+ " "+skill.toString();
            counter++;
        }
        greetingMessage = "Hello! My name is "+ this.firstName + " "+ this.lastName+ " "
                +"and my skills are: "+ skills;

        return  greetingMessage;
    }

}
