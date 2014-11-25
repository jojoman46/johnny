package chap06;

import javax.swing.JOptionPane;
public class Paycheck {

    public static void main(String[] args) {
        
        String hourStr, rateStr, resultStr;
        double hour, rate, result;
        int again;
        do {
            hourStr = JOptionPane.showInputDialog ("Enter number of hours worked: ");
            hour = Double.parseDouble(hourStr);
            rateStr = JOptionPane.showInputDialog ("Enter hourly pay rate for worker: ");
            rate = Double.parseDouble(rateStr);
            if (hour > 40){
                result = (40 * rate) + ((hour - 40) * (rate * 1.5));
            } else {
                result = hour * rate;
            }
            resultStr = "Paycheck is " + result + " dollars.";
            JOptionPane.showMessageDialog (null, resultStr);
            again = JOptionPane.showConfirmDialog(null, "Do Another?");
        }
        while (again == JOptionPane.YES_OPTION);
        
    }
}
