import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class TicTac extends JComponent {

    public TicTac(){ // Получение значений клика мышки
        enableEvents(AWTEvent.MOUSE_EVENT_MASK);
    }

    @Override
    protected void processMouseEvent(MouseEvent mouseEvent){
        super.processMouseEvent(mouseEvent);
    }

    //Отрисовка поля
    @Override
    protected void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        drawGrid(graphics);
    }

    void drawGrid(Graphics graphics) {
        int w = getWidth(); // Получение ширины игрового поля
        int h = getHeight(); // Получение высоты игрового поля
        int dw = w / 3; // Деление ширины на 3 части
        int dh = h / 3; // Деление высоты на 3 части
        graphics.setColor(Color.BLUE); //Установка цвета линий
        for (int i = 1; i < 3; i++) { // Пробегает по значениям
            graphics.drawLine(0, dh * i, w, dh * i); // Отрисовка горизонтальной линии
            graphics.drawLine(dw * i, 0, dw * i, h); // Отрисовка вертикальной линии
        }
    }
}
