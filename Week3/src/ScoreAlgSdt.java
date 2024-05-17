public class ScoreAlgSdt {
    String nameSdt;
    int scoreAssign, scoreQuiz, scoreMid, scoreFinal;
    double totalscore;

    ScoreAlgSdt (String name, int a, int b, int c, int d) {
        nameSdt = name;
        scoreAssign = a;
        scoreQuiz = b;
        scoreMid = c;
        scoreFinal = d;
    }

    public double CalculateTotalScore() {
        double score1, score2, score3, score4;
        score1 = scoreAssign * 0.3;
        score2 = scoreQuiz * 0.2;
        score3 = scoreMid * 0.2;
        score4 = scoreFinal * 0.3;

        return totalscore = score1 + score2 + score3 + score4;
    }
}
