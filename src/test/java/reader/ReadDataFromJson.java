package reader;

import com.google.gson.Gson;
import data.DataModel;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*public class ReadDataFromJson {
 //Dh lazm tb2a gwa function
 //Dh elfile ely by2ra mn json file
 public DataModel readJsonFile() throws FileNotFoundException {
FileReader fileReader=new FileReader("data/testData.json");
DataModel dataModel=new Gson().fromJson(fileReader,DataModel.class);//B2lo any b3ml model fe elclass dh
// w btakhod elfilr ely h2ra mno w elclass ely hmodel feh
return dataModel;
 }
 public static DataModel dataModal() throws FileNotFoundException {
  ReadDataFromJson readDataFromJson = new ReadDataFromJson();
  return readDataFromJson.readJsonFile();
}}
*/

import com.google.gson.Gson;
import data.DataModel;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadDataFromJson {

 public DataModel readJsonFile() throws FileNotFoundException {

  FileReader fileReader = new FileReader("data/testData.json");

  DataModel dataModel = new Gson().fromJson(fileReader, DataModel.class);

  return dataModel;
 }

 public static DataModel dataModal() throws FileNotFoundException {
  ReadDataFromJson readDataFromJson = new ReadDataFromJson();
  return readDataFromJson.readJsonFile();
 }


}