package com.sa.web.dto;

public class SentimentDto {

    private String sentence;
    private float polarity;
    private float subjectivity;

    public SentimentDto() {
    }

    public SentimentDto(String sentence, float polarity, float subjectivity) {
        this.sentence = sentence;
        this.polarity = polarity;
        this.subjectivity = subjectivity;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public float getPolarity() {
        return subjectivity;
    }

    public void setPolarity(float polarity) {
        this.polarity = polarity;
    }

    public float getSubjectivity() {
        return subjectivity;
    }

    public void setSubjectivity(float subjectivity) {
        this.subjectivity = subjectivity;
    }

    @Override
    public String toString() {
        return "SentimentDto{" +
                "sentence='" + sentence + '\'' +
                ", polarity=" + polarity +
                ", subjectivity=" + subjectivity +
                '}';
    }
}
