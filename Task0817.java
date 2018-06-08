public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код

        HashMap<String, String> list = new HashMap<String, String>();

        list.put("фцвфцв", "ыупыуп");
        list.put("сатсат", "Антон");
        list.put("яыся", "яымяым");
        list.put("сатста", "яымыям");
        list.put("яымяыим", "Антон");
        list.put("тррк", "ооеоао");
        list.put("цуаыа", "птмпт");
        list.put("яыс", "Антон");
        list.put("цвйарпол", "йенгоооло");
        list.put("ыуаыу", "вкрвр");

        return list;


    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код

        HashMap<String, String> copy = new HashMap<String, String>(map);

        Iterator<HashMap.Entry<String, String>> iterator = copy.entrySet().iterator();

        while (iterator.hasNext()) {
            //получение «пары» элементов
            HashMap.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();        //значение
            iterator.remove();
            if (copy.containsValue(value)) {
                removeItemFromMapByValue(map, value);
            }
        }


    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}

//    Нам повторы не нужны
//    Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
//        Удалить людей, имеющих одинаковые имена.
//
//
//        Требования:
//        1. Программа не должна выводить текст на экран.
//        2. Программа не должна считывать значения с клавиатуры.
//        3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящих из 10 записей.
//        4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
//        5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
