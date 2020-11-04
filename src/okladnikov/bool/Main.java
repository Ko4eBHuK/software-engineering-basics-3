package okladnikov.bool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int spaceSymbolIndex;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ShotCollector shotsHistory = new ShotCollector();

        System.out.println("Данное консольное приложение реализует эмуляцию стрельбы в область согласно варианту 13444." +
                "\nДоступные команды:");
        System.out.println("help - справка по командам программы;");
        System.out.println("shot X, Y, R - выстрелить в область радиуса R по координатам X,Y;");
        System.out.println("history - список результатов предыдущих выстрелов;");
        System.out.println("exit - выйти из программы;");

        String commandFirstWord = "";
        String command = "";
        do{
            command = br.readLine().trim();
            spaceSymbolIndex = command.indexOf(" ");

            //получение первого слова команды
            if(spaceSymbolIndex == -1) commandFirstWord = command;
            else commandFirstWord = command.substring(0, spaceSymbolIndex);

            switch (commandFirstWord) {
                case "help":
                    System.out.println("help - справка по командам программы;");
                    System.out.println("shot X, Y, R - выстрелить в область радиуса R по координатам X,Y;");
                    System.out.println("history - список результатов предыдущих выстрелов;");
                    System.out.println("exit - выйти из программы;");
                    break;
                case "shot":
                    try {
                        ShotData shot = new ShotData();

                        //выделение икса из команды
                        command = command.substring(spaceSymbolIndex + 1);
                        spaceSymbolIndex = command.indexOf(" ");
                        shot.setAbscissa(Double.parseDouble(command.substring(0, spaceSymbolIndex - 1)));

                        //выделение игрека из команды
                        command = command.substring(spaceSymbolIndex + 1);
                        spaceSymbolIndex = command.indexOf(" ");
                        shot.setOrdinate(Double.parseDouble(command.substring(0, spaceSymbolIndex - 1)));

                        //выделение радиуса из команды
                        command = command.substring(spaceSymbolIndex + 1);
                        spaceSymbolIndex = command.indexOf(" ");
                        shot.setRadius(Double.parseDouble(command));

                        //проверка попадания
                        ShotChecker.checkShot(shot);

                        //добавление шота в историю
                        shotsHistory.addShot(shot);

                        //вывод результата
                        System.out.println(shot.getResult() ? "Попадание." : "Цель не поражена.");
                    } catch (Exception e) {
                        System.out.println("Параметры команды заданы некорректно.");
                    }
                    break;
                case "history":
                    if(shotsHistory.shotsCount() != 0){
                        shotsHistory.showShotsHistory();
                    } else {
                        System.out.println("Ещё не прогремел ни один выстрел.");
                    }
                    break;
                case "exit":
                    //do nothing
                    break;
                default:
                    System.out.println("Такой команды не предусмототрено.");
                    break;
            }
        } while(!command.equals("exit"));
    }
}
