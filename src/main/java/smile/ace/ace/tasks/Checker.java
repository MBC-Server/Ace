package smile.ace.ace.tasks;

import org.bukkit.Bukkit;
import org.bukkit.Chunk;

import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Vector;

public class Checker implements Runnable{

    Vector<Float> tps = new Vector<>();
    Vector<Float> mspt = new Vector<>();
    Vector<Float> memPercent = new Vector<>();

    @Override
    public void run() {


    }


    private void msptcheck() {
        DecimalFormat df = new DecimalFormat("#.00");// 保留小数点后两位
        double mspt = Double.parseDouble(df.format(Bukkit.getTickTimes()[0] / 1000000));
    }

    private void memcheck() {
        // 内存百分比
        double ratio = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (double) Runtime.getRuntime().maxMemory() * 100;
    }

    private void tpscheck() {
        int tps = (int) Bukkit.getTPS()[0];
    }


}
