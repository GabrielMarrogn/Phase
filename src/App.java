import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < a; i++) {
            int c = sc.nextInt();
            list.add(c);
        }

        int maiorN = maior(list);
        int qtdN = contador(maiorN, list);

        while (qtdN < b) {
            List<Integer> list2 = new ArrayList<Integer>();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) != maiorN) {
                    int listValue = list.get(i);
                    list2.add(listValue);
                }
            }

            list.clear();
            list.addAll(list2);
            list2.clear();

            maiorN = maior(list);
            qtdN += contador(maiorN, list);
        }

        System.out.println(qtdN);
        sc.close();

    }

    public static int maior(List<Integer> arr) {
        int maior = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i == 0) {
                maior = arr.get(i);
            } else if (arr.get(i) > maior) {
                maior = arr.get(i);
            }
        }
        return maior;
    }

    public static int contador(int maior, List<Integer> arr) {
        int qtd = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (maior == arr.get(i))
                qtd++;
        }

        return qtd;
    }
}
