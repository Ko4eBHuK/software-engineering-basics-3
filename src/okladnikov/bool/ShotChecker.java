package okladnikov.bool;

public class ShotChecker {

    public static void checkShot(ShotData shot) {

        if ( shot.getRadius() >= 0 ) {
            if ( shot.getAbscissa() >= 0 ) {
                if ( shot.getOrdinate() > 0 ) {
                    shot.setResult(shot.getOrdinate() <= -2 * shot.getAbscissa() + shot.getRadius());
                } else {
                    shot.setResult(shot.getOrdinate() >= - shot.getRadius() / 2 && shot.getAbscissa() <= shot.getRadius());
                }
            } else {
                if ( shot.getOrdinate() >= 0 ) {
                    shot.setResult(shot.getAbscissa() * shot.getAbscissa() + shot.getOrdinate() * shot.getOrdinate() <= shot.getRadius() * shot.getRadius() / 4);
                } else {
                    shot.setResult(false);
                }
            }
        } else {
            if ( shot.getAbscissa() <= 0 ) {
                if ( shot.getOrdinate() < 0 ) {
                    shot.setResult(shot.getOrdinate() >= -2 * shot.getAbscissa() + shot.getRadius());
                } else {
                    shot.setResult(shot.getOrdinate() <= -shot.getRadius() / 2 && shot.getAbscissa() >= shot.getRadius());
                }
            } else {
                if ( shot.getOrdinate() <= 0 ) {
                    shot.setResult(shot.getAbscissa() * shot.getAbscissa() + shot.getOrdinate() * shot.getOrdinate() <= shot.getRadius() * shot.getRadius() / 4);
                } else {
                    shot.setResult(false);
                }
            }
        }

        //return  shot;
    }

}
