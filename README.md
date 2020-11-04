# software-engineering-basics-3

##  Задание

Написать сценарий для утилиты Apache Ant, реализующий компиляцию, тестирование и упаковку в jar-архив кода проекта из лабораторной работы №3 по дисциплине "Веб-программирование".

Каждый этап должен быть выделен в отдельный блок сценария; все переменные и константы, используемые в сценарии, должны быть вынесены в отдельный файл параметров; MANIFEST.MF должен содержать информацию о версии и о запускаемом классе.

Cценарий должен реализовывать следующие цели (targets):

      compile -- компиляция исходных кодов проекта.

      build -- компиляция исходных кодов проекта и их упаковка в исполняемый jar-архив. Компиляцию исходных кодов реализовать посредством вызова цели compile.

      clean -- удаление скомпилированных классов проекта и всех временных файлов (если они есть).

      test -- запуск junit-тестов проекта. Перед запуском тестов необходимо осуществить сборку проекта (цель build).

      music - воспроизведение музыки по завершению сборки (цель build).

      alt - создаёт альтернативную версию программы с измененными именами переменных и классов (используя задание replace/replaceregexp в файлах параметров) и упаковывает её в jar-архив. Для создания jar-архива использует цель build.

## Под-задание 
Консольное приложение, которое реализует эмуляцию стрельбы в такую область.
   
![График](https://sun9-58.userapi.com/EXSl8c2e0_VgAG8hpwxrrFuOun_ubfCxOhlefA/JNrpcgykabs.jpg)
   
В нём для пользователя необходимо реализовать несколько команд:

      1. help - справка по командам программы
      2. shot  X, Y, R - выстрелить в область радиуса R по координатам X,Y
      3. history - список результатов предыдущих выстрелов
      4. exit выйти из программы


Запуск программы:

      построение проекта антом - ant biuld
   
      смена кодировки на UTF-8 в cmd Windows'а - Chcp 65001
   
<<<<<<< HEAD
      запуск - java -classpath .\bin okladnikov.bool.Main

	  . - корневая директория проекта

=======
      запуск - java -classpath {путь до проекта}\bin okladnikov.bool.Main
>>>>>>> 134f6c9211ba23a41f4109afd7219d3d3a3c5d6b

Требуется иметь ант и джаву на системе.
