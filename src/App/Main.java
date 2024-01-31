
//максимально зменшений мейн
package App;

import App.Core.CoreAppStart;

import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CoreAppStart appStart = new CoreAppStart();
        appStart.start();

    }

}
