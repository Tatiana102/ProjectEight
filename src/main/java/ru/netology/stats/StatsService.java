package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long finalsale = 0;
        for (long sale : sales) {
            finalsale += sale;
        }
        return finalsale;
    }

    public long averageMonthlySales(long[] sales) {
        long finalsale = 0;
        for (long sale : sales) {
            finalsale += sale;
        }
        long avarageSale = finalsale / 12;
        return avarageSale;
    }

    public int peakSalesWithMaximumAmount(long[] sales) {
        int monthMaximum = 0;
        long saleMaximum = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMaximum) {
                monthMaximum = i;
                saleMaximum = sales[i];
            }
        }
        return monthMaximum + 1;
    }

    public int peakSalesWithMinimumAmount(long[] sales) {
        int monthMinimum = 0;
        long saleMinimum = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= saleMinimum) {
                monthMinimum = i;
                saleMinimum = sales[i];
            }
        }
        return monthMinimum + 1;
    }

    public int monthBellowAverage(long[] sales) {
        int counter = 0;

        for (long sale : sales) {
            if (sale < averageMonthlySales(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int monthAboveAverage(long[] sales) {
        int counter = 0;

        for (long sale : sales) {
            if (sale > averageMonthlySales(sales)) {
                counter++;
            }
        }
        return counter;
    }
}