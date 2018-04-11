package com.example.laura.d6project.DataModels;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class Questionare {
    public String name;
    ArrayList<Question> questions;
    String firebase_id = "";
    public Questionare()
    {
        name = "";
        questions = new ArrayList<>();
        firebase_id = "";
    }


    public ArrayList<String> getQuestionPrompt() {
        ArrayList<String> prompts = new ArrayList<>();
        for (Question question : questions)
        {
            prompts.add(question.prompt);
        }
        return prompts;
    }

    public void addQuestion(Question q)
    {
        questions.add(q);
    }

    public void save()
    {

    }

}
