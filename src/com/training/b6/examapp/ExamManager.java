package com.training.b6.examapp;

public class ExamManager implements Iteacher, Istudent, Ipublisher{

    private String question;
    private String teachers_answer;
    private String student_answer;

    private String examResult;

    private String teacher_id ="James";
    private String student_id ="Andrew";

    private String pub_id ="Mark";

    private static ExamManager examObj  = new ExamManager();
    public static ExamManager getInstance() {
        return examObj;
    }

    @Override
    public boolean setQuestions(String _question, String _answer) {
        this.question=_question;
        this.teachers_answer=_answer;
        System.out.println("Question & answer is set successfully");
        return true;
    }

    @Override
    public String getExamDetails() {
        return null;
    }


    @Override
    public ExamObject getExamObject() {
        return null;
    }

    @Override
    public String getQuestion() {
        return question;
    }

    @Override
    public boolean writeExam(String answer) {
        this.student_answer=answer;
        System.out.println("Student has answered successfully: "+answer);
        return true;
    }

    @Override
    public String validateAnswer() {

        if(teachers_answer.equals(student_answer)){
            this.examResult="PASSED";
        }else{
            this.examResult="FAILED";
        }
        return this.examResult;
    }

    @Override
    public String publishResults() {
        System.out.println("Publishing the result....");
        System.out.println(" Student "+student_id+" has "+examResult);
        return this.examResult;
    }


    @Override
    public boolean validateCredential(String id, String type) {
        switch (type){

            case "Teacher":
                return id.equals(teacher_id);
            case "Student":
                return id.equals(student_id);
            case "Publisher":
                return id.equals(pub_id);
        }
        return false;
    }
}
