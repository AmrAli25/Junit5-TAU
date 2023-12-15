package junit5tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTests {

    @ParameterizedTest(name = "Run : {index} - value : {arguments}")
    @ValueSource(ints = {1, 5, 60})
    void intValues(int theparam){
        System.out.println("theparam = " + theparam);
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"FirstString", "SecondString"})
    void strinfValues(String theparam){
        System.out.println("theparam = " + theparam);
    }

    @ParameterizedTest
    @CsvSource(value = {"steve,rogers","captain,marvel","bucky,barnes"})
    void csvSource_String(String param1, String param2){
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
    }

    @ParameterizedTest
    @CsvSource(value = {"steve,32,true","captain,21,false","bucky,33,true"})
    void csv_StringIntBool(String param1, int param2, boolean param3){
        System.out.println("param1 = " + param1 + ", param2 = " + param2 + ", param3 = " + param3);
    }

    @ParameterizedTest
    @CsvSource(value = {"captain america,'steve,rogers'","winter soldier,'bucky,barnes'"})
    void csv_StringWithComma(String param1, String param2){
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
    }

    @ParameterizedTest
    @CsvSource(value = {"steve?rogers","bucky?barnes"},delimiter = '?')
    void csv_StringWithDelimiter(String param1, String param2){
        System.out.println("param1 = " + param1 + ", param2 = " + param2);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/params/shoppinglist.csv", numLinesToSkip = 1, delimiterString = "___")
    void csvFileSource_StringDoubleIntStringString(String name, Double price, int qty, String uom, String provider){
        System.out.println("name = " + name + ", price = " + price + ", qty = " + qty + ", uom = " + uom +
                ", provider = " + provider);
    }
}
