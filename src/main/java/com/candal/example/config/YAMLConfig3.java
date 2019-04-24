package com.candal.example.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/*
 * Note: getters and setters must be same name of yml names
 * example: MyApplication, my_application, my-application
 * getMyApplication() , setMyApplication()
 */

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties("saml")
public class YAMLConfig3 {

	private ExternalFilesNames externalFilesNames = new ExternalFilesNames();
	private Attributes attributes = new Attributes();

	public ExternalFilesNames getExternalFilesNames() {
		return externalFilesNames;
	}

	public Attributes getAttributes() {
		return attributes;
	}
	
	public static class ExternalFilesNames {

		private IdentityProvider identityProvider = new IdentityProvider();
		private ServiceProvider serviceProvider = new ServiceProvider();

		public IdentityProvider getIdentityProvider() {
			return identityProvider;
		}

		public ServiceProvider getServiceProvider() {
			return serviceProvider;
		}

		public static class IdentityProvider {

			private String certificate;

			public String getCertificate() {
				return certificate;
			}

			public void setCertificate(String certificate) {
				this.certificate = certificate;
			}

		}

		public static class ServiceProvider {

			private String privateKey;
			private String certificate;

			public String getPrivateKey() {
				return privateKey;
			}

			public String getCertificatex() {
				return certificate;
			}

			public void setPrivateKey(String privateKey) {
				this.privateKey = privateKey;
			}

			public void setCertificate(String certificate) {
				this.certificate = certificate;
			}
		}
	}

	public static class Attributes {
		
		private IdentityProvider identityProvider = new IdentityProvider();
		//private ServiceProvider serviceProvider = new ServiceProvider();

		public IdentityProvider getIdentityProvider() {
			return identityProvider;
		}

		public static class IdentityProvider {
			
			private List<AttributeItems> attributeItems = new ArrayList<>();

			public List<AttributeItems> getAttributeItems() {
				return attributeItems;
			}

			public void setAttributeItems(List<AttributeItems> attributeItems) {
				this.attributeItems = attributeItems;
			}
			
			public static class AttributeItems {
				
				private String key;
				private String name;
				private String attr;
				private String group;

				public String getKey() {
					return key;
				}
				
				public void setKey(String key) {
					this.key = key;
				}

				public String getName() {
					return name;
				}
				
				public void setName(String name) {
					this.name = name;
				}
				
				public String getAttr() {
					return attr;
				}
				
				public void setAttr(String attr) {
					this.attr = attr;
				}
				
				public String getGroup() {
					return group;
				}
				
				public void setGroup(String group) {
					this.group = group;
				}
				
				
			}

		}
	}
}

// package com.santander.security.common.util;
//
// import java.util.ArrayList;
// import java.util.List;
//
// import org.springframework.boot.context.properties.ConfigurationProperties;
// import org.springframework.context.annotation.Configuration;
//
// @Configuration
// @ConfigurationProperties(prefix = "role")
// public class RolesProperties {
//
// private List<Role> list = new ArrayList<Role>();
//
// public List<Role> getList() {
// return list;
// }
//
// public void setList(List<Role> list) {
// this.list = list;
// }
//
// public Role findByName(String name) {
// for (Role role : list) {
// if (role.getName().equals(name)) {
// return role;
// }
// }
// return null;
// }
//
//
// public static class Role {
//
// private String name;
// private String channel;
// private String operationalUID;
// private String sintraTerminal;
// private String technicalEnvironment;
// private boolean isLockable;
//
// public Role() {}
//
// public String getName() {
// return name;
// }
//
// public void setName(String name) {
// this.name = name;
// }
//
// public String getChannel() {
// return channel;
// }
//
// public void setChannel(String channel) {
// this.channel = channel;
// }
//
// public String getOperationalUID() {
// return operationalUID;
// }
//
// public void setOperationalUID(String operationalUID) {
// this.operationalUID = operationalUID;
// }
//
// public String getSintraTerminal() {
// return sintraTerminal;
// }
//
// public void setSintraTerminal(String sintraTerminal) {
// this.sintraTerminal = sintraTerminal;
// }
//
// public String getTechnicalEnvironment() {
// return technicalEnvironment;
// }
//
// public void setTechnicalEnvironment(String technicalEnvironment) {
// this.technicalEnvironment = technicalEnvironment;
// }
//
// public boolean getIsLockable() {
// return isLockable;
// }
//
// public void setIsLockable(boolean isLockable) {
// this.isLockable = isLockable;
// }
//
//
// }
//
// }
