import java.io.*;

public class MatrixDataHandler {
    private int[][] matrix;
    private int h;
    private int w;
    private String filename;

    public MatrixDataHandler(int h, int w, String filename) throws IOException {
        this.h = h;
        this.w = w;
        this.filename = filename;
        matrix = new int[h][w];

        try (FileWriter fw = new FileWriter(filename)) {
            fw.write(h + " " + w + "\n");
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    fw.write(matrix[i][j] + " ");
                }
                fw.write("\n");
            }
        }
    }

    public int getValueFromPosition(int posH, int posW) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();
            h = Integer.parseInt(line.split(" ")[0]);
            w = Integer.parseInt(line.split(" ")[1]);

            for (int i = 0; i < h; i++) {
                line = br.readLine();
                for (int j = 0; j < w; j++) {
                    matrix[i][j] = Integer.parseInt(line.split(" ")[j]);
                }
            }
            return matrix[posH][posW];
        }
    }

    public void modifyValueAndUpdateFile(int posH, int posW, int val) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename));
             FileWriter fw = new FileWriter(filename)) {

            String line = br.readLine();
            h = Integer.parseInt(line.split(" ")[0]);
            w = Integer.parseInt(line.split(" ")[1]);

            for (int i = 0; i < h; i++) {
                line = br.readLine();
                if (line != null) { // add null check
                    for (int j = 0; j < w; j++) {
                        matrix[i][j] = Integer.parseInt(line.split(" ")[j]);
                    }
                }
            }
            matrix[posH][posW] = val;

            fw.write(h + " " + w + "\n");
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    fw.write(matrix[i][j] + " ");
                }
                fw.write("\n");
            }
        }
    }
}


//modificari de implementat:
//tratare caz in care a fost modificat fisierul
//separare in diferite metode -> citire matrice din fisier; ->scriere matrice in fisier; ->alocare spatiu matrice
//tratare exceptii

//public class MatrixDataHandler {
//    private int[][] matrix;
//    private int h;
//    private int w;
//    private String filename;
//    public MatrixDataHandler(int h, int w, String filename) {
//        this.h = h;
//        this.w = w;
//        this.filename = filename;
//        matrix = new int[h][];
//        for (int i = 0; i < h; i++) {
//            matrix[i] = new int[w];
//        }
//
//        try {
//            FileWriter fw = new FileWriter(filename);
//            fw.write(h + " " + w + "\n");
//            for (int i = 0; i < h; i++) {
//                for (int j = 0; j < w; j++) {
//                    fw.write(matrix[i][j] + " ");
//                }
//                fw.write("\n");
//            }
//            fw.close();
//        } catch (IOException exception) {
//            System.out.println(exception.getMessage());
//        }
//    }
//
//    public int getValueFromPosition(String filename, int posH, int posW) {
//        try {
//            // !!!
//            BufferedReader br = new BufferedReader(new FileReader(filename));
//            String line = br.readLine();
//            h = Integer.parseInt(line.split(" ")[0]);
//            w = Integer.parseInt(line.split(" ")[1]);
//
//            for (int i = 0; i < h; i++) {
//                line = br.readLine();
//                for (int j = 0; j < w; j++) {
//                    matrix[i][j] = Integer.parseInt(line.split(" ")[j]);
//                }
//            }
//            br.close();
//            return matrix[posH][posW];
//        } catch (IOException exception) {
//            System.out.println(exception.getMessage());
//            return -1;
//        }
//    }
//
//    public void modifyValueAndUpdateFile(String filename, int posH, int posW, int val) {
//        try {
//            // !!!
//            BufferedReader br = new BufferedReader(new FileReader(filename));
//            String line = br.readLine();
//            h = Integer.parseInt(line.split(" ")[0]);
//            w = Integer.parseInt(line.split(" ")[1]);
//
//            for (int i = 0; i < h; i++) {
//                line = br.readLine();
//                for (int j = 0; j < w; j++) {
//                    matrix[i][j] = Integer.parseInt(line.split(" ")[j]);
//                }
//            }
//            br.close();
//            matrix[posH][posW] = val;
//            FileWriter fw = new FileWriter("matrix.txt");
//            fw.write(h + " " + w + "\n");
//            for (int i = 0; i < h; i++) {
//                for (int j = 0; j < w; j++) {
//                    fw.write(matrix[i][j] + " ");
//                }
//                fw.write("\n");
//            }
//            fw.close();
//        } catch (IOException exception) {
//            System.out.println(exception.getMessage());
//        }
//    }
//}
