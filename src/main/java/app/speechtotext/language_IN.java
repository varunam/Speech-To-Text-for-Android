package app.speechtotext;

/**
 * Created by varun.am on 05/12/18
 */

/**
 * NOTE: Adding a language should follow below procedure
 *
 * 1. Add langugae in Language Enum
 * 2. Add language in LanguageIn enum
 * 3. Add default prompt in defaultPrompt enum
 */
public enum language_IN {
    KANNADA("kn_IN"),
    ENGLISH("en_IN"),
    HINDI("hi_IN"),
    TAMIL("ta_IN"),
    TELUGU("te_IN"),
    MALAYALAM("ml_IN"),
    MARATHI("mr_IN"),
    GUJARATI("gu_IN"),
    BENGALI("bn_IN"),
    URDU("ur"),
    ARABIC("ar"),
    FRENCH("fr"),
    GERMAN("de"),
    GREEK("el"),
    JAPANESE("ja"),
    ITALIAN("it"),
    RUSSIAN("ru"),
    CHINESE("zh-CN"),
    KOREAN("ko");

    private String targetLanguage;

    language_IN(String targetLanguage) {
        this.targetLanguage = targetLanguage;
    }

    @Override
    public String toString() {
        return targetLanguage;
    }
}
