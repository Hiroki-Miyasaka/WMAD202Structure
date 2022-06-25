//Design and implement a method which receives a positive integer as its first input -
//parameter and a format (which is either SHAPE1 or SHAPE2 or SHAPE3) as the second
//input parameter and prints the following patterns. See the examples below:



package ca.ciccc.wmad.assignment3.question3;


public class Question3 {

    public static final String SHAPE1 = "Shape1";
    public static final String SHAPE2 = "Shape2";
    public static final String SHAPE3 = "Shape3";

    public static final String SYMBOL = "*";

    public static void test(){
        //drawShape(5, SHAPE1);
        //drawShape(8, SHAPE1);

        //drawShape(5, SHAPE2);
        //drawShape(8, SHAPE2);

        drawShape(5, SHAPE3);
        drawShape(8, SHAPE3);
    }

    public static void drawShape(int number, String format){
        if(format.equalsIgnoreCase(SHAPE1)){
            drawFormat1(number);
        }
        else if(format.equalsIgnoreCase(SHAPE2)){
            drawFormat2(number);
        }
        else if(format.equalsIgnoreCase(SHAPE3)){
            drawFormat3(number);
        }
        else{
            System.out.println("Shape is not supported");
        }
    }

    /**
     * Example: number: 5 - format: SHAPE1-
     * *****
     *  ***
     *   *
     * @param number
     */
    private static void drawFormat1(int number){
        int spaces = 0;
        for(int i = number; i > 0; i = i - 2){
            Question3.drawStarsLine(i, spaces);
            spaces++;
            System.out.println();
        }
    }

    /**
     * Example: number: 5 - format: SHAPE2-
     * *****
     * ****
     * ***
     * **
     * *
     */
    private static void drawFormat2(int number){
        for(int i = number; i > 0; i--){
            Question3.drawStarsLine(i, 0);
            System.out.println();
        }
    }

    /**
     * //Example: number: 5 - format: SHAPE3-
     * *
     * **
     * ***
     * ****
     * *****
     */
    private static void drawFormat3(int number){
        for(int i = 0; i <= number; i++){
            Question3.drawStarsLine(i, 0);
            System.out.println();
        }
    }


    private static void drawStarsLine(int number, int spaces){
        String stars = "";
        for(int i = 0; i < spaces; i++){
            stars = stars + " ";
        }

        for(int i = 0; i < number; i++){
            stars = stars + SYMBOL;
        }
        System.out.print(stars);
    }
}
