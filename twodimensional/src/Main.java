public class Main {
        public static void main(String[] args) {
          int rows=4;
          int columns=4;
          int [][] arr=new int[rows][columns];
          int value=1;
          for(int i=0;i<rows;i++)
              for (int j = 0; j < columns; j++) {
                  arr[i][j] = value;
                  value++;
              }
            System.out.println("hey its two dimensional arrays");
            for(int i=0;i<rows;i++){
                for(int j=0;j<columns;j++){
                    System.out.print( arr[i][j]);
                }
                System.out.println();
            }
        }
    }
