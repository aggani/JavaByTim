public class Main {
    public static void main(String[] args) {
//        float minFloatValue = Float.MIN_VALUE;
//        float maxFloatValu = Float.MAX_VALUE;
//        System.out.println("Float min value is: "+minFloatValue);
//        System.out.println("Float max value is: "+maxFloatValu);
//        double minDoubleValue = Double.MIN_VALUE;
//        double maxDoubleValue = Double.MAX_VALUE;
//        System.out.println("Double min value is: "+minDoubleValue);
//        System.out.println("Double max value is: "+maxDoubleValue);
//
//
//        double numOfPounds = 190d;
//        double convertIntoKG = numOfPounds * 0.45359237d;
//        System.out.println("Converted Kilograms = "+convertIntoKG+" KG");

//        char myUnicode = '\u0069';
//        System.out.println(myUnicode);
//
//        double var1 = 20.00d;
//        double var2 = 80.00d;
//        var res1 = var1 + var2 * 100.00d;
//        System.out.println("Calculated Value: "+res1);
//        var res2 = res1 % 40.00d;
//        System.out.println("Remainder is "+res2);
//        boolean remainderCheck = (res2 == 0) ? true : false;
//        System.out.println(remainderCheck);
//        if (!remainderCheck)
//            System.out.println("Got some remainder");

//        int score = 10000;
//        int levelCompleted = 8;
//        int bonus = 200;
//        boolean gameOver = true;
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Final score is: "+finalScore);
//        }
//        int highScore = calculateScore(true, 10000, 8, 200);
//        int highScore2 = calculateScore(true, 696969, 69, 690);
//        System.out.println(highScore);
//        System.out.println(highScore2);
        int returnedValue = calculateHighScorePosition(1500);
        displayHighsScorePosition("Anirudh",returnedValue);
         returnedValue = calculateHighScorePosition(900);  // Reassignment happening with 'returnedValue'
        displayHighsScorePosition("Pulli",returnedValue);
         returnedValue = calculateHighScorePosition(400);
        displayHighsScorePosition("Manas",returnedValue);
         returnedValue = calculateHighScorePosition(50);
        displayHighsScorePosition("Nimit",returnedValue);
    }

//    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Final score is: "+finalScore);
//            return finalScore;
//        }
//            return -1;
//    }
    public static void displayHighsScorePosition (String name, int pos) {
        System.out.println(name+" managed to get into position "+pos+" on the high score table");
    }
    public static int calculateHighScorePosition(int score) {
        if(score >= 1000){
            return 1;
        }
        else if(score >= 500 ){
            return 2;
        }
        else if(score >= 100 ){
            return 3;
        }
            return 4;
    }
}
