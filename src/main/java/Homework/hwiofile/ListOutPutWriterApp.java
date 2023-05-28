package Homework.hwiofile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOutPutWriterApp {

    public static void main(String[] args) throws IOException {

        String testString = "This is my first experience when I myself work with IO API";
        String myTestString = "Hello";

        List<String> myList = new ArrayList<>();
        ListOutputWriter listOutputWriter = new ListOutputWriter(myList);
        listOutputWriter.write(testString);
        listOutputWriter.write(myTestString);

    }
}
