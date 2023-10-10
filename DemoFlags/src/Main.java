import java.awt.*;
import javax.swing.*;


public class Main {
    public static final int COLOR_YELLOW = new Color(250, 201, 20).getRGB();
    public static final int COLOR_BLUE = new Color(17, 13, 99).getRGB();
    public static final int COLOR_RED = new Color(196, 0, 15).getRGB();
    public static final int COLOR_BLACK = new Color(5, 5, 5).getRGB();
    public static final int COLOR_WHITE = new Color(255, 255, 255).getRGB();
    public static final int COLOR_GREEN = new Color(35, 138, 51).getRGB();

    public static int[][] createCOLFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;

        rowIni = 0;
        rowEnd = (int) (height * 0.50);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_YELLOW;
            }
        }
        rowIni = (int) (height * 0.50);
        rowEnd = (int) (height * 0.75);// ya le escucho, hable porfa

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }
        rowIni = (int) (height * 0.75);
        rowEnd = (int) (height);
        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        return flag;
    }

    public static int[][] createVENFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;

        rowIni = 0;
        rowEnd = (int) (height * 0.34);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_YELLOW;
            }
        }
        rowIni = (int) (height * 0.35);
        rowEnd = (int) (height * 0.67);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }
        rowIni = (int) (height * 0.68);
        rowEnd = (int) (height);
        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        return flag;
    }

    public static int[][] createPOLFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;

        rowIni = 0;
        rowEnd = (int) (height * 0.50);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }
        rowIni = (int) (height * 0.50);
        rowEnd = (int) (height);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        return flag;
    }

    public static int[][] createPANFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;

        rowIni = 0;
        rowEnd = (int) (height);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }

        rowIni = 0;
        rowEnd = (int) (height * 0.50);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = (int) (width * 0.50); cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        rowIni = (int) (height * 0.50);
        ;
        rowEnd = (int) (height);
        int cellIni = 0;
        int cellEnd = (int) (width * 0.50);


        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }

        return flag;
    }

    public static int[][] createCHLFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;

        rowIni = 0;
        rowEnd = (int) (height);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }

        rowIni = (int) (height * 0.50);
        rowEnd = (int) (height);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        rowIni = 0;
        ;
        rowEnd = (int) (height * 0.50);
        int cellIni = 0;
        int cellEnd = (int) (width * 0.33);


        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }

        return flag;
    }

    public static int[][] createUSAFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;

        rowIni = 0;
        rowEnd = (int) (height);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }

        rowIni = 0;
        rowEnd = (int) (height);

        for (int row = rowIni; row < rowEnd; row = row + 2) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        rowIni = 0;
        rowEnd = (int) (height * 0.50);
        int cellIni = 0;
        int cellEnd = (int) (width * 0.33);


        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }

        return flag;
    }

    public static int[][] createCZEFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;

        rowIni = 0;
        rowEnd = (int) (height * 0.50);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }

        rowIni = (int) (height * 0.50);
        rowEnd = (int) (height);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }

        rowIni = 0;
        rowEnd = (int) (height);
        int cellIni = 0;
        int cellEnd = (int) (width);

        do {
            for (int row = rowIni; row < rowEnd; row++)
                flag[row][cellIni] = COLOR_BLUE;
            rowIni++;
            rowEnd--;
            cellIni++;
        }
        while (rowIni != rowEnd);

        return flag;
    }

    public static int[][] createDNKFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;

        rowIni = 0;
        rowEnd = (int) (height);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }
        rowIni = (int) (height * 0.45);
        rowEnd = (int) (height * 0.60);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }
        rowIni = 0;
        rowEnd = (int) (height);
        int cellIni = (int) (width * 0.30);
        int cellEnd = (int) (width * 0.40);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }

        return flag;
    }

    public static int[][] createFINFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;

        rowIni = 0;
        rowEnd = (int) (height);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }
        rowIni = (int) (height * 0.35);
        rowEnd = (int) (height * 0.70);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }
        rowIni = 0;
        rowEnd = (int) (height);
        int cellIni = (int) (width * 0.25);
        int cellEnd = (int) (width * 0.45);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }

        return flag;
    }

    public static int[][] createNORFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;

        rowIni = 0;
        rowEnd = (int) (height);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }
        rowIni = (int) (height * 0.35);
        rowEnd = (int) (height * 0.70);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }
        rowIni = 0;
        rowEnd = (int) (height);
        int cellIni = (int) (width * 0.25);
        int cellEnd = (int) (width * 0.45);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }
        rowIni = (int) (height * 0.45);
        rowEnd = (int) (height * 0.60);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }
        rowIni = 0;
        rowEnd = (int) (height);
        cellIni = (int) (width * 0.30);
        cellEnd = (int) (width * 0.40);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }

        return flag;
    }

    public static int[][] createKWTFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;

        rowIni = 0;
        rowEnd = (int) (height * 0.34);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_GREEN;
            }
        }
        rowIni = (int) (height * 0.35);
        rowEnd = (int) (height * 0.67);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }
        rowIni = (int) (height * 0.68);
        rowEnd = (int) (height);
        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }
        rowIni = 0;
        rowEnd = (int) (height);
        int cellIni = 0;
        int cellEnd = (int) (width);

        do {
            for (int row = rowIni; row < rowEnd; row++)
                flag[row][cellIni] = COLOR_BLACK;
            rowIni++;
            rowEnd--;
            cellIni++;
        }
        while (rowIni != rowEnd / 1.4);

        return flag;
    }

    public static int[][] createZAFFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;

        rowIni = 0;
        rowEnd = (int) (height * 0.34);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }
        rowIni = (int) (height * 0.35);
        rowEnd = (int) (height * 0.67);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }
        rowIni = (int) (height * 0.68);
        rowEnd = (int) (height);
        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }
        rowIni = (int) (height * 0.35);
        rowEnd = (int) (height * 0.70);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }
        rowIni = (int) (height * 0.45);
        rowEnd = (int) (height * 0.60);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_GREEN;
            }
        }
        rowIni = 0;
        rowEnd = (int) (height);
        int cellIni = 1;
        int cellEnd = (int) (width);

        do {
            for (int row = rowIni; row < rowEnd; row++)
                flag[row][cellIni] = COLOR_WHITE;
            rowIni++;
            rowEnd--;
            cellIni++;
        }
        while (rowIni != rowEnd/1.4);

        rowIni = 0;
        rowEnd = (int) (height);
        cellIni = 0;
        cellEnd = (int) (width);

        do {
            for (int row = rowIni; row < rowEnd; row++)
                flag[row][cellIni] = COLOR_GREEN;
            rowIni++;
            rowEnd--;
            cellIni++;
        }
        while (rowIni != rowEnd);

        rowIni = 2;
        rowEnd = (int) (height - 2);
        cellIni = 0;
        cellEnd = (int) (width);

        do {
            for (int row = rowIni; row < rowEnd; row++)
                flag[row][cellIni] = COLOR_YELLOW;
            rowIni++;
            rowEnd--;
            cellIni++;
        }
        while (rowIni != rowEnd);

        rowIni = 3;
        rowEnd = (int) (height - 3);
        cellIni = 0;
        cellEnd = (int) (width);

        do {
            for (int row = rowIni; row < rowEnd; row++)
                flag[row][cellIni] = COLOR_BLACK;
            rowIni++;
            rowEnd--;
            cellIni++;
        }
        while (rowIni != rowEnd);

        return flag;
    }
    public static int[][] createCHEFlag(int height, int width) {
        int[][] flag = new int[height][width];
        int rowIni = 0;
        int rowEnd = 0;

        rowIni = 0;
        rowEnd = (int) (height);

        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }
        rowIni = 1;
        rowEnd = (int) (height - 1);
        int cellIni = (int) (width * 0.40);
        int cellEnd = (int) (width * 0.60);


        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }

        rowIni = 4;
        rowEnd = (int) (height - 4);
        cellIni = (int) (width * 0.25);
        cellEnd = (int) (width * 0.75);


        for (int row = rowIni; row < rowEnd; row++) {
            for (int cell = cellIni; cell < cellEnd; cell++) {
                flag[row][cell] = COLOR_WHITE;
            }
        }

        return flag;
    }


    public static void main(String[] args){
        int[][] flag={};
        flag = createCOLFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null, flag);
        flag = createVENFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null, flag);
        flag = createPOLFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null, flag);
        flag = createPANFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null, flag);
        flag = createCHLFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null, flag);
        flag = createUSAFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null, flag);
        flag = createCZEFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null, flag);
        flag = createDNKFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null, flag);
        flag = createFINFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null, flag);
        flag = createNORFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null, flag);
        flag = createKWTFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null, flag);
        flag = createZAFFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null, flag);
        flag = createCHEFlag(12,20);
        JOptionPaneArrays.showColorArray2D(null, flag);
    }
}
