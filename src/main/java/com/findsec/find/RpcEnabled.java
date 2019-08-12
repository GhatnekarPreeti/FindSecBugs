package com.findsec.find;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

public class RpcEnabled {

	void test() {
		try {
			XmlRpcClient client; 
			client = new XmlRpcClient();
			XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
			config.setServerURL(new URL("http://127.0.0.1:" + "/RPC2"));
			config.setEnabledForExtensions(true);
			client.setConfig(config);
		} catch (MalformedURLException e) {
		}
	}
}
