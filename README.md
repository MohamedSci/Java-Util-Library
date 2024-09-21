# Java Util Library

This Java library provides a collection of utility functions for common tasks. 

## Functionalities

Here's a list of functionalities provided by the library:

* **File Handling:**
    * `get_file_pathes_in_a_folder(String folderPath)`: This function retrieves a list of all file paths within a specified folder.
* **JSON Processing:**
    * `group_json_by_key(String jsonString, String key)`: This function groups a JSON string by a specified key.
    * `merge_json_files(List<String> filePaths)`: This function merges multiple JSON files into a single JSON object.
    * `one_csv_many_jsons(String csvPath, String outputDir)`: This function converts a CSV file into multiple JSON files, one for each row in the CSV.
    * `replace_key_in_json(String jsonString, String oldKey, String newKey)`: This function replaces a key within a JSON string.
* **Text Processing:**
    *  *fetch_api_request(String url)*: This function fetches data from an API using a GET request. (likely makes an HTTP GET request to a URL)
* **Video Processing:**
    * `video_language_conversion(String videoPath, String targetLanguage)`: This function converts the language of a video file (likely translates the audio track).
    * `video_maker(String imagePath, String text)`: This function creates a video from an image and text.

## Usage

The library is intended to be used as a dependency in other Java projects. You can add the library to your project using a build tool like Maven or Gradle.

## Documentation

More detailed documentation for each function, including usage examples and parameter descriptions, will be added soon.
