import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

class Singleton{
    private static Singleton instance = new Singleton();
    
    private Singleton() {
    }
    
    public String str;
    
    static Singleton getSingleInstance() {
        return instance;
    }
}
