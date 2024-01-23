package junit5tests;

import listeners.Listener;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(Listener.class)
public class AssertionsTest {
    @Test
    void assertEqualTest(){
        assertEquals("first String","Second String", "The string values weren't equal");
    }

    @Test
    void assertEqualListTest(){
        List<String> ExpectedValues = Arrays.asList("firstString","secondString","thirdString");
        List<String> ActualValues = Arrays.asList("firstString","secondString","thirdString");
        assertEquals(ExpectedValues,ActualValues);
    }

    @Test
    void assertArraysEqualTest(){
        int[] arr = {1,3};
        int[] arr2 = {1,2,3};
        assertArrayEquals(arr,arr2);
    }

    @Test
    void assertTrueTest(){
        assertTrue(false,"This is false ");
    }

    @Test
    void assertAllTest(){
        assertAll(
                () -> assertEquals("first String","Second String", "The string values weren't equal"),
                () -> Assertions.assertThrows(NullPointerException.class, null),
                () -> assertTrue(false,"This is false ")
        );
    }

    @Test
    void assertForMapTest(){
        Map<String, Integer> theMap = new HashMap<>();
        theMap.put("firstKey", 1);
        theMap.put("secondKey", 2);
        theMap.put("thirdKey", 3);

        assertThat(theMap, hasKey("secondKey1"));
        assertThat(theMap, hasValue("2"));
    }

    @Test
    void assertForList(){
        List<String> theList = Arrays.asList("firstString", "secondString", "thirdString");
        assertThat(theList, hasItem("thirdString"));
    }
    @Test
    void assertForListAnyOrder(){
        List<String> theList = Arrays.asList("firstString", "secondString", "thirdString");
        assertThat(theList, containsInAnyOrder("thirdString","secondString","firstString"));
    }
}
