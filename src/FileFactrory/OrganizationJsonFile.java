package FileFactrory;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;

import java.io.File;
import java.io.IOException;

public class OrganizationJsonFile implements JsonFile {
    @Override
    public JSONArray getFile() {
        File file = new File("/Users/senthuran/Downloads/SearchAPP/src/organizations.json");
        file.exists();
        String content = null;
        try {
            content = FileUtils.readFileToString(file, "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONArray userJsonArray = new JSONArray(content);
        return userJsonArray;
    }
}
