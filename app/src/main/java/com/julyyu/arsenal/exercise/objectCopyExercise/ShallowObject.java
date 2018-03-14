package com.julyyu.arsenal.exercise.objectCopyExercise;

/**
 * Created by julyyu on 2018/2/23.
 */

public class ShallowObject implements Cloneable{

    private String name;
    private Subject subject;


    public ShallowObject(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
