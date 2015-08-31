package com.panwix.trueorfalse;

import android.app.Activity;

/**
 * Created by Panwix on 15/8/31.
 */
public class Question extends Activity {
    private int mQuestion;
    private boolean mTrueQuestion;

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int Question) {
        this.mQuestion = Question;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean TrueQuestion) {
        this.mTrueQuestion = TrueQuestion;
    }

    public Question(int question, boolean trueQuestion){
        mQuestion = question;
        mTrueQuestion = trueQuestion;

    }

}
