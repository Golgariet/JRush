public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> smth = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            smth.add(i);
        }

        return smth;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код

        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            Integer q = iterator.next();
            if (q > 10) {
                iterator.remove();
            }
        }

        return set;
    }

    public static void main(String[] args) {
        
    }
}
