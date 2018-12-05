package app.speechtotext;

/**
 * Created by varun.am on 05/12/18
 */
public enum TargetLanguage_IN {
    KANNADA("kn_IN"),
    HINDI("hi_IN"),
    TAMIL("ta_IN"),
    TELUGU("te_IN"),
    MALAYALAM("ml_IN");

    private String targetLanguage;

    TargetLanguage_IN(String targetLanguage) {
        this.targetLanguage = targetLanguage;
    }

    @Override
    public String toString() {
        return targetLanguage;
    }
}
