package com.mycompany.camel.zipRest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import com.mycompany.camel.zipRestTest.ProduceZip;

/**
 * A bean which we use in the route
 */
public class HelloBean{

   
	private Logger log = Logger.getLogger(this.getClass());
    public void hello() throws FileNotFoundException, IOException {
    	HttpPost post = new HttpPost("http://localhost:9000/zip/docs");
    	HttpClient httpclient = new DefaultHttpClient();
    	HttpResponse response = httpclient.execute(post);
    	//ByteArrayInputStream
    	log.info("Status: "+response.getStatusLine().getStatusCode());
/*    	HttpEntity obj = response.getEntity();
    	OutputStream outstream = null;
		obj.writeTo(outstream);*/
    	System.out.println(response.getParams());
		byte[] content = EntityUtils.toByteArray(response.getEntity());
    	//inputStream.
    	//ZipInputStream zipStream = new ZipInputStream(new ByteArrayInputStream(byteArray));
    	ZipInputStream zipStream = new ZipInputStream(new ByteArrayInputStream(content));
    	ZipEntry entry = null;
    	while ((entry = zipStream.getNextEntry()) != null) {
    		System.out.println("Within loop");
    		log.info("EntryName:"+ entry.getSize());
    	    String entryName = entry.getName();
    	    log.info("EntryName: "+entryName);
    	    FileOutputStream out = new FileOutputStream("/home/cpandey/"+entryName);

    	    byte[] byteBuff = new byte[4096];
    	    int bytesRead = 0;
    	    while ((bytesRead = zipStream.read(byteBuff)) != -1)
    	    {
    	        out.write(byteBuff, 0, bytesRead);
    	    }
    	    out.close();
    	    zipStream.closeEntry();
    	}
    	zipStream.close(); 
    	System.out.println("Out of loop");
    	//String location = resp.getMetadata().getFirst("Location").toString();
    }
    


/*public static byte[] getBytesFromInputStream(InputStream is) throws IOException
{
    try (ByteArrayOutputStream os = new ByteArrayOutputStream();)
    {
        byte[] buffer = new byte[0xFFFF];

        for (int len; (len = is.read(buffer)) != -1;)
            os.write(buffer, 0, len);

        os.flush();

        return os.toByteArray();
    }
}
*/


}
