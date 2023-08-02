package com.training.b6.examapp;

public interface Istudent extends IExamMembers{

    public String getExamDetails();

   // public boolean validateStudentCredentials(String _id);

    public ExamObject getExamObject();

    public String getQuestion();
    public boolean writeExam(String answer);

}
