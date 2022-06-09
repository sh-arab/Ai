package Models;

import java.util.ArrayList;

public class Cosine {

    public static Questien checkCosine(String question){
        double maxQ=0;
        int maxIndex=0;
        String[] arr=question.split(" ");
        for(Questien q:ChatBatData.questiens){
            double tempQ=0;
            for (String a:arr)
                if (q.questien.contains(a))
                    tempQ++;

            tempQ/=q.questien.split(" ").length;

            if (tempQ>maxQ){
                maxIndex=ChatBatData.questiens.indexOf(q);
                maxQ=tempQ;
            }
        }

        if (maxQ>0.0)
            return ChatBatData.questiens.get(maxIndex);

        return null;

    }

}
