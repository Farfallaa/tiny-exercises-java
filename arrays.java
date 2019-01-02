package Jan2018;

//this exercise is an example of single-dimentional and multi-dimentional arrays- their building, filling values using for loops and then printing them out in a pleasant to read manner

public class arrays {

    public static void main(String[] args) {
        //cant use a declared array until you define how big it is

        int[] numberArray = new int[10];

        String[] stringArray = {"just", "another", "word"};

        //fill values into array using for loop:
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i;
        }


        int k = 1;
        while (k <= 61) {
            System.out.print('-');
            k++;
        }
        System.out.println();

        for (int j = 0; j < numberArray.length; j++) {

            System.out.print("| " + j + " ");

        }
        System.out.println("|");

        k = 1;
        while (k <= 61) {
            System.out.print('-');
            k++;
        }
        System.out.println();


//multidimentional arrays - assigning values

        String[][] multiArray = new String[10][10];

        for (int i = 0; i < multiArray.length; i++) {
            {
                for (int j = 0; j < multiArray[i].length; j++) {
                    multiArray[i][j] = i + " " + j;
                }
            }

        }

            //multidimentional arrays - printing out values:





            for (int i = 0; i < multiArray.length; i++) {
                {
                    for (int j = 0; j < multiArray[i].length; j++) {
                        System.out.print("| " + multiArray[i][j] + " ");
                    }
                    System.out.println("|");

                }


            }

            k = 1;
            while (k <= 61) {
                System.out.print('-');
                k++;

            }

            System.out.println();


            //Enhanced for loop for a single dimentional array:

        for(int row: numberArray){
            System.out.print(row);
        }
        System.out.println("\n");



        }
    }
