
import java.io.*;


public class Assignment2patterning {
    public static void main(String[] args)  {
     
        try{
          FileInputStream myInputFile = new FileInputStream("yoda.raw");
         int x = 0;
         int y = 0;
         int c = 62;
          int d = 123;
         int [][] ori = new int[c][d];
          int [][] afterOri = new int[c*3][d*3];
            System.out.println(myInputFile.read());
            int value;
      while((value=myInputFile.read())!= -1){
          if (y == 123) {
                    y = 0;
                    x++;
                }
                ori[x][y] = value;
                y++;
      
      }
       for (int i = 0; i < ori.length; i++) {
            System.out.println("");
            for (int j = 0; j < ori[i].length; j++) {
                System.out.printf("%4s",ori[i][j]);
            }
       }
        for (int ax = 0; ax < ori.length; ax++) {
            for (int ay = 0; ay < ori[ax].length; ay++) {
                
//                case 0
                if (ori[ax][ay] >= 0 && ori[ax][ay] <= 25) {
                    afterOri[ax * 3][ay * 3 + 1] = 0;        //2
                    afterOri[ax * 3][ay * 3 + 1] = 0;        //2
                    afterOri[ax * 3][ay * 3 + 1] = 0;        //2
                    afterOri[ax * 3][ay * 3 + 1] = 0;        //2
                    afterOri[ax * 3][ay * 3 + 1] = 0;        //2
                    afterOri[ax * 3][ay * 3 + 1] = 0;        //2
                    afterOri[ax * 3][ay * 3 + 1] = 0;        //2
                    afterOri[ax * 3][ay * 3 + 1] = 0;        //2
                    afterOri[ax * 3][ay * 3 + 2] = 0;        //3
                    afterOri[ax * 3 + 1][ay * 3] = 0;        //4
                    afterOri[ax * 3 + 1][ay * 3 + 1] = 0;    //5
                    afterOri[ax * 3 + 1][ay * 3 + 2] = 0;    //6
                    afterOri[ax * 3 + 2][ay * 3] = 0;        //7
                    afterOri[ax * 3 + 2][ay * 3 + 1] = 0;    //8
                    afterOri[ax * 3 + 2][ay * 3 + 2] = 0;    //9
                }
//                case 1
                if (ori[ax][ay] >= 26 && ori[ax][ay] <= 50) {
                    afterOri[ax * 3][ay * 3] = 0;            //1
                    afterOri[ax * 3][ay * 3 + 1] = 0;        //2
                    afterOri[ax * 3][ay * 3 + 2] = 0;        //3
                    afterOri[ax * 3 + 1][ay * 3] = 0;        //4
                    afterOri[ax * 3 + 1][ay * 3 + 1] = 0;    //5
                    afterOri[ax * 3 + 1][ay * 3 + 2] = 0;    //6
                    afterOri[ax * 3 + 2][ay * 3] = 0;        //7
                    afterOri[ax * 3 + 2][ay * 3 + 1] = 0;    //8
                    afterOri[ax * 3 + 2][ay * 3 + 2] = 255;    //9
                }
                //                case 2
                if (ori[ax][ay] >= 51 && ori[ax][ay] <= 75) {
                    afterOri[ax * 3][ay * 3] = 255;            //1
                    afterOri[ax * 3][ay * 3 + 1] = 0;        //2
                    afterOri[ax * 3][ay * 3 + 2] = 0;        //3
                    afterOri[ax * 3 + 1][ay * 3] = 0;        //4
                    afterOri[ax * 3 + 1][ay * 3 + 1] = 0;    //5
                    afterOri[ax * 3 + 1][ay * 3 + 2] = 0;    //6
                    afterOri[ax * 3 + 2][ay * 3] = 0;        //7
                    afterOri[ax * 3 + 2][ay * 3 + 1] = 0;    //8
                    afterOri[ax * 3 + 2][ay * 3 + 2] = 255;    //9
                }
                //                case 3
                if (ori[ax][ay] >= 76 && ori[ax][ay] <= 100) {
                    afterOri[ax * 3][ay * 3] = 255;            //1
                    afterOri[ax * 3][ay * 3 + 1] = 0;        //2
                    afterOri[ax * 3][ay * 3 + 2] = 255;        //3
                    afterOri[ax * 3 + 1][ay * 3] = 0;        //4
                    afterOri[ax * 3 + 1][ay * 3 + 1] = 0;    //5
                    afterOri[ax * 3 + 1][ay * 3 + 2] = 0;    //6
                    afterOri[ax * 3 + 2][ay * 3] = 0;        //7
                    afterOri[ax * 3 + 2][ay * 3 + 1] = 0;    //8
                    afterOri[ax * 3 + 2][ay * 3 + 2] = 255;    //9
                }
                //                case 4
                if (ori[ax][ay] >= 101 && ori[ax][ay] <= 125) {
                    afterOri[ax * 3][ay * 3] = 255;            //1
                    afterOri[ax * 3][ay * 3 + 1] = 0;        //2
                    afterOri[ax * 3][ay * 3 + 2] = 255;        //3
                    afterOri[ax * 3 + 1][ay * 3] = 0;        //4
                    afterOri[ax * 3 + 1][ay * 3 + 1] = 0;    //5
                    afterOri[ax * 3 + 1][ay * 3 + 2] = 0;    //6
                    afterOri[ax * 3 + 2][ay * 3] = 255;        //7
                    afterOri[ax * 3 + 2][ay * 3 + 1] = 0;    //8
                    afterOri[ax * 3 + 2][ay * 3 + 2] = 255;    //9
                }
                //                case 5
                if (ori[ax][ay] >= 126 && ori[ax][ay] <= 150) {
                    afterOri[ax * 3][ay * 3] = 255;            //1
                    afterOri[ax * 3][ay * 3 + 1] = 0;        //2
                    afterOri[ax * 3][ay * 3 + 2] = 255;        //3
                    afterOri[ax * 3 + 1][ay * 3] = 0;        //4
                    afterOri[ax * 3 + 1][ay * 3 + 1] = 0;    //5
                    afterOri[ax * 3 + 1][ay * 3 + 2] = 0;    //6
                    afterOri[ax * 3 + 2][ay * 3] = 255;        //7
                    afterOri[ax * 3 + 2][ay * 3 + 1] = 255;    //8
                    afterOri[ax * 3 + 2][ay * 3 + 2] = 255;    //9
                }
                //                case 6
                if (ori[ax][ay] >= 151 && ori[ax][ay] <= 175) {
                    afterOri[ax * 3][ay * 3] = 255;            //1
                    afterOri[ax * 3][ay * 3 + 1] = 0;        //2
                    afterOri[ax * 3][ay * 3 + 2] = 255;        //3
                    afterOri[ax * 3 + 1][ay * 3] = 255;        //4
                    afterOri[ax * 3 + 1][ay * 3 + 1] = 0;    //5
                    afterOri[ax * 3 + 1][ay * 3 + 2] = 0;    //6
                    afterOri[ax * 3 + 2][ay * 3] = 255;        //7
                    afterOri[ax * 3 + 2][ay * 3 + 1] = 255;    //8
                    afterOri[ax * 3 + 2][ay * 3 + 2] = 255;    //9
                }
                //                case 7
                if (ori[ax][ay] >= 176 && ori[ax][ay] <= 200) {
                    afterOri[ax * 3][ay * 3] = 255;            //1
                    afterOri[ax * 3][ay * 3 + 1] = 255;        //2
                    afterOri[ax * 3][ay * 3 + 2] = 255;        //3
                    afterOri[ax * 3 + 1][ay * 3] = 255;        //4
                    afterOri[ax * 3 + 1][ay * 3 + 1] = 0;    //5
                    afterOri[ax * 3 + 1][ay * 3 + 2] = 0;    //6
                    afterOri[ax * 3 + 2][ay * 3] = 255;        //7
                    afterOri[ax * 3 + 2][ay * 3 + 1] = 255;    //8
                    afterOri[ax * 3 + 2][ay * 3 + 2] = 255;    //9
                }
                //                case 8
                if (ori[ax][ay] >= 201 && ori[ax][ay] <= 225) {
                    afterOri[ax * 3][ay * 3] = 255;            //1
                    afterOri[ax * 3][ay * 3 + 1] = 255;        //2
                    afterOri[ax * 3][ay * 3 + 2] = 255;        //3
                    afterOri[ax * 3 + 1][ay * 3] = 255;        //4
                    afterOri[ax * 3 + 1][ay * 3 + 1] = 0;    //5
                    afterOri[ax * 3 + 1][ay * 3 + 2] = 255;    //6
                    afterOri[ax * 3 + 2][ay * 3] = 255;        //7
                    afterOri[ax * 3 + 2][ay * 3 + 1] = 255;    //8
                    afterOri[ax * 3 + 2][ay * 3 + 2] = 255;    //9
                }
                //                case 9
                if (ori[ax][ay] >= 226 && ori[ax][ay] <= 255) {
                    afterOri[ax * 3][ay * 3] = 255;            //1
                    afterOri[ax * 3][ay * 3 + 1] = 255;        //2
                    afterOri[ax * 3][ay * 3 + 2] = 255;        //3
                    afterOri[ax * 3 + 1][ay * 3] = 255;        //4
                    afterOri[ax * 3 + 1][ay * 3 + 1] = 255;    //5
                    afterOri[ax * 3 + 1][ay * 3 + 2] = 255;    //6
                    afterOri[ax * 3 + 2][ay * 3] = 255;        //7
                    afterOri[ax * 3 + 2][ay * 3 + 1] = 255;    //8
                    afterOri[ax * 3 + 2][ay * 3 + 2] = 255;    //9
                }
            }

        }
    
        for (int i = 0; i < 186; i++) {
            System.out.println("");
            for (int j = 0; j < 369; j++) {
                System.out.printf("%4s",afterOri[i][j]);
            }
        }
              myInputFile.close();
        }catch(IOException ex){
            System.out.println("File input error");
        
        }
        
    }
}
