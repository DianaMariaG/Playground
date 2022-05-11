package endava;

import java.util.ArrayList;
import java.util.Collection;

class LanguageStudent {
    private final Collection<String> languages = new ArrayList<>();

    public Collection<String> getLanguages() {
        return languages;
    }

    public void addLanguage(String language) {
        this.languages.add(language);
    }
}
