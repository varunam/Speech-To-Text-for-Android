package app.speechtotext;

/**
 * Created by varun.am on 05/12/18
 */
public enum TargetLanguage {
    KANNADA("kn"),
    HINDI("hi"),
    TAMIL("ta"),
    TELUGU("te"),
    MALAYALAM("ml");

    private String targetLanguage;

    TargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
    }

    @Override
    public String toString() {
        return targetLanguage;
    }
}
