package app.speechtotext;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.speech.RecognizerIntent;
import android.text.TextUtils;
import android.util.Log;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 * Created by varun.am on 05/12/18
 */
public class SpeechToTextConverter {

    private static final String TAG = SpeechToTextConverter.class.getSimpleName();
    public static final int TEXT_TO_SPEECH_REQUEST_KEY = 100;
    private Activity activity;

    public SpeechToTextConverter(Activity activity) {
        this.activity = activity;
    }

    public void start(Language language, String promptText) {
        Locale locale = new Locale(language.toString());
        Log.e(TAG, "Locale " + locale.getLanguage() + " present: " + isLocalePresent(locale));
        if (isLocalePresent(locale)) {
            Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, getTargetLanguageIn(language));
            if (TextUtils.isEmpty(promptText))
                intent.putExtra(RecognizerIntent.EXTRA_PROMPT, promptText);
            try {
                activity.startActivityForResult(intent, TEXT_TO_SPEECH_REQUEST_KEY);
            } catch (ActivityNotFoundException e) {
                Log.e(TAG, "ERROR!!! Device not supported");
            }
        } else
            Log.e(TAG, "ERROR!!! Device not supported OR Language not available");
    }

    private String getTargetLanguageIn(Language language) {
        switch (language) {
            case KANNADA:
                return language_IN.KANNADA.toString();
            case TAMIL:
                return language_IN.TAMIL.toString();
            case TELUGU:
                return language_IN.TELUGU.toString();
            case MALAYALAM:
                return language_IN.MALAYALAM.toString();
            case HINDI:
                return language_IN.HINDI.toString();
            default:
                return "";
        }
    }

    public boolean isLocalePresent(Locale newLocale) {
        Locale[] locales = Locale.getAvailableLocales();
        for (Locale locale : locales) {
            //Logger.e(TAG, "Found Locale: " + locale.getDisplayName());
            if (locale.getLanguage().equals(newLocale.getLanguage())) {
                return true;
            }
        }
        return false;
    }

    public static List<Language> getAvailableLanguages() {
        return Arrays.asList(Language.values());
    }
}
