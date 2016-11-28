package com.company;

public class Asterisk {

    final private char asterisk = '*';
    final private char space = ' ';
    final private String name = "Jennifer";

    public void oneAsterisk(){
        System.out.println(asterisk);
        System.out.println();
    }

    public void horizontalLine(int number_asterisks){
        for (int i=0; i<number_asterisks; i++){
            System.out.print(asterisk);
        }
        System.out.println("\n");
    }

    public void verticalLine(int number_asterisks){
        for (int i=0; i<number_asterisks; i++){
            System.out.println(asterisk);
        }
        System.out.println();
    }

    public void rightTriangle(int number_lines){
        for (int i=1; i<=number_lines; i++){
            for(int j=1; j<=i; j++){
                System.out.print(asterisk);
            }
            System.out.println();
        }
    }

    public void isoscelesTriangle(int number_lines){
        for (int i=0; i<number_lines; i++){
            for (int k=(i+1); k<number_lines; k++){
                System.out.print(space);
            }
            for(int j=-1; j<(i*2); j++){
                System.out.print(asterisk);
            }
            System.out.println();
        }
    }

    public void diamond(int number_line_center){
        for (int i=0; i<number_line_center; i++){
            for (int k=(i+1); k<number_line_center; k++){
                System.out.print(space);
            }
            for(int j=-1; j<(i*2); j++){
                System.out.print(asterisk);
            }
            System.out.println();
        }
        for (int i=1; i<number_line_center; i++){
            for(int k=0; k<i; k++){
                System.out.print(space);
            }
            for(int j=(number_line_center+2); j>(i*2); j--){
                System.out.print(asterisk);
            }
            System.out.println();
        }
    }

    public void diamondName(int number_line_center){
        for (int i=0; i<(number_line_center-1); i++){
            for (int k=(i); k<(number_line_center-1); k++){
                System.out.print(space);
            }
            for(int j=-1; j<(i*2); j++){
                System.out.print(asterisk);
            }
            System.out.println();
        }

        System.out.println(name);

        for (int i=1; i<number_line_center; i++){
            for(int k=0; k<i; k++){
                System.out.print(space);
            }
            for(int j=(number_line_center+2); j>(i*2); j--){
                System.out.print(asterisk);
            }
            System.out.println();
        }
    }
}
