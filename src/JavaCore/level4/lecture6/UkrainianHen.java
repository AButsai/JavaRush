package JavaCore.level4.lecture6;

public class UkrainianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 60;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " +  Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
