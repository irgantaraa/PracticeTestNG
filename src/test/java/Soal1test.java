import com.juaracoding.Soal1;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Soal1test {
    Soal1 soal1;

    @BeforeTest
    public void setUp() {
        soal1 = new Soal1();
    }

    @Test (priority = 2)
    public void testSoal1() {
        Assert.assertEquals(soal1.x, 10);
    }

    @Test (priority = 1)
    public void testSoal2() {
        boolean actual = soal1.authenticate("TestNG");
        Assert.assertEquals(actual, true);
    }

    @Test(priority = 3)
    public void testSoal3() {
        boolean allEven = true;
        for (double number : soal1.angka){
            if (number % 2 != 0){
                allEven = false;
                break;
            }
        }
        Assert.assertTrue(allEven, "All numbers should be even"); // Asersi ditambahkan
    }
}
