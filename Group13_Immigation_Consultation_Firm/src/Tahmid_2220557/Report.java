
package Tahmid_2220557;

public class Report {
    String month;
    int net;

    public Report() {
    }

    public Report(String month, int net) {
        this.month = month;
        this.net = net;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getNet() {
        return net;
    }

    public void setNet(int net) {
        this.net = net;
    }

    @Override
    public String toString() {
        return "Report{" + "month=" + month + ", net=" + net + '}';
    }
    
}
