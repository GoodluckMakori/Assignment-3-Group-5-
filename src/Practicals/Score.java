package Practicals;

public class Score {
    private int score;


    public int getScore(int score) {
        return score;
    }

    public void setScore() {
        if(this.score <=100 && score >= 70)
            System.out.println("A");
        else if(this.score >=60)
            System.out.println("B+");
        else if(this.score>=50)
            System.out.println("B");
        else if(this.score>=40)
            System.out.println("C");
        else if(this.score>=35)
            System.out.println("D");
        else if(this.score>=0)
            System.out.println("E");
        else
            System.out.println("invalid score");
    }
}
