package HomeWorks.HW_5;

import java.util.*;

public class Homework {
/**
 * Потренироваться в написании тестов.
 * <p>
 * 1. Подключить зависимость(dependency) на junit (см. семниар).
 * Для подключения у вас должен быть создан maven-проект.
 * 2. Написать тест-кейсы для методов ниже.
 * На каждый из методов должно быть несколько сценариев.
 */

    /**
     * Возвращает true, если в values присутствует значение value
     */
    public static boolean contains(List<String> values, String value) {
        for (String v : values) {
            if (Objects.equals(value, v)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Возвращает true, если в values РОВНО 1 элемент и он равен value
     * // ["a", "b"], "a" -> false
     * // ["a"], "a" -> true
     */
    public static boolean hasExactly(Collection<String> values, String value) {
        Iterator<String> iterator = values.iterator();
        return iterator.hasNext() && Objects.equals(iterator.next(), value) && !iterator.hasNext();
    }

    /**
     * Возвращает только уникальные элементы из values.
     */
    public static List<String> unique(List<String> values) {
        return List.copyOf(Set.copyOf(values));
    }

}