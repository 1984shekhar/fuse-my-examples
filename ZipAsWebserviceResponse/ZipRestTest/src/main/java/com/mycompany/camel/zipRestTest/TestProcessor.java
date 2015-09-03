package com.mycompany.camel.zipRestTest;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

public class TestProcessor implements Processor{

	private Logger log = Logger.getLogger(this.getClass());
	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		Path path1 = Paths.get("/home/cpandey/NotBackedUp/Development/Out/test.xml");
		byte[] data1 = Files.readAllBytes(path1);
		
		Path path2 = Paths.get("/home/cpandey/NotBackedUp/Development/Out/test1.txt");
		byte[] data2 = Files.readAllBytes(path2);
		ArrayList<byte[]> files = new ArrayList<>();
		files.add(data1);
		files.add(data2);
		byte[] out = zipFiles(files); 
		exchange.getOut().setBody(out, byte[].class);
	}
	
	private byte[] zipFiles(ArrayList<byte[]> files) throws IOException {
		log.info(files.size());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ZipOutputStream zos = new ZipOutputStream(baos);
		int i = 0;

		for (byte[] pdf : files) {
			ZipEntry entry = new ZipEntry("doc_" + i++ + ".pdf");
			entry.setSize(pdf.length);
			log.info("Pdf len: " + pdf.length);
			zos.putNextEntry(entry);
			zos.write(pdf);
			zos.closeEntry();
		}
		baos.flush();
		zos.close();
		baos.close();
		return baos.toByteArray();

	}

}
