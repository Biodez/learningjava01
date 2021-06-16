public class ArrayExercise {
    public static void main(String[] args) {
        int[][] randomArray = new int[100][10];
        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < randomArray[i].length; j++) {
                randomArray[i][j] = randomNumber();
            }
        }
        print2DArray(randomArray);
    }

    public static int randomNumber(){
        double number = Math.random() * 1000;
        number += 1;
        return (int)number;
    }
    public static void print2DArray(int[][] randomArray){
        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < randomArray[i].length; j++) {
                System.out.print(randomArray[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
    
}
