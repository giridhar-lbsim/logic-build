package com.kmd.program;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class CSVReader {

	public static void main(String[] args) {
		readDataFromCSV();
		System.out.println("File created successfully.....");
	}

	private static void readDataFromCSV() {
		String csvFile = "/tmp/country.csv";
		String line = "";
		String csvSplitBy = ",";
		File file = new File("/tmp/result.csv");
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			int totalExpence = 0;
			int count = 0;
			while ((line = br.readLine()) != null) {
				String[] data = line.split(csvSplitBy);
				if (count == 0) {
					count++;
					continue;
				}
				else {
					totalExpence = totalExpence + Integer.valueOf(data[3]);
				}
			}
			writeDataIntoCSV(br, file, totalExpence);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void writeDataIntoCSV(BufferedReader br, File result, int totalExpence) {

		try (FileWriter outputfile = new FileWriter(result)) {
			//String[] line = br.readLine().split(",");
			CSVWriter writer = new CSVWriter(outputfile);
			String[] header = { "Company", "Total Monthly Expences on Salary" };
			String[] data = { "UHG", String.valueOf(totalExpence) };
			writer.writeNext(header);
			writer.writeNext(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
