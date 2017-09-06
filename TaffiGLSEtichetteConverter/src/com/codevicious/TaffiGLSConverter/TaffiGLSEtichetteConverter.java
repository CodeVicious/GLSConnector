package com.codevicious.TaffiGLSConverter;

import java.awt.BorderLayout;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import javax.print.attribute.standard.PrinterLocation;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.xml.rpc.ServiceException;

import org.apache.axis.message.MessageElement;

import com.gls_italy.weblabeling.IlsWebServiceLocator;
import com.gls_italy.weblabeling.IlsWebServiceSoap;
import com.gls_italy.weblabeling.ListSpedResponseListSpedResult;
import com.univocity.parsers.common.ParsingContext;
import com.univocity.parsers.common.processor.BeanListProcessor;
import com.univocity.parsers.common.processor.ObjectRowProcessor;
import com.univocity.parsers.common.processor.RowListProcessor;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;

public class TaffiGLSEtichetteConverter {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		JPanel panel = new JPanel(new BorderLayout());

		// The settings object provides many configuration options
		CsvParserSettings parserSettings = new CsvParserSettings();

		// You can configure the parser to automatically detect what line
		// separator sequence is in the input
		parserSettings.setLineSeparatorDetectionEnabled(true);
		parserSettings.setHeaderExtractionEnabled(true);

		parserSettings.getFormat().setDelimiter(';');
		// BeanListProcessor converts each parsed row to an instance of a given
		// class, then stores each instance into a list.
		BeanListProcessor<Etichetta> rowProcessor = new BeanListProcessor<Etichetta>(Etichetta.class);

		// You can configure the parser to use a RowProcessor to process the
		// values of each parsed row.
		// You will find more RowProcessors in the
		// 'com.univocity.parsers.common.processor' package, but you can also
		// create your own.
		parserSettings.setRowProcessor(rowProcessor);

		// Let's consider the first parsed row as the headers of each column in
		// the file.
		parserSettings.setHeaderExtractionEnabled(true);

		// creates a parser instance with the given settings
		CsvParser parser = new CsvParser(parserSettings);

		// the 'parse' method will parse the file and delegate each parsed row
		// to the RowProcessor you defined

		TaffiCsvReader reader = new TaffiCsvReader("resources/ExpCorrieriNew.csv");
		parser.parse(reader.getReader());

		List<Etichetta> beans = rowProcessor.getBeans();
		// get the parsed records from the RowListProcessor here.
		// Note that different implementations of RowProcessor will provide
		// different sets of functionalities.

		IlsWebServiceLocator locator = new IlsWebServiceLocator();
		try {
			IlsWebServiceSoap glsWebService = locator.getIlsWebServiceSoap();
			String XMLInfoParcel;
			String sedeGls;
			String codiceClienteGls;
			String passwordClienteGls;
			ListSpedResponseListSpedResult result = new ListSpedResponseListSpedResult();
			result = glsWebService.listSped("LI", "50294", "50294");
			MessageElement[] message = result.get_any();
			System.out.println(message.toString());
			
			// glsWebService.addParcel(XMLInfoParcel);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Unable to reach GLS Service: " + e.getMessage());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
