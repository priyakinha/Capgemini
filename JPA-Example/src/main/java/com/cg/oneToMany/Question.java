package com.cg.oneToMany;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Question {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private int qid;
    private String questionName;
    private String lavel;
    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private List<Answer> answer;

   public Question(){}
    public Question(String questionName,String lavel){
        super();
        this.questionName=questionName;
        this.lavel=lavel;
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public String getLavel() {
        return lavel;
    }

    public void setLavel(String lavel) {
        this.lavel = lavel;
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

}
