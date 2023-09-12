package org.example;

import com.opencsv.CSVReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Reader {
    private static final String PATH = "/home/paul/WnW/marketing/market4.09-08.09.csv";
    private static List<String> monList = new ArrayList<>();
    private static List<Integer> monTimeList = new ArrayList<>(Arrays.asList(1));
    private static List<Integer> tueTimeList = new ArrayList<>(Arrays.asList(1,2,2,1,1,1));
    private static List<Integer> wedTimeList = new ArrayList<>(Arrays.asList(2,4,3,3));
    private static List<Integer> thuTimeList = new ArrayList<>(Arrays.asList(1,1,1,1,1,1));
    private static List<Integer> friTimeList = new ArrayList<>(Arrays.asList(3,2,1,1,3,1));


    private static List<String> tueList = new ArrayList<>();
    private static List<String> wedList = new ArrayList<>();
    private static List<String> thuList = new ArrayList<>();
    private static List<String> friList = new ArrayList<>();
    private static List<String> satList = new ArrayList<>();
    private static List<String> sunList = new ArrayList<>();


    public static void main(String[] args) {
        Collections.sort(monTimeList);
        try (BufferedReader csvReader = new BufferedReader(new FileReader(PATH))) {
            String row;
            while ((row = csvReader.readLine()) != null) {
                String[] data = row.split(";");
                for (String str : data) {
                    if (str.contains("Mon")) {
                        monList.add(str);
                    } else if (str.contains("Tue")) {
                        tueList.add(str);
                    } else if (str.contains("Wed")) {
                        wedList.add(str);
                    } else if (str.contains("Thu")) {
                        thuList.add(str);
                    } else if (str.contains("Fri")) {
                        friList.add(str);
                    } else if (str.contains("Sat")) {
                        satList.add(str);
                    } else if (str.contains("Sun")) {
                        sunList.add(str);

                    }
                }

            }
        } catch (Exception e) {
            e.fillInStackTrace();
        }
        System.out.println(monList.size() + "  " + tueList.size() + "  " + wedList.size() + "  " + thuList.size() + "  " + friList.size()+" " + satList.size()+ " " + sunList.size());
       try(FileWriter fw = new FileWriter("list.txt")) {

       }catch (Exception e){
           e.fillInStackTrace();
       }
        System.out.println("Понедельник");
        getTimePeriud(monList);
        System.out.println("Вторник");
        getTimePeriud(tueList);
        System.out.println("Среда");
        getTimePeriud(wedList);
        System.out.println("Четверг");
        getTimePeriud(thuList);
        System.out.println("Пятница");
        getTimePeriud(friList);
        System.out.println("Суббота");
        getTimePeriud(satList);
        System.out.println("Воскресенье");
        getTimePeriud(sunList);
        System.out.println("Медиана для понедельника: " + getMedian(monTimeList));
        System.out.println("Медиана для вторника: " + getMedian(tueTimeList));
        System.out.println("Медиана для среды: " + getMedian(wedTimeList));
        System.out.println("Медиана для четверга: " + getMedian(thuTimeList));
        System.out.println("Медиана для пятницы: " + getMedian(friTimeList));

    }

    public static void getTimePeriud(List<String> list) {
        int eightToNine = 0;
        int nineToten = 0;
        int tenToEleven = 0;
        int other = 0;
        int elevenToTwelve = 0;
        int twelveToHour = 0;
        int hourToTwo = 0;
        int twoTothree = 0;
        int threeToFour = 0;
        int fourToFive = 0;
        int fiveToSixPm = 0;
        int sixToSevenPM = 0;
        int sevenToEqghtPm = 0;
        int eightToNinePm = 0;
        int nineToTenPm = 0;
        int tenToEvenPm = 0;
        int elevenToTwelvePm = 0;
        int twelweToHourPm = 0;
        int hourToTwoPM = 0;

        for (String str : list) {
            String times = str.substring(16, 21);
            SimpleDateFormat stFormatStandrt = new SimpleDateFormat("HH:mm");
            SimpleDateFormat strFormatForLong = new SimpleDateFormat("HHmm");
            Date startDate;
            try (FileWriter fw = new FileWriter("note.txt", true)) {
                startDate = stFormatStandrt.parse(times);
                String newDateString = strFormatForLong.format(startDate);
                long parsadate = Long.parseLong(newDateString);

                if (parsadate >= 800 && parsadate < 900) {
                    eightToNine++;
                } else if (parsadate >= 900 && parsadate < 1000) {
                    nineToten++;
                } else if (parsadate >= 1000 && parsadate < 1100) {
                    tenToEleven++;
                } else if (parsadate >= 1100 && parsadate < 1200) {
                    elevenToTwelve++;
                } else if (parsadate >= 1200 && parsadate < 1300) {
                    twelveToHour++;
                } else if (parsadate >= 1300 && parsadate < 1400) {
                    hourToTwo++;
                } else if (parsadate >= 1400 && parsadate < 1500) {
                    twoTothree++;
                } else if (parsadate >= 1500 && parsadate < 1600) {
                    threeToFour++;
                } else if (parsadate >= 1600 && parsadate < 1700) {
                    fourToFive++;
                } else if (parsadate >= 1700 && parsadate < 1800) {
                    fiveToSixPm++;
                } else if (parsadate >= 1800 && parsadate < 1900) {
                    sixToSevenPM++;
                } else if (parsadate >= 1900 && parsadate < 2000) {
                    sevenToEqghtPm++;
                } else if (parsadate >= 2000 && parsadate < 2100) {
                    eightToNinePm++;
                } else if (parsadate >= 2100 && parsadate < 2200) {
                    nineToTenPm++;
                } else if (parsadate >= 2200 && parsadate < 2300) {
                    tenToEvenPm++;
                } else if (parsadate >= 2300 && parsadate < 2359) {
                    elevenToTwelvePm++;
                }else if(parsadate >= 0 && parsadate < 100) {
                    twelweToHourPm++;
                }else if(parsadate >= 100 && parsadate < 200){
                    hourToTwoPM++;
                } else {
                    other++;

                }


            } catch (Exception e) {
                e.fillInStackTrace();
            }

        }
        System.out.println("c 8 до 9: " + eightToNine);
        System.out.println("c 9 до 10: " + nineToten);
        System.out.println("c 10 до 11: " + tenToEleven);
        System.out.println("c 11 до 12: " + elevenToTwelve);
        System.out.println("c 12 до 13: " + twelveToHour);
        System.out.println("c 13 до 14: " + hourToTwo);
        System.out.println("c 14 до 15: " + twoTothree);
        System.out.println("c 15 до 16: " + threeToFour);
        System.out.println("c 16 до 17: " + fourToFive);
        System.out.println("c 17 до 18: " + fiveToSixPm);
        System.out.println("c 18 до 19: " + sixToSevenPM);
        System.out.println("c 19 до 20: " + sevenToEqghtPm);
        System.out.println("c 20 до 21: " + eightToNinePm);
        System.out.println("c 21 до 22: " + nineToTenPm);
        System.out.println("c 22 до 23: " + tenToEvenPm);
        System.out.println("c 23 до 00: " + elevenToTwelvePm);
        System.out.println("c 00 до 1: " +twelweToHourPm);
        System.out.println("c 1 до 2: " + hourToTwoPM);

        System.out.println("остальные: " + other);
    }

    public static double getMedian(List<Integer> timeList) {
        if (timeList.isEmpty()) {
            return 0;
        }
        List<Integer> copyArr = new ArrayList<>(timeList);
        Collections.sort(copyArr);
        if (copyArr.size() % 2 == 0) {
            return ((copyArr.get(copyArr.size() / 2) + copyArr.get(copyArr.size() / 2 - 1)) / 2f);
        }

        return copyArr.get(copyArr.size() / 2);
    }

}