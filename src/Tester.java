
public class Tester {
    public static void main(String[] args) {

        VaccineFileHandler handler = new VaccineFileHandler();

        //  Display existing records from vaccine_records.txt
        handler.readFromFile("vaccine_records.txt");

        //  Add new vaccine records into updated_vaccine_records.txt
        handler.writeToFile("updated_vaccine_records.txt");

        //  Display updated records from updated_vaccine_records.txt
        handler.readFromFile("updated_vaccine_records.txt");
    }
}


