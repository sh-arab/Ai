package Models;

import java.util.ArrayList;
import java.util.Objects;

public class Questien {

    String questien;

    ArrayList<String> answers;

    public Questien(String questien) {
        this.questien = questien;
        this.answers = new ArrayList<>();
    }

    public void addAnswer(String answer){
        if (!answers.contains(answer))
           answers.add(answer);
    }

    public String getRandomAnswer(int random){
        return answers.get(random);
    }

    public String getQuestien() {
        return questien;
    }

    public String[] write(){
        String [] arr=new String[answers.size()+1];
        arr[0]=questien;
        for (int i = 1; i < answers.size()+1; i++) {
            arr[i]=answers.get(i-1);
        }
        return arr;
    }
}
