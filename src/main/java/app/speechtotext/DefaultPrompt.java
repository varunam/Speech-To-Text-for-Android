package app.speechtotext;

/**
 * Created by varun.am on 17/12/18
 */

/**
 * NOTE: Adding a language should follow below procedure
 *
 * 1. Add langugae in Language Enum
 * 2. Add language in LanguageIn enum
 * 3. Add default prompt in defaultPrompt enum
 */
public enum DefaultPrompt {
    KANNADA_DEFAULT_PROMPT("ಏನಾದರು ಹೇಳಿ"),
    ENGLISH_DEFAULT_PROMPT("Say something"),
    HINDI_DEFAULT_PROMPT("कुछ सुनाओ"),
    TAMIL_DEFAULT_PROMPT("ஏதாவது கூறுங்கள்"),
    TELUGU_DEFAULT_PROMPT("ఏదైనా చెప్పు"),
    MALAYALAM_DEFAULT_PROMPT("എന്തെങ്കിലും പറയൂ"),
    MARATHI_DEFAULT_PROMPT("काहीतरी बोला"),
    GUJARATI_DEFAULT_PROMPT("કંઈક બોલ"),
    BENGALI_DEFAULT_PROMPT("কিছু বল"),
    URDU_DEFAULT_PROMPT("کچھ بولیں"),
    ARABIC_DEFAULT_PROMPT("قل شيئا"),
    FRENCH_DEFAULT_PROMPT("dis quelquechose"),
    GERMAN_DEFAULT_PROMPT("Sag etwas"),
    GREEK_DEFAULT_PROMPT("πες κάτι"),
    JAPANESE_DEFULT_PROMPT("何か言って"),
    ITALIAN_DEFAULT_PROMPT("di 'qualcosa"),
    RUSSIAN_DEFAULT_PROMPT(""),
    CHINESE_DEFAULT_PROMPT("");

    private String defaultPrompt;

    DefaultPrompt (String defaultPrompt) {
        this.defaultPrompt = defaultPrompt;
    }

    @Override
    public String toString() {
        return defaultPrompt;
    }
}
