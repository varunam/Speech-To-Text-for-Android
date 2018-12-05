package app.speechtotext;

import java.util.Arrays;
import java.util.List;

/**
 * Created by varun.am on 05/12/18
 */
public class AvailableLanguages {

    public static List<Language> getAvailableLanguages() {
        return Arrays.asList(Language.values());
    }
}
