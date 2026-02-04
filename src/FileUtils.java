import java.io.*;

public class FileUtils {

    public static Object loadObject(String fileName) {
        Object returnObject = null;

        try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(fileName))) {

            returnObject = objIn.readObject();

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return returnObject;

    }



    public static void saveObject(Object objectToSave, String fileName) {
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut)) {

            objOut.writeObject(objectToSave);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }




    public static void writeTextFile(String textContent, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){

            writer.write(textContent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String readTextFile(String fileName) {
        StringBuilder fileContent = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
           String line;
           while((line = reader.readLine()) != null) {
               fileContent.append(line); // add line to StringBuilder object
           }

        } catch (FileNotFoundException e) {
            System.out.println("File" + fileName + "not found!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return fileContent.toString();

    }
}
