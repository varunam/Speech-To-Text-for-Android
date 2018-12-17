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
public enum Language {
    KANNADA("kn"),
    ENGLISH("en"),
    HINDI("hi"),
    TAMIL("ta"),
    TELUGU("te"),
    MALAYALAM("ml"),
    MARATHI("mr"),
    GUJARATI("gu"),
    BENGALI("bn"),
    URDU("ur"),
    ARABIC("ar"),
    FRENCH("fr"),
    GERMAN("de"),
    GREEK("el"),
    JAPANESE("ja"),
    ITALIAN("it"),
    RUSSIAN("ru"),
    CHINESE("zh-CN");

    private String targetLanguage;

    Language(String targetLanguage) {
        this.targetLanguage = targetLanguage;
    }

    @Override
    public String toString() {
        return targetLanguage;
    }
}
