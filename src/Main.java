import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder log = new StringBuilder();
        //1
        createDirectory("/Users/vitalijsmelev/Games/src/", log);
        createDirectory("/Users/vitalijsmelev/Games/res/", log);
        createDirectory("/Users/vitalijsmelev/Games/savegames/", log);
        createDirectory("/Users/vitalijsmelev/Games/temp/", log);

        //2
        createDirectory("/Users/vitalijsmelev/Games/src/main/", log);
        createDirectory("/Users/vitalijsmelev/Games/src/test/", log);

        //3
        createFile("/Users/vitalijsmelev/Games/src/main/", "Main.java", log);
        createFile("/Users/vitalijsmelev/Games/src/main/", "Utils.java", log);

        //4
        createDirectory("/Users/vitalijsmelev/Games/res/drawables/", log);
        createDirectory("/Users/vitalijsmelev/Games/res/vectorsDirectory/", log);
        createDirectory("/Users/vitalijsmelev/Games/res/icons/", log);

        //5
        createFile("/Users/vitalijsmelev/Games/temp/", "temp.txt", log);

        System.out.println(log);
    }

    private static boolean createDirectory(String directoryPath, StringBuilder log) {
        File directory = new File(directoryPath);
        directory.mkdir();
        log.append("Директория \"" + directoryPath + "\" успешно создана.\n");
        return true;
    }

    private static boolean createFile(String directoryPath, String fileName, StringBuilder log) {
        File file = new File(directoryPath, fileName);
        try {
            file.createNewFile();
            log.append("Файл \"" + directoryPath + "\" успешно создан.\n");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            log.append("Файл \"" + directoryPath + "\" не создан.\n");
            return false;
        }
    }
}
