package Models;

import java.util.ArrayList;

public class Questien {

    String questien;

    ArrayList<String> answers;

    public Questien(String questien) {
        this.questien = questien;
        this.answers = new ArrayList<>();
    }

    public void addAnswer(String answer){
        answers.add(answer);
    }

    public String getRandomAnswer(int random){
        return answers.get(random);
    }

    public String getQuestien() {
        return questien;
    }

    public String[] write(){
        return new String[]{questien + answers.toArray()};
    }
}
