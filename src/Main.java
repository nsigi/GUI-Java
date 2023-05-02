import functions.*;
import functions.basic.*;
import functions.meta.*;
import gui.FunctionParametersDialog;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
        } catch (FunctionPointIndexOutOfBoundsException | IllegalArgumentException | IllegalStateException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
