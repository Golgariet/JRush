/* 
Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.

Пример ввода:
5
8
-2
11
3
-5
2
10

Пример вывода:
-2
2
8
10


Требования:
1. Программа должна считывать данные с консоли.
2. Программа должна создавать FileInputStream для введенной с консоли строки.
3. Программа должна выводить данные на экран.
4. Программа должна вывести на экран все четные числа считанные из файла отсортированные по возрастанию.
5. Программа должна закрывать поток чтения из файла(FileInputStream).
*/

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        //открываем входящий поток, читающий с консоли
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        //поток, читающий из файла
        reader = new BufferedReader(new InputStreamReader((new FileInputStream(fileName))));

        //Коллекция
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Преобразуем в int и узнаем четный или нет
        while (reader.ready()) {
            int num = Integer.parseInt(reader.readLine());
            if (num % 2 == 0) {
                numbers.add(num);
            }
        }
        // Закрываем ридер
        reader.close();

        // Сортируем коллекцию
        Collections.sort(numbers);

        // вывод на экран
        for (int i : numbers) {
            System.out.println(i);
        }


    }
}
