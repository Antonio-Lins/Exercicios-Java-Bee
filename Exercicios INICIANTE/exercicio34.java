import java.util.*;

public class exercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = Integer.parseInt(scanner.nextLine()); 
        
        for (int i = 0; i < N; i++) {
            String[] words = scanner.nextLine().split(" ");
            

            List<Pair> wordList = new ArrayList<>();
            for (int j = 0; j < words.length; j++) {
                wordList.add(new Pair(words[j], j));
            }
            

            wordList.sort(Comparator.comparingInt((Pair p) -> -p.word.length()).thenComparingInt(p -> p.index));
            
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < wordList.size(); j++) {
                sb.append(wordList.get(j).word);
                if (j < wordList.size() - 1) {
                    sb.append(" ");
                }
            }
            System.out.println(sb);
        }
        
        scanner.close();
    }

    static class Pair {
        String word;
        int index;
        Pair(String word, int index) {
            this.word = word;
            this.index = index;
        }
    }
}
