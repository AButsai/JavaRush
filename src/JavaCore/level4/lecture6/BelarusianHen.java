package JavaCore.level4.lecture6;

public class BelarusianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 56;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " +  Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
