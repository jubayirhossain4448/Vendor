package com.jubayir;

public class Test {

    public static void main(String[] args) {
        char[][] grid = new char[3][3];
        grid[1][1] = 'x';
        grid[0][0] = 'o';
        grid[2][1] = 'x';
        grid[0][1] = 'o';
        grid[2][2] = 'x';
        grid[1][2] = 'o';
        for (char[] s : grid) {
            System.out.println(s);
        }
    }

}
