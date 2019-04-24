package com.candal.example;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.candal.example.config.YAMLConfig;


//@SpringBootApplication
public class Application4 { //implements CommandLineRunner {
//
//	@Autowired
//	private YAMLConfig myConfig;
//
//	public static void main(String[] args) {
//		SpringApplication app = new SpringApplication(Application4.class);
//		app.run();
//	}
//
//	public void run(String... args) throws Exception {
//
//		System.out
//				.println("IDPcertificate: " + myConfig.getExternalFilesNames().getIdentityProvider().getCertificate());
//
//		System.out.println("SPcertificate: " + myConfig.getExternalFilesNames().getServiceProvider().getCertificatex());
//		System.out.println("SPPrivateKey: " + myConfig.getExternalFilesNames().getServiceProvider().getPrivateKey());
//
//		Map<String, AttributeItem> attributeList = myConfig.getAttributes()
//				.getIdentityProvider().getAttributeItems();
//		
//		 for (Map.Entry<String, AttributeItem> item : attributeList.entrySet()) {
//			 String key =  item.getKey();
//			 System.out.println("Item:[" + key + "]");
//			 AttributeItem obj =  item.getValue();
//			 System.out.println("Item:[" + obj.getAttr() + "]");
//
//		//System.out.println("Item:[" + item.getName() + "].[" + item.getAttr() + "].[" + item.getGroup() + "]");
//	}
//		
////		List<YAMLConfig.Attributes.IdentityProvider.AttributeItems> AttributeList = myConfig.getAttributes()
////				.getIdentityProvider().getAttributeItems();
////
////		for (YAMLConfig.Attributes.IdentityProvider.AttributeItems item : AttributeList) {
////			System.out.println("Item:[" + item.getName() + "].[" + item.getAttr() + "].[" + item.getGroup() + "]");
////		}
//	}
}
