package managers;

import org.apache.commons.io.FileUtils;
import utils.GameLogger;

import java.io.File;
import java.io.IOException;

public class FilesManager {
    private final File dir, configFile;
    private final String userDir = System.getProperty("user.home");
    private final GameLogger logger = GameLogger.getLogger();

    public FilesManager(){
        dir = new File(userDir+"/WF-Bot");
        configFile = new File(dir+"/config.json");

        if (!dir.exists()){
            dir.mkdir();
            try {
                FileUtils.copyURLToFile(getClass().getResource("/config.json"), configFile);
            } catch (IOException e) {
                logger.warning("Wystąpił błąd podczas kopiowania plików. Możesz to zgłosić na: \n");
            }
        }
    }
}
