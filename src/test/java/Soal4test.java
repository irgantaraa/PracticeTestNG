import com.juaracoding.Soal4;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Soal4test {

    Soal4 soal4;

    @BeforeClass
    public void setUp() {
        soal4 = new Soal4();
    }

    @Test
    public void testSoal4() {
    int actual = soal4.divide(4,2);
        Assert.assertEquals(actual, 2);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testinputNilai() {
        soal4.inputnilai(0);
    }

    @Test (expectedExceptions = ArithmeticException.class)
    public void testinputNilai2() {
        soal4.divide(2,0);
    }
}
