import controller.CountSession;
import controller.CurrancyController;
import endpoint.NbpEndpoint;
import model.CurrencyHistory;
import model.Rate;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Dziala");

        CountSession countSession = new CountSession();

        CurrancyController currancyController = new CurrancyController("gbp","2019-05-31","2019-06-11");
        CurrencyHistory currencyHistory = currancyController.getHistory();
        System.out.println(currencyHistory.getCurrency());

        for(Rate r: currencyHistory.getRates()){
            System.out.println(r.getMid());
        }



        System.out.println("Liczba sesji wzrostowych: " + countSession.countGrowthSessions(currencyHistory.getRates()));
        System.out.println("Liczba sesji spadkowych: " + countSession.countDecliningSessions(currencyHistory.getRates()));
        System.out.println("Liczba sesji stałych: " + countSession.countStaticSessions(currencyHistory.getRates()));


    }

}
