package com.company;

public class Asterisk {

    final private char asterisk = '*';
    final private char space = ' ';

    public void oneAsterisk(){
        System.out.println(asterisk);
        System.out.println();
    }

    public void horizontalLine(int number_asterisks){
        for (int i=0; i<number_asterisks; i++){
            System.out.print(asterisk);
        }
        System.out.println();
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
        upperTriangle(number_lines+1);
    }

    public void diamond(int number_line_center){
        upperTriangle(number_line_center);
        horizontalLine((number_line_center*2)-1);
        lowerTriangle(number_line_center);
    }

    public void diamondName(int number_line_center){
        final String name = "Jennifer";

        upperTriangle(number_line_center);
        System.out.println(name);
        lowerTriangle(number_line_center);
    }

    private void upperTriangle(int number_line_center){
        for (int i=0; i<(number_line_center-1); i++){
            for (int k=(i+1); k<number_line_center; k++){
                System.out.print(space);
            }
            for(int j=-1; j<(i*2); j++){
                System.out.print(asterisk);
            }
            System.out.println();
        }
    }

    private void lowerTriangle(int number_line_center){
        for (int i=(number_line_center-2); i>=0; i--){
            for (int k=(i+1); k<number_line_center; k++){
                System.out.print(space);
            }
            for(int j=-1; j<(i*2); j++){
                System.out.print(asterisk);
            }
            System.out.println();
        }
    }
}
