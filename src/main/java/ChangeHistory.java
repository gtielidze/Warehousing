
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gio
 */
public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        double max = 0.0;
        for (int i = 0; i < history.size(); i++) {
            if (history.get(i) > max) {
                max = history.get(i);
            }
        }
        return max;
    }

    public double minValue() {
        double min = history.get(0);
        if (history.isEmpty()) {
            min = 0.0;
        }
        for (int i = 0; i < history.size(); i++) {
            if (history.get(i) < min) {
                min = history.get(i);
            }
        }
        return min;
    }

    public double average() {
        double sum = 0.0;
        for (int i = 0; i < history.size(); i++) {
            sum += history.get(i);
        }
        return sum / history.size();        
    }

    public String toString() {
        return this.history.toString();
    }

}
