package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {

    @Override
    public int getCountOfEggsPerMonth() {
        return 1;
    }

    public String getDescription(){
        return super.getDescription() +
                " Моя страна - Russia. Я несу " + getCountOfEggsPerMonth()
                +" яиц в месяц.";
    }
}