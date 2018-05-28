public class MagicSquaresInGrid {
    public int numMagicSquaresInside(int[][] grid) {
        int count = 0;
        int target = (int) Math.pow(2, 9) -1;
        for (int i = 0; i <= grid.length - 3; i++) {
            for (int j = 0; j <= grid[i].length - 3; j++) {
                int gridCount = 1;
                int firstsum = 0;
                int secandSume = 0;
                int [] a = new int[3];
                int [] b = new int[3];
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        gridCount |= (1 << (grid[k][l]-1));
                        a[k - i] += grid[k][l];
                        b[l - j] += grid[k][l];
                        if ((k-i) - (l - j) == 0){
                            firstsum += grid[k][l];
                        }
                        if ((k-i) + (l - j) == 2){
                            secandSume += grid[k][l];
                        }
                    }
                }
                if (gridCount == target && firstsum == secandSume && a[0] == a[1] && a[1] == a[2] && b[0] == b[1] && b[1] == b[2])
                    count++;
            }
        }

        return  count;

    }

    public static void main(String[] args) {
        System.out.println(new MagicSquaresInGrid().numMagicSquaresInside(new int [] [] {{5,4,7,8,5,4,6,8,2,9},{5,3,6,8,1,5,1,1,8,5},{8,9,6,8,4,7,3,4,9,1},{9,3,8,9,2,8,3,8,7,1},{1,1,1,7,3,3,9,1,8,7},{1,5,5,7,1,6,7,9,3,4},{2,3,3,8,8,1,1,6,5,7},{7,8,5,4,7,9,4,6,5,3},{8,5,2,7,1,3,7,2,8,9},{4,9,4,3,9,4,5,4,7,1}}));
    }
}
