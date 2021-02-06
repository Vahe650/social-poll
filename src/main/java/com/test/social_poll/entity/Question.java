package com.test.social_poll.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "question")
public class Question {

    public Question(Long number, String question, Poll poll) {
        this.number = number;
        this.question = question;
        this.poll = poll;
    }

    public Question() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private Long number;
    @Column
    private String question;
    @ManyToOne
    private Poll poll;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question1 = (Question) o;
        return Objects.equals(id, question1.id) &&
                Objects.equals(number, question1.number) &&
                Objects.equals(question, question1.question) &&
                Objects.equals(poll, question1.poll);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, question, poll);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Poll getPoll() {
        return poll;
    }

    public void setPoll(Poll poll) {
        this.poll = poll;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", number=" + number +
                ", question='" + question + '\'' +
                ", poll=" + poll +
                '}';
    }
}
