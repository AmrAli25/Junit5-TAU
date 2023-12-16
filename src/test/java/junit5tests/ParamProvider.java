package junit5tests;

import org.junit.jupiter.params.provider.Arguments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ParamProvider {
    static  List<String> sourceString(){
        // Processing done here
        return Arrays.asList("tomato","carrot","cabbage");
    }
    static Stream<String> sourceStringStream(){
        // processing
        return Stream.of("beetroot","apple","pear");
    }

    static List<Arguments> sourceList_StringDouble(){
        //processing
        return Arrays.asList(arguments("tomato",2.0),arguments("carrot",3.5),arguments("pear",7.6));
    }
}
