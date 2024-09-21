package generate_keys_from_map_list;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class generate_keys_from_map_list {
    String jsonFilePath = "C:\\Users\\moham\\OneDrive\\Desktop\\zekr\\single_zekr_dataset\\single_zekr_dataset.json"; // Path to your JSON file
    String csvFilePath = "C:\\Users\\moham\\OneDrive\\Desktop\\zekr\\single_zekr_dataset\\single_zekr_dataset_keys.csv"; // Path to your output CSV file

    public static void main(String[] args) {
        try {
            // Read JSON file
            FileReader reader = new FileReader("your_file_path.json");
            JSONObject jsonObject = new JSONObject(reader);
            reader.close();

            // Iterate through keys and values
            JSONArray otherList = new JSONArray();
            for (String key : jsonObject.keySet()) {
                Object value = jsonObject.get(key);
                // Check if the value is a JSONArray and has a length <= 2
                if (value instanceof JSONArray && ((JSONArray) value).length() <= 2) {
                    // Add the value to otherList
                    otherList.put(value);
                    // Remove the key-value pair from the main JSON object
                    jsonObject.remove(key);
                }
            }

            // Add otherList to the main JSON object
            jsonObject.put("other", otherList);

            // Write the modified JSON object back to the file
            FileWriter writer = new FileWriter("your_output_file.json");
            writer.write(jsonObject.toString(4)); // Indented output for better readability
            writer.close();
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
    }
}