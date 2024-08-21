import java.util.Scanner;

public class QuestionService {

    Questions[] questions = new Questions[5];
    String[] selection = new String[5];
    public QuestionService(){
        questions[0] = new Questions(1,"size of int","2","6","4", "8" ,"4");
        questions[1] = new Questions(2,"size of double","2","6","4", "8" ,"8");
        questions[2] = new Questions(3,"size of char","1","6","4", "8" ,"1");
        questions[3] = new Questions(4,"size of long","2","6","4", "8" ,"8");
        questions[4] = new Questions(5,"size of boolean","1","6","4", "8" ,"1");
    }

    public void playQuiz(){
        int i = 0;
        int scores = 0;
        int numOfCorrectAnswer = 0;
        for(Questions q : questions){

            System.out.println("Question id : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc = new Scanner(System.in);
            selection[i] =  sc.nextLine();

            if(q.getAnswer().equals(selection[i])){
                System.out.println("Your answer: " + selection[i] + " is correct : " );
                scores = scores + 5;
                numOfCorrectAnswer++;
            }else{
                System.out.println("Your answer : " + selection[i] + " is not correct. Correct answer is :" + q.getAnswer());
            }
            i++;
        }
        System.out.println("Number of correct answers: " + numOfCorrectAnswer);
        System.out.println("Your score is: " + scores);

    }
}
