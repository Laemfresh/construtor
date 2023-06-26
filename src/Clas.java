import java.util.Arrays;

public class Clas {
    int number ;
    String word;
    int array[];

    public Clas(){

    }

    public Clas(int number, String word, int[] array) {
        this.number = number;
        this.word = word;
        this.array = array;
    }

    @Override
    public String toString() {
        return "Clas " +
                "\n number = " + number +
                "\n word = " + word +
                "\n array = " + Arrays.toString(array) ;
    }
}
