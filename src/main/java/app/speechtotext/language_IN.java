package app.speechtotext;

/**
 * Created by varun.am on 05/12/18
 */
public enum language_IN {
    KANNADA("kn_IN"),
    ENGLISH("en_IN"),
    HINDI("hi_IN"),
    TAMIL("ta_IN"),
    TELUGU("te_IN"),
    MALAYALAM("ml_IN"),
    MARATHI("mr_IN"),
    GUJARATI("gu_IN");

    private String targetLanguage;

    language_IN(String targetLanguage) {
        this.targetLanguage = targetLanguage;
    }

    @Override
    public String toString() {
        return targetLanguage;
    }
}
