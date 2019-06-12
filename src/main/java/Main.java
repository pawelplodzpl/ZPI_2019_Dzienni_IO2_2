import controller.CurrancyController;
import endpoint.NbpEndpoint;
import model.CurrencyHistory;
import model.Rate;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Dziala");

        CurrancyController currancyController = new CurrancyController("gbp","2019-05-31","2019-06-11");
        CurrencyHistory currencyHistory = currancyController.getHistory();
        System.out.println(currencyHistory.getCurrency());


        for(Rate r: currencyHistory.getRates()){
            System.out.println(r.getMid());
        }


    }

}
