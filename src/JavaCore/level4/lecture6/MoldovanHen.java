package JavaCore.level4.lecture6;

public class MoldovanHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 55;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - " +  Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
