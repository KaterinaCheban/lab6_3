import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть речення (латинськими літерами): ");
        String sc = scan.nextLine(); //читаем строку с консоли
        char [] charArray = sc.toCharArray(); //создаем массив, куда поместим строку с консоли, и которую переводим в char

        ArrayList <Character> listCharVowels = new ArrayList <Character>(); //список для гласных
        ArrayList <Character> listCharConsonants = new ArrayList <Character>(); //список для согласных

        for (int i=0; i < charArray.length; i++) //бежим по массиву
        {
            if (Vowels.isVowel(charArray[i])) //проверяем условие методом isVowel если текуший символ гласная
            {
                listCharVowels.add(charArray[i]); //помещаем гласную в свой список
            }
            else if (charArray [i] == ' ')// проверяем есть ли пробел, и пропускаем его
            {
                continue;
            }
            else if (Consonants.isConsonant(charArray[i])) //проверяем условие методом isConsonant если текуший символ согласная
            {
                listCharConsonants.add(charArray[i]); //помещаем согласную в свой список
            }
        }

        for (char c : listCharVowels)//бежим по списку, в который положили гласные
        {
            System.out.print(c + " "); //выводи гланые на экран, не забываем пробел между ними
        }

        System.out.println(); // переводим курсов на другую строчку

        for (char c : listCharConsonants) //бежим по списку согласных
        {
            System.out.print(c + " "); //выводим на экран все остальные символы, через пробел
        }
    }
}