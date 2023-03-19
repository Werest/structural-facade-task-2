import static java.lang.Integer.parseInt;
import static java.lang.Long.toBinaryString;

public class BinOps {
    public String sum(String a, String b) {
        /*Переведите числа из двоичной записи в
            строках в int, сложите и переведите
            обратно в двоичную запись*/
        int result = parseInt(a, 2) + parseInt(b, 2);

        return toBinaryString(result);
    }

    public String mult(String a, String b) {
        /*Переведите числа из двоичной записи в
            строках в int, перемножьте и переведите
            обратно в двоичную запись*/
        int result = parseInt(a, 2) * parseInt(b, 2);

        return toBinaryString(result);
    }
}