package Models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ChatBatData {

   public static ArrayList<Questien> questiens;
   public static Random random= new Random();

   public ChatBatData(){
       if (questiens==null)
           questiens= new ArrayList<>();
   }

   public void addQuestien(String questienWord, String[] answers){
       Questien questien=searchByQuestion(questienWord);
       if (searchByQuestion(questienWord)!=null){
           Arrays.stream(answers).forEach(questien::addAnswer);
       }else {
            questien=new Questien(questienWord);
           Arrays.stream(answers).forEach(questien::addAnswer);
           questiens.add(questien);
       }

   }

   public Questien searchByQuestion(String questien){
       for (Questien q: questiens)
           if (q.getQuestien().equals(questien))
               return q;
       return null;
   }

   public String getAnswer(String questienWord){
       Questien questien=searchByQuestion(questienWord);
       if (questien!=null)
           return questien.getRandomAnswer(random.nextInt(questien.answers.size()));

       return "میشه یه بار دیگه سوالتو بپرسی متوجه نشدم";

   }
}
