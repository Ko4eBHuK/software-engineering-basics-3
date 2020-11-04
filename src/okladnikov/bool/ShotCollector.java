package okladnikov.bool;

import java.util.ArrayList;

public class ShotCollector {

    private ArrayList<ShotData> shots;

    public ShotCollector() {
        shots = new ArrayList<ShotData>();
    }

    public void addShot(ShotData shot) {
        shots.add(shot);
    }

    public int shotsCount() {
        return shots.size();
    }

    public void showShotsHistory() {
        for(ShotData shot: shots) {
            System.out.println("x=" + shot.getAbscissa() +
                            " y=" + shot.getOrdinate() +
                            " r=" + shot.getRadius() +
                            " result=" + (shot.getResult() ? "Попадание" : "Цель не поражена"));
        }
    }
}
