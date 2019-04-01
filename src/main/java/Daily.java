import java.util.Calendar;

public class Daily {
    private int currDay;
    private int daysLeft;

    Daily(){
        updateDates();
    }

    public int getCurrDay(){
        return currDay;
    }
    public int getDaysLeft(){
        return daysLeft;
    }

    private void updateDates(){
        Calendar cal = Calendar.getInstance();
        currDay = cal.get(Calendar.DAY_OF_MONTH);
        daysLeft = cal.getActualMaximum(Calendar.DAY_OF_MONTH) - currDay + 1;
    }

}
