public class Consonants {
    public static char[] consonants = new char[]{'q', 'w', 'r', 't', 'p', 's', 'd', 'f', 'g', 'h', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};

    //метод проверяет, гласная ли буква
    public static boolean isConsonant(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : consonants)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
