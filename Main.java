import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> volumes = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            volumes.add(scanner.nextInt());
        }
        int answer = 0;
        int maximal = volumes.get(0);
        for (int i = 0; i < volumes.size(); i++) {
            maximal = Math.max(volumes.get(i), maximal);
            if (volumes.get(i) < maximal) {
                answer = -1;
                break;
            }
        }
        if (answer == 0) {
            int maxVolume = Collections.max(volumes);
            int minVolume = Collections.min(volumes);
            System.out.println(maxVolume - minVolume);
        } else {
            System.out.println(answer);
        }
    }
}
