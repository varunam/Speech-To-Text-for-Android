package app.speechtotext;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.speech.RecognizerIntent;
import android.text.TextUtils;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 * Created by varun.am on 05/12/18
 */
public class SpeechToTextConverter {

    private static final String TAG = SpeechToTextConverter.class.getSimpleName();
    private Activity activity;

    public SpeechToTextConverter(Activity activity) {
        this.activity = activity;
    }

    public boolean start(Language language, int STTRequestKey, String promptText) {
        Locale locale = new Locale(language.toString());
        Log.e(TAG, "Locale " + locale.getLanguage() + " present: " + isLocalePresent(locale));
        if (isLocalePresent(locale)) {
            Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, getTargetLanguageIn(language));
            if (!TextUtils.isEmpty(promptText))
                intent.putExtra(RecognizerIntent.EXTRA_PROMPT, promptText);
            try {
                activity.startActivityForResult(intent, STTRequestKey);
            } catch (ActivityNotFoundException e) {
                Log.e(TAG, "ERROR!!! Device not supported");
            }
            return true;
        } else {
            Log.e(TAG, "ERROR!!! Device not supported OR Language not available");
            return false;
        }
    }

    public boolean start(Language language, int STTRequestKey) {
        Locale locale = new Locale(language.toString());
        Log.e(TAG, "Locale " + locale.getLanguage() + " present: " + isLocalePresent(locale));
        if (isLocalePresent(locale)) {
            Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, getTargetLanguageIn(language));
            intent.putExtra(RecognizerIntent.EXTRA_PROMPT, getDefaultPromptFor(language));
            activity.startActivityForResult(intent, STTRequestKey);
            return true;
        } else {
            Log.e(TAG, "ERROR!!! Device not supported OR Language not available");
            return false;
        }
    }

    private String getTargetLanguageIn(Language language) {
        ArrayList<Language> languages = new ArrayList<>(getAvailableLanguages());
        ArrayList<language_IN> langagesIn = new ArrayList<>(Arrays.asList(language_IN.values()));
        int index = languages.indexOf(language);
        return langagesIn.get(index).toString();
    }

    private boolean isLocalePresent(Locale newLocale) {
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

    private String getDefaultPromptFor(Language language) {
        ArrayList<Language> languages = new ArrayList<>(Arrays.asList(Language.values()));
        ArrayList<DefaultPrompt> defaultPrompts = new ArrayList<>(Arrays.asList(DefaultPrompt.values()));
        if (languages.size() == defaultPrompts.size()) {
            int index = languages.indexOf(language);
            return defaultPrompts.get(index).toString();
        } else
            return DefaultPrompt.ENGLISH_DEFAULT_PROMPT.toString();

    }

//TODO add this in activity instance sent
    /*public override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == TTSRequestKey) {
            if (resultCode == RESULT_OK && data != null) {
                val result = data
                        .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS)

                //result will be in result.get(0)

            }
        }
        super.onActivityResult(requestCode, resultCode, data)
    }*/
}
