package lesson4;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Computer> computersList = new ArrayList<>();
        computersList.add(new Computer(
                "G201",
                2013,
                2000,
                new HardDisk(
                        "DO123",
                        Disk.HDD,
                        500,
                        Country.Chine),
                new Processor(
                        "i7",
                        8,
                        4.27,
                        Country.USA)
        ));
        computersList.add(new Computer(
                "Loka",
                2019,
                3921,
                new HardDisk(
                        "Sal9123",
                        Disk.SSD,
                        750,
                        Country.India),
                new Processor(
                        "AMD 131",
                        12,
                        5.31,
                        Country.India)
        ));

        computersList.add(new Computer(
                "Pentium 4",
                2006,
                300,
                new HardDisk(
                        "AMD g254",
                        Disk.HDD,
                        250,
                        Country.Chine),
                new Processor(
                        "Intel Pentium",
                        1,
                        2.11,
                        Country.Korea)
        ));
        computersList.add(new Computer(
                "Pentium 45",
                2017,
                2900,
                new HardDisk(
                        "Ilo-M23",
                        Disk.SSD,
                        189,
                        Country.USA),
                new Processor(
                        "Intel Pentium",
                        45,
                        3.67,
                        Country.USA)
        ));

        computersList.add(new Computer(
                "OktenWeb 2000",
                2034,
                1000001,
                new HardDisk(
                        "Serhiy-202",
                        Disk.SSD,
                        9500023,
                        Country.Korea),
                new Processor(
                        "Victor-007",
                        102,
                        43.09,
                        Country.Korea)
        ));
        computersList.add(new Computer(
                "Logitech M35",
                2015,
                7201,
                new HardDisk(
                        "Bulea-A20",
                        Disk.SSD,
                        320,
                        Country.India),
                new Processor(
                        "AMD-L202",
                        12,
                        3.79,
                        Country.USA)
        ));
        computersList.add(new Computer(
                "Logitech M35",
                2015,
                7201,
                new HardDisk(
                        "Bulea-A20",
                        Disk.SSD,
                        502,
                        Country.India),
                new Processor(
                        "i7",
                        12,
                        3.79,
                        Country.USA)
        ));
        computersList.add(new Computer(
                "Samsung P201",
                2021,
                1890,
                new HardDisk(
                        "Lopast-K702",
                        Disk.SSD,
                        1000,
                        Country.Chine),
                new Processor(
                        "i7",
                        12,
                        3.79,
                        Country.USA)
        ));
        computersList.add(new Computer(
                "Apple P201",
                2020,
                29999,
                new HardDisk(
                        "IHard-001",
                        Disk.SSD,
                        120,
                        Country.Chine),
                new Processor(
                        "Iproc",
                        4,
                        1.29,
                        Country.Chine)
        ));
        computersList.add(new Computer(
                "Kol-1",
                2018,
                2901,
                new HardDisk(
                        "Pipel99",
                        Disk.HDD,
                        1020,
                        Country.India),
                new Processor(
                        "Iproc",
                        12,
                        3.1,
                        Country.Korea)
        ));
        computersList.add(new Computer(
                "P12",
                2009,
                1011,
                new HardDisk(
                        "S@01",
                        Disk.HDD,
                        611,
                        Country.India),
                new Processor(
                        "i7",
                        6,
                        2.4,
                        Country.Chine)
        ));
        computersList.add(new Computer(
                "Loka",
                2017,
                31,
                new HardDisk(
                        "Kita",
                        Disk.HDD,
                        750,
                        Country.India),
                new Processor(
                        "AMD 131",
                        10,
                        2.31,
                        Country.Korea)
        ));

        computersList.add(new Computer(
                "Pentium 2000",
                2000,
                2000,
                new HardDisk(
                        "AMD 2000",
                        Disk.HDD,
                        2000,
                        Country.Chine),
                new Processor(
                        "Intel Pentium",
                        2,
                        2.00,
                        Country.Korea)
        ));
        computersList.add(new Computer(
                "Pentium 01",
                1982,
                1599,
                new HardDisk(
                        "Upiter11",
                        Disk.HDD,
                        2,
                        Country.USA),
                new Processor(
                        "pentium 2",
                        2,
                        1.01,
                        Country.USA)
        ));

        computersList.add(new Computer(
                "Terminator 2",
                1991,
                1000001,
                new HardDisk(
                        "T-800",
                        Disk.SSD,
                        50000,
                        Country.USA),
                new Processor(
                        "CSM 101",
                        99,
                        24,
                        Country.USA)
        ));
        computersList.add(new Computer(
                "HP",
                2012,
                600,
                new HardDisk(
                        "Kik200",
                        Disk.HDD,
                        500,
                        Country.Chine),
                new Processor(
                        "i5",
                        8,
                        1.8,
                        Country.Chine)
        ));
        computersList.add(new Computer(
                "Lenovo 201",
                2005,
                2001,
                new HardDisk(
                        "Bulka-21",
                        Disk.SSD,
                        101,
                        Country.Korea),
                new Processor(
                        "i7",
                        2,
                        3.79,
                        Country.USA)
        ));
        computersList.add(new Computer(
                "Samsung P201",
                2015,
                2197,
                new HardDisk(
                        "Lopast-K702",
                        Disk.SSD,
                        511,
                        Country.Chine),
                new Processor(
                        "i7",
                        12,
                        3.79,
                        Country.USA)
        ));
        computersList.add(new Computer(
                "Apple P201",
                2020,
                29999,
                new HardDisk(
                        "IHard-001",
                        Disk.SSD,
                        120,
                        Country.Chine),
                new Processor(
                        "Iproc",
                        4,
                        1.29,
                        Country.Chine)
        ));
        computersList.add(new Computer(
                "Kol-1",
                2018,
                2901,
                new HardDisk(
                        "Pipel99",
                        Disk.SSD,
                        1020,
                        Country.India),
                new Processor(
                        "i7",
                        12,
                        3.1,
                        Country.Korea)
        ));
        //1. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
//        List<Computer> filter1 = computersList
//                .stream()
//                .filter(c -> c.getYear() > 2010)
//                .collect(Collectors.toList());
//
//        for (Computer computer : filter1) {
//            System.out.println(computer);
//        }
        //2. Знайти всі комп'ютери які мають рік випуску більше ніж 2010

        // TODO: 21.08.2020 Не коректне питання бо в компютерів не має по завданю поля року випуску.
        //  Тому я зробив по року випуску жорсткого диску
//        List<Computer> filter2 = computersList
//                .stream()
//                .filter(c -> c.getYear() > 2010 && c.getDisk().getCountry().equals(Country.Chine))
//                .collect(Collectors.toList());
//
//        for (Computer computer : filter2) {
//            System.out.println(computer);
//        }
        //3. Знайти всі комп'ютери які мають рік випуску більше ніж 2010
        //та країну виробник дисків не Китай

//        List<Computer> filter3 = computersList
//                .stream()
//                .filter(c -> c.getYear() > 2010 && !c.getDisk().getCountry().equals(Country.Chine))
//                .collect(Collectors.toList());
//
//        for (Computer computer : filter3) {
//            System.out.println(computer);
//        }
//        4. Знайти всі комп'ютери які мають жорсткий диск більше 500гб

//                List<Computer> filter4 = computersList
//                .stream()
//                .filter(c -> c.getDisk().getSizeDisk() > 500)
//                .collect(Collectors.toList());
//
//        for (Computer computer : filter4) {
//            System.out.println(computer);
//        }
//        5. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб та процессор і7
//        List<Computer> filter5 = computersList
//                .stream()
//                .filter(c -> c.getDisk().getSizeDisk() > 500 &&
//                        c.getDisk().getDiskType().equals(Disk.SSD) &&
//                        c.getProcessor().getType().equals("i7"))
//                .collect(Collectors.toList());
//
//        for (Computer computer : filter5) {
//            System.out.println(computer);
//        }
//        6. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб
//        та процессор і7 посортувати за ціною

        List<Computer> filter6 = computersList
                .stream()
                .filter(c -> c.getDisk().getSizeDisk() > 500 &&
                        c.getDisk().getDiskType().equals(Disk.SSD) &&
                        c.getProcessor().getType().equals("i7"))
                .collect(Collectors.toList());
        Collections.sort(filter6);
        for (Computer computer : filter6) {
            System.out.println(computer);
        }
    }


}
