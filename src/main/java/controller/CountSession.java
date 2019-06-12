package controller;

import model.Rate;

import java.time.LocalDate;
import java.util.List;

public class CountSession {

    public int countGrowthSessions(List<Rate> rates) {

        int countOfGrowthSessions = 0;

        for (int ratesCounter = 0; ratesCounter < rates.size() - 1; ratesCounter++) {
            if (rates.get(ratesCounter).getMid() < rates.get(ratesCounter + 1).getMid())
                countOfGrowthSessions++;
        }
        return countOfGrowthSessions;
    }

    public int countDecliningSessions(List<Rate> rates) {

        int countOfDecliningSessions = 0;

        for (int ratesCounter = 0; ratesCounter < rates.size() - 1; ratesCounter++) {
            if (rates.get(ratesCounter).getMid() > rates.get(ratesCounter + 1).getMid())
                countOfDecliningSessions++;
        }
        return countOfDecliningSessions;
    }

    public int countStaticSessions(List<Rate> rates) {

        int countOfStaticSSessions = 0;

        for (int ratesCounter = 0; ratesCounter == rates.size() - 1; ratesCounter++) {
            if (rates.get(ratesCounter).getMid() > rates.get(ratesCounter + 1).getMid())
                countOfStaticSSessions++;
        }
        return countOfStaticSSessions;
    }

}
