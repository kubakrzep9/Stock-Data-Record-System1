package com.example.demo.morningpanic.entities;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;


@Entity
@Table(name="technical_indicator_behavior")
public class TechnicalIndicatorBehaviorEntity {
    public double price;
    public String time;
    public String type;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "technical_indicator_behavior_generator")
    @SequenceGenerator(name="technical_indicator_behavior_generator", sequenceName = "tib_seq", allocationSize = 1)
    public int indicatorId;

    public int dataId;

    @Transient
    public static List<String> types = Arrays.asList("VWAP Bounce", "Bullish VWAP Crossover", "Bullish EMA Crossover", "Bullish MACD Histogram Crossover");

    public TechnicalIndicatorBehaviorEntity(double price, String time, String type){
        this.price = price;
        this.time = time;
        this.type = type;
    }

    public static boolean validate_type(String str){ return types.contains(str); }

    public String toString(){
        return "price: "+price+"\n"+
                "time: "+time+"\n"+
                "type: "+type+"\n";
    }
}