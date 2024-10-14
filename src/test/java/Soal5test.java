import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.juaracoding.Soal5;

public class Soal5test {
    Soal5 soal5;

    @BeforeClass
    public void setUp() {
        soal5 = new Soal5();
        System.out.println("Tes Dimulai");
    }

    @Test
    public void testString() {
        boolean actual = soal5.verifikasi("TestNG");
        Assert.assertTrue(actual);
    }

    @Test
    public void testArray() {
        Assert.assertEquals(soal5.angka.length,4,"panjang array tidak sesuai");
    }

    @Test
    public void testNilaiVariable() {
        Assert.assertTrue(soal5.nilai > 50, "nilai kurang dari 50");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Tes Selesai");
    }

}
