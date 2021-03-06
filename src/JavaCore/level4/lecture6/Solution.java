package JavaCore.level4.lecture6;

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        hen.getDescription();
        System.out.println(hen.getDescription());

        Hen hen1 = HenFactory.getHen(Country.MOLDOVA);
        hen1.getCountOfEggsPerMonth();
        System.out.println(hen1.getDescription());

        Hen hen2 = HenFactory.getHen(Country.RUSSIA);
        hen2.getCountOfEggsPerMonth();
        System.out.println(hen2.getDescription());

        Hen hen3 = HenFactory.getHen(Country.UKRAINE);
        hen3.getCountOfEggsPerMonth();
        System.out.println(hen3.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            switch (country) {
                case Country.BELARUS:
                    hen = new BelarusianHen();
                    break;
                case Country.MOLDOVA:
                    hen = new MoldovanHen();
                    break;
                case Country.RUSSIA:
                    hen = new RussianHen();
                    break;
                case Country.UKRAINE:
                    hen = new UkrainianHen();
                    break;
            }
            return hen;
        }
    }
}
