import java.util.Arrays;
void main() {
    int [][]a = {{1,2,3},{4,5,6},{7,8}};
    IO.println(Arrays.toString(a));
    Zeilen(a);
    spalten(a);
    diagonale(a);
}
void Zeilen(int [][]a){
    for(int zeile =0;zeile<a.length;zeile++) {
        int summe = 0;
        for (int j = 0; j < a[zeile].length; j++) {
            summe += a[zeile][j];
        }
        IO.println("Zeile "+(zeile+1)+": "+summe);
    }
}
void spalten(int [][]a){
    for(int spaltze =0;spaltze<a.length;spaltze++) {
        int summe = 0;
        for (int j = 0; j < a[spaltze].length; j++) {
            summe += a[j][spaltze];
        }
        IO.println("Spalte "+(spaltze+1)+": "+summe);
    }
}
void diagonale(int [][]a){
        for (int start = 0; start < a.length; start++) {
            int summe = 0;

            int zeile = start;
            int spalte = 0;

            while (zeile < a.length && spalte < a[zeile].length) {
                summe += a[zeile][spalte];

                zeile++;
                spalte++;
            }

            IO.println("Diagonale ab (" + start + ",0): " + summe);
        }
}