package com.company;

public class Task {
    private String taskName;
    private String descName;
    private int prioInt;

    public Task(String taskName, String descName, int prioInt) {
        this.taskName = taskName;
        this.descName = descName;
        this.prioInt = prioInt;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescName() {
        return descName;
    }

    public void setDescName(String descName) {
        this.descName = descName;
    }

    public int getPrioInt() {
        return prioInt;
    }

    public void setPrioInt(int prioInt) {
        this.prioInt = prioInt;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", descName='" + descName + '\'' +
                ", prioInt=" + prioInt +
                '}';
    }
}

