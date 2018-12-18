package com.justLearnIT.dao;

import com.justLearnIT.model.TipOfADay;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Repository
public class TipOfADayDAOMocked implements TipOfADayDAO{

    TipOfADay tipOfADay;

    private List<TipOfADay> tips = Arrays.asList(
            new TipOfADay("Pij mleko, bedziesz wielki!"),
            new TipOfADay("Raz i dwa!"),
            new TipOfADay("Jak kawa to tylko bez mleka!"),
            new TipOfADay("Jeśli masz uczyć się reacta dzisiaj to nie rób tego wcale!")
    );

    @Override
    public TipOfADay getRandTip() {
        Random rand = new Random();
        return tips.get(rand.nextInt(tips.size()));
    }
}
