package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test //Сумму всех продаж.
    public void sumOfAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long fact = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, fact);
    }


    @Test //Среднюю сумму продаж в месяц
    public void averageMonthlySales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long fact = service.averageMonthlySales(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(expected, fact);
    }


    @Test //Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*.
    public void peakSalesWithMaximumAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long fact = service.peakSalesWithMaximumAmount(sales);
        long expected = 8;

        Assertions.assertEquals(expected, fact);

    }

    @Test //Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*.
    public void peakSalesWithMinimumAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long fact = service.peakSalesWithMinimumAmount(sales);
        long expected = 9;

        Assertions.assertEquals(expected, fact);
    }

    @Test // Количество месяцев, в которых продажи были ниже среднего (см. п.2).
    public void monthBellowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long fact = service.monthBellowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, fact);

    }

    @Test // Количество месяцев, в которых продажи были выше среднего (см. п.2).
    public void monthAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long fact = service.monthAboveAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, fact);
    }

}