package controller;

import com.google.gson.Gson;
import endpoint.NbpEndpoint;
import model.CurrencyHistory;

public class CurrancyController {

    private String name;
    private String startDate;
    private String endDate;


    private NbpEndpoint nbpEndpoint = new NbpEndpoint();
    private Gson gson = new Gson();


    public CurrancyController(String name, String startDate, String endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public CurrencyHistory getHistory() throws Exception {
        return gson.fromJson(nbpEndpoint.sendRequest(name,startDate,endDate),CurrencyHistory.class);
    }
}
