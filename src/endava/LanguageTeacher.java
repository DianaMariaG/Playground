package endava;

class LanguageTeacher extends LanguageStudent{
    public boolean teach(LanguageStudent student, String language) {
        if (super.getLanguages().contains(language)) {
            student.addLanguage(language);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
      LanguageTeacher teacher = new LanguageTeacher();
      teacher.addLanguage("English");

      LanguageStudent student = new LanguageStudent();
      teacher.teach(student, "English");

      for(String language : student.getLanguages())
          System.out.println(language);
    }
}
