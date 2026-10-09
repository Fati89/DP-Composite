package benakka;

import benakka.composite.File;
import benakka.composite.Folder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Folder folder=new Folder("/");
        folder.addChild(new File("Test.java"));
        folder.addChild(new File("config.xml"));

        Folder sousFolder = new Folder("/Pattern Desing");
        folder.addChild(sousFolder);
        sousFolder.addChild(new File("Strategy.java"));
        sousFolder.addChild(new File("Composite.java"));
        sousFolder.addChild(new File("Adapter.java"));

        folder.print();
    }
}
