/*
 * Name: Antonio Zea Jr.
 * Course: CS500
 * Assignment: PP 4.8
 */
import java.text.DecimalFormat;

public class Duration
{
    private int startHour,endHour,startMinute,endMinute;
    private DecimalFormat fmt= new DecimalFormat("00");
    
    public Duration(int startH, int startM, int endH, int endM)
    {
        startHour=startH%24;
        endHour=endH%24;
        startMinute=startM%60;
        endMinute=endM%60;
    }
    
    public int getStartHour()
    {
        return startHour;
    }
    
    public int getEndHour()
    {
        return endHour;
    }
    
    public int getStartMinute()
    {
        return startMinute;
    }
    
    public int getEndMinute()
    {
        return endMinute;
    }
    
    public void setDuration(int startH, int startM, int endH, int endM)
    {
        startHour=startH%24;
        endHour=endH%24;
        startMinute=startM%60;
        endMinute=endM%60;
    }
    
    public void setStartH(int startH)
    {
        startHour=startH%24;
    }
    
    public void setEndH(int endH)
    {
        endHour=endH%24;
    }
    
    public void setStartM(int startM)
    {
        startMinute=startM%60;
    }
    
    public void setEndM(int endM)
    {
        endMinute=endM%60;
    }
    
    public int length()
    {
        return Math.abs((startHour*60+startMinute)-(endHour*60+endMinute));
    }
    
    public String toString()
    {
        return "["+fmt.format(startHour)+":"
                  +fmt.format(startMinute)+","
                  +fmt.format(endHour)+":"
                  +fmt.format(endMinute)+"]";
    }
}