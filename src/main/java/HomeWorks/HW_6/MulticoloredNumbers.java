package HomeWorks.HW_6;

import org.xml.sax.helpers.DefaultHandler;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class MulticoloredNumbers {

    /**
     * 0. Разобраться со всеми принципами
     * 1. Написать класс, который выводит это число другого цвета. Цвет зависит от значения.
     * 1.1 Если число находится в диапазоне [0, 30] - цвет красный
     * 1.2 Если число находится в диапазоне [31, 75] - цвет желтый
     * 1.3 Если число находится в диапазоне [76, 100] - цвет зеленый
     * 1.4 Если число не входит в диапазон [0, 100] - выводим сообщение, что некорректное
     * <p>
     * PS if\else ветвление (т.е. switch) использовать нельзя.
     * <p>
     * Как работать с цветом: https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
     */


    public static void main(String[] args) {

        ColorPrinter colorPrinter = new ColorPrinter();

        colorPrinter.registerColorHandler('R', new ColorPrinter.RedHandler());
        colorPrinter.registerColorHandler('Y', new ColorPrinter.YellowHandler());
        colorPrinter.registerColorHandler('G', new ColorPrinter.GreenHandler());
        colorPrinter.registerColorHandler('D', new ColorPrinter.DefaultHandler());

        colorPrinter.printIndicator(24);  // красный
        colorPrinter.printIndicator(34);  // желтый
        colorPrinter.printIndicator(74);  // желтый
        colorPrinter.printIndicator(95);  // зеленый
        colorPrinter.printIndicator(100); // зеленый
        colorPrinter.printIndicator(-5);  // некорректно
        colorPrinter.printIndicator(101); // некорректно
    }



    static class ColorPrinter {

        public interface ColorHandler {
            void print(int value);
        }

        static class RedHandler implements ColorHandler {
            @Override
            public void print(int value) {
                System.out.println(ColorPrinter.ANSI_RED + value + ColorPrinter.ANSI_RESET);
            }
        }

        static class YellowHandler implements ColorHandler {
            @Override
            public void print(int value) {
                System.out.println(ColorPrinter.ANSI_YELLOW + value + ColorPrinter.ANSI_RESET);
            }
        }

        static class GreenHandler implements ColorHandler {
            @Override
            public void print(int value) {
                System.out.println(ColorPrinter.ANSI_GREEN + value + ColorPrinter.ANSI_RESET);
            }
        }

        static class DefaultHandler implements ColorHandler {
            @Override
            public void print(int value) {
                System.out.println("Некорректное значение: " + value);
            }
        }

        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_GREEN = "\u001B[32m";
        public static final String ANSI_YELLOW = "\u001B[33m";

        private Map<Character, ColorHandler> colorHandlers = new HashMap<>();

        public void registerColorHandler(char colorCode, ColorHandler handler) {
            colorHandlers.put(colorCode, handler);
        }

        public char getColorCode(int value) {
            if (value >= 0 && value <= 30) {
                return 'R';
            } else if (value >= 31 && value <= 75) {
                return 'Y';
            } else if (value >= 76 && value <= 100) {
                return 'G';
            } else {
                return 'D';
            }
        }

        public void printIndicator(int value) {
            char colorCode = getColorCode(value);
            ColorHandler colorHandler = colorHandlers.get(colorCode);
            if (colorHandler != null) {
                colorHandler.print(value);
            } else {
                System.out.println("Некорректный код цвета: " + colorCode);
            }
        }
    }
}


