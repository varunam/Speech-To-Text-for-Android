package app.speechtotext;

/**
 * Created by varun.am on 05/12/18
 */
public enum Language {
    KANNADA("kn"),
    ENGLISH("en"),
    HINDI("hi"),
    TAMIL("ta"),
    TELUGU("te"),
    MALAYALAM("ml"),
    MARATHI("mr"),
    GUJARATI("gu");

    private String targetLanguage;

    Language(String targetLanguage) {
        this.targetLanguage = targetLanguage;
    }

    @Override
    public String toString() {
        return targetLanguage;
    }
}
