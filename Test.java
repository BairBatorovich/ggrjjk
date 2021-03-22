import java.util.*;

public class Test {
    public static void main(String[] args) {
        new Test().run();
    }

    public void run() {
        Scanner sc;
        String[] strArray;
        Map<String, Integer> map = new HashMap<String, Integer>();
        int i, j;
        Integer max = 0;
        String xchar = null;

        System.out.println("Введите слово и нажмите Enter");
        sc = new Scanner(System.in);
        strArray = sc.nextLine().split("");

        for (i = 0; i < strArray.length; i++) {
            String b = strArray[i];
            int count = 0;
            for(j = 0; j < strArray.length; j++) {
                if (b.equals(strArray[j])) {
                    count++;
                    map.put(b, count);
                }
            }
        }

        ArrayList<String> charArray = new ArrayList<String>();
        ArrayList<Integer> numbArray = new ArrayList<Integer>();

        for(Map.Entry<String, Integer> item : map.entrySet()){
           charArray.add(item.getKey());
           numbArray.add(item.getValue());
        }

        for(i=0; i<numbArray.size();i++) {
            if(numbArray.get(i) > max){
                max = numbArray.get(i);
                xchar = charArray.get(i);
            } else if(numbArray.get(i) == max) {
                if(charArray.get(i).equals(strArray[strArray.length - 1]) ) {
                    xchar = charArray.get(i);
                }
            }
        }

        System.out.println("max " + xchar + " " + max);
    }
}
