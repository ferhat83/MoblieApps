package dataBase;

import database.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectMySql {

    public static String filePath = "D:\\Team10MobileApp\\NYP\\src\\test\\resources\\sercret.properties";
    static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static void insertDataInDB(){
        List<String> list = getItemValue();
        connectToSqlDB.insertDataFromArrayListToSqlTable(list,"NYPList","items",filePath);
    }
    public static List<String> getItemValue(){
        List<String> itemList = new ArrayList<String>();
        itemList.add("soccer");
        itemList.add(("news"));
        itemList.add(("manhattan"));
        itemList.add("trump");
        itemList.add("obama");
        itemList.add("brooklyn");

        return itemList;
    }
    public List<String> getItemListFromDB() throws Exception, IOException, SQLException, ClassNotFoundException{
        List<String> list = new ArrayList<String>();
        list = connectToSqlDB.readDataBase("NYPList","items",filePath);
        return list ;
    }
    public static void main(String[] args) throws Exception, IOException, SQLException, ClassNotFoundException {

            //insertDataInDB();

        // *********read from DB********
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        List<String> list = connectToSqlDB.readDataBase("NYPList","items",filePath);
        for(String st:list){
            System.out.println(st);
        }
    }
}
