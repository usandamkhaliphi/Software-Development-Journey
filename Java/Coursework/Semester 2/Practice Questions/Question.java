/*public class Question
{
   public String Question;
   public String Answer;
   public boolean isCorrect;
   public Question(String q, String a, boolean c)
   {
      this.Question = q;
      this.Answer = a;
      this.isCorrect = c;
   }
   
   public void checkAnswer(String Response)
   {
      if ()
      {
         return true
      }
      else
      {
         return false
      }
   }
}

class Main
{
public static void main(String[] args)
   {
      Question q1 = new Question("Name the fruit that doesn't ripen on the tree but rather once it's picked","Avocado",true);
      Question q2 = new Question("What part of the plant collects sunlight","Leaf",false);
      Question q3 = new Question("What programming language is being used here","Java",true);
      
      String[] question = new String[3];
      
      question[0] = q1;
      question[1] = q2;
      question[2] = q3;
   }
}*/ 

import java.util.Scanner;

public class Question {
    private String text;
    private String answer;

    public Question(String text, String answer) {
        this.text = text;
        this.answer = answer;
    }

    public boolean checkAnswer(String response) {
        return answer.equalsIgnoreCase(response);
    }

    public String getText() {
        return text;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Question[] questions = new Question[3];
        questions[0] = new Question("Name the fruit that doesn't ripen on the tree but rather once it's picked", "Avocado");
        questions[1] = new Question("What part of the plant collects sunlight", "Leaf");
        questions[2] = new Question("What programming language is being used here", "Java");

        for (Question q : questions) {
            System.out.println(q.getText());
            String response = input.nextLine();

            if (q.checkAnswer(response)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong. The correct answer is: " + q.checkAnswer(response));
            }
        }
        
        input.close();
    }
}
