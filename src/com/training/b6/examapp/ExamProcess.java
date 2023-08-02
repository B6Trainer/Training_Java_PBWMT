package com.training.b6.examapp;

public class ExamProcess {

    public static void main(String[] args) {

        //Teachers activity
       Iteacher teacherObj= ExamManager.getInstance();
       boolean validation = teacherObj.validateCredential("James","Teacher");

       if(validation){
           teacherObj.setQuestions("What is the capital of India?" , "New Delhi");
       }else{
           System.out.println("Teacher validation failed");
       }

       //Student
        Istudent studentObj = ExamManager.getInstance();
       validation = studentObj.validateCredential("Andrew","Student");
       // validation=studentObj.validateStudentCredentials("Andrew");
        if(validation){
            String question = studentObj.getQuestion();
            System.out.println("Question: "+question);
            studentObj.writeExam( "New Delhi");
        }else{
            System.out.println("Student validation failed");
        }


        //Publisher

            Ipublisher publisherObj = ExamManager.getInstance();
        validation = publisherObj.validateCredential("Mark","Publisher");
        //validation=publisherObj.validatePubCredentials("Mark");
        if(validation){
            publisherObj.validateAnswer();
            publisherObj.publishResults();

        }else{
            System.out.println("Publisher validation failed");
        }




    }
}
