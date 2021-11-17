package core.basesyntax.shop.strategy;

import core.basesyntax.shop.ReadFromFile;
import core.basesyntax.shop.impl.ReadFromCsvFile;

public class FileReadStrategy {
    public static ReadFromFile chooseReadFileFormat(String filename) {
        String extension = filename.replaceAll("(.+\\.(\\w+))","$2").toLowerCase();
        switch (extension) {
            case "csv":
                return new ReadFromCsvFile();
            default:
                throw new RuntimeException("Invalid file type");
        }
    }
}