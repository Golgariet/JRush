public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        int number = 0;
        int more = 0;
        int smth = 1;

        for (int i = 0; i < 10; i++) {
            int s = Integer.parseInt(r.readLine());
            list.add(s);
        }

        for (int i = 0; i < list.size(); i++) {
            if(number == list.get(i)){
                more++;
                if(more > smth){
                    smth = more;
                }
            } else {
                number = list.get(i);
                more = 1;
            }

        }

        System.out.println(smth);
        //smth


    }
}
