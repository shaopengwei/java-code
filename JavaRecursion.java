import java.util.ArrayList;
import java.util.List;

/**
 * @author  shaopengwei@hotmail.com
 * @version 1.0.0
 * 
 * java 递归
 * 
 */

public class JavaRecursion {
    public static void main(String[] args) {
        // 斐波那契数列
        // int ret = fibonacci(6);
        // System.out.println("斐波那契数列：" + ret);

        // 阶乘
        // int retFactorial = factorial(4);
        // System.out.println("阶乘：" + retFactorial);

        // 走迷宫
        // int[][] map = getMigong(10, 10);
        // findPath(map, 1, 1);

        // 汉诺塔
        // hanoiTower(5, 'A', 'B', 'C');

        // 八皇后
        eightQueen(4);

    }

    /**
     * 递归调用方法1：实现返回斐波那契数列第n个数
     */
    public static int fibonacci(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        } else {
            System.out.println("n 要求大于等于 1.");
            return -1;
        }
    }

    /**
     * 递归调用方法2：实现阶乘
     */
    public static int factorial(int n) {
        if (n < 1) {
            System.out.println("n 要求大于等于 1.");
            return -1;
        }
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    /**
     * 递归调用方法3：实现迷宫
     */

    /**
     * 定义迷宫
     */
    public static int[][] getMigong(int row, int column) {
        if (row <= 1 || column <= 1) {
            System.out.println("迷宫行列要大于1");
        }
        int[][] migong = new int[row][column];
        for(int i = 0; i < migong.length; i++) {
            migong[i][0] = 1;
            migong[i][column - 1] = 1;
        }
        for(int i = 0; i < column; i++) {
            migong[0][i] = 1;
            migong[row - 1][i] = 1;
        }
        migong[3][1] = 1;
        migong[3][2] = 1;
        migong[2][2] = 1;

        System.out.println("======迷宫======");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                System.out.print(migong[i][j] + " ");
            }
            System.out.println();
        }
        return migong;
    }

    /**
     * 走迷宫
     * @param map: 迷宫地图
     * @param a,b：起始位置
     * 走迷宫的策略：从起始位置开始，下->右->上->左，如果当前位置可以走，就将当前位置标记为2；如果当前位置不能走，就将当前位置标记为3；
     * 走迷宫的策略：从起始位置开始，下->左->上->右，如果当前位置可以走，就将当前位置标记为2；如果当前位置不能走，就将当前位置标记为3；
     * 
     * 注意：这种迷宫路线的查找有很大的效率问题
     */
    public static boolean findPath(int[][] map, int a, int b) {
        if (a < 1 || b < 1) {
            System.out.println("起始位置错误！");
            return false;
        }

        //当前位置标记为2
        map[a][b] = 2;
        if (map[map.length - 2][map[0].length - 2] == 2) {
            System.out.println("=======迷宫路线找到======");
            for(int i = 0; i < map.length; i++) {
                for(int j = 0; j < map[i].length; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
            return true;
        }
        //判断当前位置下一步是否可以走，如果可以走，继续查找；如果各个方向都不能走，当前位置标记为3，并返回上一个位置
        if (map[a + 1][b] == 0 && findPath(map, a + 1, b)) {
            return true;
        } else if (map[a][b - 1] == 0 && findPath(map, a, b - 1)) {
            return true;
        } else if (map[a - 1][b] == 0 && findPath(map, a - 1, b)) {
            return true;
        } else if (map[a][b + 1] == 0 && findPath(map, a, b + 1)) {
            return true;
        } else {
            map[a][b] = 3;
            return false;
        }
    }

    /**
     * 递归调用方法4：汉诺塔
     */
    public static void hanoiTower(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println(a + "->" + c);
        } else {
            // 先将n-1个片，借助c塔，从a移动到b
            hanoiTower(n - 1, a, c, b);
            // 再将a塔的最后一个片移动到c塔
            System.out.println(a + "->" + c);
            // 再将b塔上的片，借助a塔，移动到c塔
            hanoiTower(n-1, b, a, c);
        }
    }

    /**
     * 递归调用方法5：八皇后问题
     * 国际象棋 8*8 棋盘上，摆放8个皇后，任意皇后的同一行、同一列、同一个斜线上没有别的皇后，找出所有符合要求的摆放结果
     * 1.第一行，第一列放一个
     * 2.第二行，判断第一列能不能放；判断第二列能不能放...直到找到第一个能放的列
     * 3.第三行，找到第一个能放的列
     * ...
     * 直到第8行
     * 然后打印当前的结果，返回true
     * 第七行接着找下一个能放的列
     * ...
     */
    public static void eightQueen(int row) {
        List<List<String>> res = new ArrayList<>();
        for(int i = 0; i < row; i++) {
            List<String> resRow = new ArrayList<>();
            for(int j = 0; j < row; j++) {
                resRow.add(".");
            }
            res.add(resRow);
        }

        addQueen(res, 0);
    }

    public static void addQueen(List<List<String>> res, int rowNum) {
        if (rowNum == res.size()) {
            System.out.println(res);
            return;
        }
        for(int j = 0; j < res.size(); j++) {
            // 判断当前(i, j)能不能放皇后，如果能放，就修改数组，继续下一行；如果不能放就返回继续下一个
            if(checkValid(res, rowNum, j)) {
                res.get(rowNum).set(j, "Q");
                addQueen(res, rowNum + 1);
                res.get(rowNum).set(j, ".");
            }
        }
    }

    public static boolean checkValid(List<List<String>> res, int row, int column) {
        // 判断当前行有没有皇后
        if (res.get(row).contains("Q")) {
            return false;
        }
        // 判断当前列有没有皇后
        for(int i = 0; i < res.size(); i++) {
            if (res.get(i).get(column).equals("Q")) {
                return false;
            }
        }
        // 判断两条对角线是否有皇后
        // 右上
        for(int i=row-1,j=column+1; i>=0&&j<res.size(); i--,j++) {
            if (res.get(i).get(j).equals("Q")) {
                return false;
            }
        }
        // 右下
        for(int i=row+1,j=column+1; i<res.size()&&j<res.size(); i++,j++) {
            if (res.get(i).get(j).equals("Q")) {
                return false;
            }
        }
        // 左上
        for(int i=row-1,j=column-1; i>=0&&j>=0; i--,j--) {
            if (res.get(i).get(j).equals("Q")) {
                return false;
            }
        }
        // 左下
        for(int i=row+1,j=column-1; i<res.size()&&j>=0; i++,j--) {
            if (res.get(i).get(j).equals("Q")) {
                return false;
            }
        }
        return true;
    }

}
