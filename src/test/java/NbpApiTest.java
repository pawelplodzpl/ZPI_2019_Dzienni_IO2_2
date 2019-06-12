import org.junit.jupiter.api.Test;

public class NbpApiTest {

    @Test
    public void shouldReturnSameJson(){
        String ExpectedJson = "{\"table\":\"A\",\"currency\":\"funt szterling\",\"code\":\"GBP\",\"rates\":[{\"no\":\"108/A/NBP/2019\",\"effectiveDate\":\"2019-06-05\",\"mid\":4.8221},{\"no\":\"109/A/NBP/2019\",\"effectiveDate\":\"2019-06-06\",\"mid\":4.8274}]}";
    }

}
