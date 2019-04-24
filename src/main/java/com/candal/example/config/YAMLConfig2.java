package com.candal.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@EnableConfigurationProperties
//@ConfigurationProperties(prefix = "full-file-name")
public class YAMLConfig2 {

    	private String spPrivateKey;
    	private String spCertificate;
    	private String idpCertificate;

		public String getSpPrivateKey() {
			return spPrivateKey;
		}

		public String getSpcertificate() {
			return spCertificate;
		}
		
		public String getIdpcertificate() {
			return idpCertificate;
		}
		
		public void setSpPrivateKey(String spPrivateKey) {
			this.spPrivateKey = spPrivateKey;
		}
		
		public void setSpcertificate(String spcertificate) {
			this.spCertificate = spcertificate;
		}
		
		public void setIdpcertificate(String idpcertificate) {
			this.idpCertificate = idpcertificate;
		}
    
}

//package com.santander.security.common.util;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@ConfigurationProperties(prefix = "role")
//public class RolesProperties {
//
//  private List<Role> list = new ArrayList<Role>();
//
//  public List<Role> getList() {
//    return list;
//  }
//
//  public void setList(List<Role> list) {
//    this.list = list;
//  }
//
//  public Role findByName(String name) {
//    for (Role role : list) {
//      if (role.getName().equals(name)) {
//        return role;
//      }
//    }
//    return null;
//  }
//
//
//  public static class Role {
//
//    private String name;
//    private String channel;
//    private String operationalUID;
//    private String sintraTerminal;
//    private String technicalEnvironment;
//    private boolean isLockable;
//
//    public Role() {}
//
//    public String getName() {
//      return name;
//    }
//
//    public void setName(String name) {
//      this.name = name;
//    }
//
//    public String getChannel() {
//      return channel;
//    }
//
//    public void setChannel(String channel) {
//      this.channel = channel;
//    }
//
//    public String getOperationalUID() {
//      return operationalUID;
//    }
//
//    public void setOperationalUID(String operationalUID) {
//      this.operationalUID = operationalUID;
//    }
//
//    public String getSintraTerminal() {
//      return sintraTerminal;
//    }
//
//    public void setSintraTerminal(String sintraTerminal) {
//      this.sintraTerminal = sintraTerminal;
//    }
//
//    public String getTechnicalEnvironment() {
//      return technicalEnvironment;
//    }
//
//    public void setTechnicalEnvironment(String technicalEnvironment) {
//      this.technicalEnvironment = technicalEnvironment;
//    }
//
//    public boolean getIsLockable() {
//      return isLockable;
//    }
//
//    public void setIsLockable(boolean isLockable) {
//      this.isLockable = isLockable;
//    }
//
//
//  }
//
//}
