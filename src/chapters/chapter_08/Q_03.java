package chapters.chapter_08;

public class Q_03 {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int[] scores = countCorrectAnswers(answers, keys);
        int[][] sortedScores = sortGrades(scores);
        printList(sortedScores);
    }

    public static int[] countCorrectAnswers(char[][] answers, char[] keys){
        int scores[] = new int[8];
        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correctCount++;
            }
            scores[i] = correctCount;
        }
        return scores;
    }

    public static int[][] sortGrades(int[] scores){
        int[][] sortedScores = new int[2][8];
        int maxValue = Integer.MIN_VALUE;
        int maxIndice = -1;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > maxValue){
                maxValue = scores[i];
            }
        }
        int i = 0;
        while (i < sortedScores[0].length){
            for (int j = 0; j < scores.length; j++) {
                if (scores[j] == maxValue){
                    sortedScores[0][i] = j;
                    sortedScores[1][i] = scores[j];
                    i++;
                }
            }
            maxValue--;
        }
        return sortedScores;
    }

    public static void printList(int[][] sortedScores){
        for (int i = 0; i < sortedScores[0].length; i++) {
            System.out.println("Student " + sortedScores[0][i] + "'s correct count is " + sortedScores[1][i]);
        }
    }
}
