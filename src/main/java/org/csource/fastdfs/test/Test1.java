
package org.csource.fastdfs.test;

import java.io.*;
import java.net.*;
import java.util.*;
import org.csource.common.*;
import org.csource.fastdfs.*;

public class Test1
{
  public static void main(String args[])
  {
  	try
  	{

//		Test1.class.getClassLoader().getResourceAsStream("fdfs_client.conf");

		String filePath = Test1.class.getClassLoader().getResource("fdfs_client.conf").getFile();

		ClientGlobal.init("G:/own_application/java_application/admin_service/target/classes/fdfs_client.conf");
		System.out.println("network_timeout=" + ClientGlobal.g_network_timeout + "ms");
		System.out.println("charset=" + ClientGlobal.g_charset);
  		
		TrackerGroup tg = new TrackerGroup(new InetSocketAddress[]{new InetSocketAddress("192.168.31.218", 22122)});
		TrackerClient tc = new TrackerClient(tg);
		
		TrackerServer ts = tc.getConnection();
		if (ts == null)
		{
			System.out.println("getConnection return null");
			return;
		}

		StorageServer ss = tc.getStoreStorage(ts);
		if (ss == null)
		{
			System.out.println("getStoreStorage return null");
		}
		
		StorageClient1 sc1 = new StorageClient1(ts, ss);


//		for(int i=0;i<50;i++){
			System.out.println(new Date());
			NameValuePair[] meta_list = null;  //new NameValuePair[0];
			String item = "G:/README.txt";
			String fileid = sc1.upload_file1(item, "txt", meta_list);

			System.out.println("Upload local file "+item+" ok, fileid="+fileid);
//		}

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	
	}
}
