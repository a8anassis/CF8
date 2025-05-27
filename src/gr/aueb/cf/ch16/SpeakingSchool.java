package gr.aueb.cf.ch16;

public class SpeakingSchool {

    private final Cat cat = new Cat();     // dependency

    public SpeakingSchool() {

    }

    public void learnToSpeak() {
        cat.speak();
    }
}
