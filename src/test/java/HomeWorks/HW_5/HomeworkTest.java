package HomeWorks.HW_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static HomeWorks.HW_5.Homework.*;
import static org.junit.jupiter.api.Assertions.*;

class HomeworkTest {

    @Test
    @Order(1)
    @DisplayName("Проверяет работу contains")
    void containsTest() {
        List<String> list = Arrays.asList("a", "b", "c");

        assertTrue(contains(list, "a"));
        assertFalse(contains(list, "f"));
        assertFalse(contains(new ArrayList<>(), "a"));
    }

    @Test
    @Order(2)
    @DisplayName("Проверяет работу hasExactly")
    void hasExactlyTest() {
        List<String> values1 = Arrays.asList("a");
        List<String> values2 = Arrays.asList("a", "b");

        assertTrue(hasExactly(values1, "a"));
        assertFalse(hasExactly(values2, "a"));
        assertFalse(hasExactly(new ArrayList<>(), "a"));
    }

    @Test
    @Order(3)
    @DisplayName("Проверяет работу unique")
    void uniqueTest() {
        List<String> list1 = Arrays.asList("a", "b", "c");
        List<String> list2 = Arrays.asList("a", "b", "c", "b");
        List<String> uniquelist1 = unique(list1);
        List<String> uniquelist2 = unique(list2);

        assertEquals(3, uniquelist1.size());
        assertTrue(uniquelist1.containsAll(Arrays.asList("a", "b", "c")));
        Assertions.assertEquals(list1, uniquelist1);

        assertEquals(3, uniquelist2.size());
        assertTrue(uniquelist2.containsAll(Arrays.asList("a", "b", "c")));
        assertTrue(uniquelist2.contains("b"));
        assertNotEquals(list2, uniquelist2);
    }
}