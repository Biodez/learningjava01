import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********\n");
        System.out.println("How many historical figures will you register?");
        int figuresNumber = scan.nextInt();
        scan.nextLine();

        String[][] figuresDataBase = new String[figuresNumber][3];

        for (int i = 0; i < figuresDataBase.length; i++) {
            System.out.println("\n\tFigure " + (i+1));
            System.out.print("\t • Name: ");
            String name = scan.nextLine();
            figuresDataBase[i][0] = name;
            System.out.print("\t • Date of birth: ");
            String dateOfBirth = scan.nextLine();
            figuresDataBase[i][1] = dateOfBirth;
            System.out.print("\t • Occupation: ");
            String occupation = scan.nextLine();
            figuresDataBase[i][2] = occupation;
            System.out.print("\n");
        }
        
        System.out.println("These are the values you stored:");
        print2DArray(figuresDataBase);

        System.out.print("\nWho do you want information on? "); 
        String nameSearch = scan.nextLine();
        for (int i = 0; i < figuresDataBase.length; i++) {
            if (nameSearch.equals(figuresDataBase[i][0])) {
                System.out.println("\tName: " + figuresDataBase[i][0]);
                System.out.println("\tDate of birth: " + figuresDataBase[i][1]);
                System.out.println("\tOccupation: " + figuresDataBase[i][2]);
            }
        }       

        scan.close();
    }
    public static void print2DArray(String[][] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

}
