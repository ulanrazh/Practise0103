package com.company;

public class InvalidYearOfIssue extends Exception{
    public InvalidYearOfIssue() {
    }

    public InvalidYearOfIssue(String message) {
        super(message);
    }
}
