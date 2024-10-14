import com.juaracoding.Soal3;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Soal3test {
    Soal3 soal3;

    @BeforeTest
    public void setUp() {
        soal3 = new Soal3();
    }

    @DataProvider(name = "evenNumbersProvider")
    public Object[][] evenNumbersProvider() {
        return new Object[][]{
                {2, true}, {3, false}, {4, true}, {5, false}
        };
    }

    @Test(dataProvider = "evenNumbersProvider")
    public void evenNumbers(int input, boolean expected) {
        Assert.assertEquals(soal3.isEven(input), expected, "The isEven() method did not return the expected result for input: " + input);
    }
}
