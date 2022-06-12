import javax.swing.*;
import java.awt.*;

//Создание основного класса
public class Main {
    public static void main(String[] args) {
        System.out.println("Запуск..."); //Вывод текста
        JFrame window = new JFrame("Крестик-Нолик"); //Название окна
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Добавление кропки Х(Закрытие)
        window.setSize(400,400); //Размеры окна
        window.setLayout(new BorderLayout()); //Менеджер компановки
        window.setLocationRelativeTo(null); // Центральное позиционирование
        window.setVisible(true); // Включение видимости окна
        TicTac game = new TicTac(); // Создание обьекта класса
        window.add(game); // Добавление в окно
        System.out.println("Конец");
    }
}